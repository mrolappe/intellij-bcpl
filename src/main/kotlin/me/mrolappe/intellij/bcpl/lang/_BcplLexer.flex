package me.mrolappe.intellij.bcpl.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static me.mrolappe.intellij.bcpl.lang.psi.BcplTypes.*;

%%

%{
  public _BcplLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _BcplLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=[ \t\n\x0B\f\r]+
BLOCK_COMMENT="/"\*(.|\n)*?\*"/"
LINE_COMMENT="//".*
INTEGER_CONSTANT=[0-9]+|#[0-7]+|#x[0-9A-F]+
CHARACTER_CONSTANT=('[^'*]')|('\*[BbNnPpSsTt'*]')
STRING_CONSTANT=\"[^\"]*\"
IDENTIFIER=[A-Za-z][A-Za-z_]*

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return WHITE_SPACE; }

  ":="                        { return ASSIGN; }
  ","                         { return COMMA; }
  "="                         { return EQUALS; }
  "{"                         { return LBRACE; }
  "("                         { return LPAREN; }
  "<<"                        { return LSHIFT; }
  "-"                         { return MINUS; }
  "}"                         { return RBRACE; }
  ")"                         { return RPAREN; }
  ">>"                        { return RSHIFT; }
  "/"                         { return SLASH; }
  "*"                         { return STAR; }
  "AND"                       { return AND; }
  "BE"                        { return BE; }
  "BREAK"                     { return BREAK; }
  "CASE"                      { return CASE; }
  "DO"                        { return DO; }
  "ELSE"                      { return ELSE; }
  "ENDCASE"                   { return ENDCASE; }
  "FOR"                       { return FOR; }
  "GET"                       { return GET; }
  "GLOBAL"                    { return GLOBAL; }
  "IF"                        { return IF; }
  "INTO"                      { return INTO; }
  "LET"                       { return LET; }
  "MANIFEST"                  { return MANIFEST; }
  "REM"                       { return REM; }
  "REPEAT"                    { return REPEAT; }
  "REPEATWHILE"               { return REPEATWHILE; }
  "RESULTIS"                  { return RESULTIS; }
  "RETURN"                    { return RETURN; }
  "STATIC"                    { return STATIC; }
  "SWITCHON"                  { return SWITCHON; }
  "TABLE"                     { return TABLE; }
  "TEST"                      { return TEST; }
  "THEN"                      { return THEN; }
  "TO"                        { return TO; }
  "UNLESS"                    { return UNLESS; }
  "UNTIL"                     { return UNTIL; }
  "VALOF"                     { return VALOF; }
  "WHILE"                     { return WHILE; }
  "vector_definition"         { return VECTOR_DEFINITION; }
  "function_definition"       { return FUNCTION_DEFINITION; }
  "routine_definition"        { return ROUTINE_DEFINITION; }
  "PLUS"                      { return PLUS; }
  "command"                   { return COMMAND; }
  "conditional_expression"    { return CONDITIONAL_EXPRESSION; }
  "TRUE"                      { return TRUE; }
  "FALSE"                     { return FALSE; }

  {WHITE_SPACE}               { return WHITE_SPACE; }
  {BLOCK_COMMENT}             { return BLOCK_COMMENT; }
  {LINE_COMMENT}              { return LINE_COMMENT; }
  {INTEGER_CONSTANT}          { return INTEGER_CONSTANT; }
  {CHARACTER_CONSTANT}        { return CHARACTER_CONSTANT; }
  {STRING_CONSTANT}           { return STRING_CONSTANT; }
  {IDENTIFIER}                { return IDENTIFIER; }

}

[^] { return BAD_CHARACTER; }
