program LangC_Capstone;

{$mode objfpc}{$H+}

uses
  {$IFDEF UNIX}{$IFDEF UseCThreads}
  cthreads,
  {$ENDIF}{$ENDIF}
  Classes
  { you can add units after this };

type
    FileIO = class
const TAB = ^I;
var Look: char;

public
   constructor create;
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
     Write(TAB, s);
end;

procedure FileIO.Init;
begin
     GetChar;
end;


type
    ExpressionParsing = class
public
   procedure ExpressionParse;

end;
var parse: ExpressionParsing;

procedure ExpressionParsing.ExpressionParse;
begin
     io.Emit('Move #' + io.GetNum + ',DO')
end;

begin
       io := FileIO.create;
       io.Init;
end.

