program LangC_Capstone;

{$mode objfpc}{$H+}

uses
  {$IFDEF UNIX}{$IFDEF UseCThreads}
  cthreads,
  {$ENDIF}{$ENDIF}
  Classes
  { you can add units after this };

const TAB = ^I;
var Look: char;

procedure getChar;
begin
  Read(Look);
end;

procedure Error(s: string);
begin
     WriteLn;
     WriteLn(^G, 'Error: ', s, '.');
end;

procedure Abort(s: string);
begin
     Error(s);
     Halt;
end;

procedure Expected(s: string);
begin
     Abort(s + ' Expected');
end;

procedure Match(x: char);
begin
     if Look = x then GetChar
     else Expected('''' + x + '''');
end;

function IsAlpha(c: char): boolean;
begin
     IsAlpha := upcase(c) in ['A'..'Z'];
end;

function IsDigit(c: char): boolean;
begin
     IsDigit := c in ['0'..'9'];
end;

function GetName: char;
begin
     if not IsAlpha(Look) then Expected('Name');
     GetName := UpCase(Look);
     GetChar;
end;

function GetNum: char;
begin
     if not IsDigit(Look) then Expected('Integer');
     GetNum := look;
     GetChar;
end;

procedure Emit(s: string);
begin
     Write(TAB, s);
end;

procedure Init;
begin
     GetChar;
end;

procedure Expression;
begin
     EmitLn('Move #' + GetNum + ',DO')
end;

begin
       Init;
end.

