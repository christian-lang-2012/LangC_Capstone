program LangC_Capstone;

{$mode objfpc}{$H+}

uses Crt,
  {$IFDEF UNIX}{$IFDEF UseCThreads}
  cthreads,

  {$ENDIF}{$ENDIF}
  Classes
  { you can add units after this };


type
    FileIO = class
const TAB = ^I;
const headerTest = ':alproject:';
var Look: char;
var filein: text;
var inputString: String;
var isFirstLine: Boolean;


public
   constructor create;
   procedure checkForCorrectHeader;
   procedure getChar;
   procedure Error(s: string);
   procedure Abort(s: string);
   procedure Expected(s: string);
   procedure Match(x: char);
   function IsAlpha(c: char): boolean;
   function IsDigit(c: char): boolean;
   function GetName: char;
   function GetNum: char;
   procedure Emit(s: string);
   procedure Init;
end;


var io: FileIO;

constructor FileIO.create;
begin
     assign(filein, 'C:\Users\Christian\LangC_Capstone\LangC_HolderFolder\LangC_DocumentationFolder\SampleAL.txt');
     isFirstLine := True;
end;

procedure FileIO.checkForCorrectHeader;
begin
     try
       Reset(filein);
       repeat
         Readln(filein, inputString);

         if(isFirstLine = True) and (inputString = ':alproject:') then begin
             WriteLn(inputString);
             isFirstLine := False;
         end
         else if(isFirstLine = True) and not(inputString = ':alProject:') then begin
             WriteLn('Invalid File Header');
             Break;
         end else if(isFirstLine = False) then
              WriteLn(inputString);

       until(EOF(filein));
       CloseFile(filein);
       except
         (*
         on E: EInOutError do
         begin
           Writeln('File handling error occurred. Details: ' + E.ClassName+'/'+E.Message);
         end;
       end;*)
       WriteLn('Reading finished. Press Enter to Stop.');
       Readln;
     end;
end;

procedure FileIO.getChar;
begin
  Read(Look);
end;

procedure FIleIO.Error(s: string);
begin
     WriteLn;
     WriteLn(^G, 'Error: ', s, '.');
end;

procedure FileIO.Abort(s: string);
begin
     Error(s);
     Delay(5000);
     Halt;

end;

procedure FileIO.Expected(s: string);
begin
     Abort(s + ' Expected');
end;

procedure FileIO.Match(x: char);
begin
     if Look = x then GetChar
     else Expected('''' + x + '''');
end;

function FileIO.IsAlpha(c: char): boolean;
begin
     IsAlpha := upcase(c) in ['A'..'Z'];
end;

function FileIO.IsDigit(c: char): boolean;
begin
     IsDigit := c in ['0'..'9'];
end;

function FileIO.GetName: char;
begin
     if not IsAlpha(Look) then Expected('Name');
     GetName := UpCase(Look);
     GetChar;
end;

function FileIO.GetNum: char;
begin
     if not IsDigit(Look) then Expected('Integer');
     GetNum := look;
     GetChar;
end;

procedure FileIO.Emit(s: string);
begin
     WriteLn(TAB, s);
end;

procedure FileIO.Init;
begin
     GetChar;
end;


type
    ExpressionParsing = class
public
   constructor create;
   procedure Term;
   procedure Add;
   procedure Subtract;
   procedure Multiply;
   procedure Divide;
   procedure MathFactor;
   procedure ExpressionParse;
end;

var parse: ExpressionParsing;

constructor ExpressionParsing.create;
begin
     (*Do nothing*)
end;

procedure ExpressionParsing.Term;
begin
     MathFactor;
     while io.Look in ['*', '/'] do begin
       io.Emit('MOVE D0,-(SP)');
       case io.Look of
       '*': Multiply;
       '/': Divide;
       else io.Expected('Multiplication or Division Operator');
       end;
     end;

     io.Emit('MOVE #,' + io.GetNum + ',D0');
end;

procedure ExpressionParsing.Add;
begin
     io.Match('+');
     Term;
     io.Emit('ADD (SP)+,D0');
end;

procedure ExpressionParsing.Subtract;
begin
     io.Match('-');
     Term;
     io.Emit('SUB (SP)+,D0');
     io.Emit('NEG D0');
end;

procedure ExpressionParsing.Multiply;
begin
    io.Match('*');
    MathFactor;
    io.Emit('MULS (SP)+,D0');
end;

procedure ExpressionParsing.Divide;
begin
    io.Match('/');
    MathFactor;
    io.Emit('Move (SP)+,D1');
    io.Emit('DIVS D1,D0');
end;

procedure ExpressionParsing.MathFactor;
begin
     io.Emit('Move #' + io.GetNum + ',D0');
end;

procedure ExpressionParsing.ExpressionParse;
begin
     Term;
     while io.Look in ['+', '-'] do
     begin
           io.Emit('MOVE D0,-(SP)');
           case io.Look of
           '+': Add;
           '-': Subtract;
           else io.Expected('Addition or Subtraction Operator');
           end;
     end;
end;
begin
     io := FileIO.create;
     parse := ExpressionParsing.create;
     io.Init;
     parse.ExpressionParse;
     Delay(5000);
end.

