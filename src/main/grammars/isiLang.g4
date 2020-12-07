grammar isiLang;

prog
    : 'programa' declara bloco 'fimprog' '.'
    ;

declara
    : 'declare' Id (',' Id)* '.'
    ;

bloco
    : (cmd '.')+
    ;

cmd
    : cmdLeitura
    | cmdEscrita
    | cmdExpr
    | cmdIf
    ;

cmdLeitura
    : 'leia' '(' Id ')';

cmdEscrita
    : 'escreva'( Texto | Id ) ;

cmdIf
    : 'se' '(' expr Op_rel expr ')'
        'entao' '{' cmd+ '}'
        ('senao' '{' cmd+ '}' )?
    ;

cmdExpr
    : Id ':=' expr
    ;

Op_rel
    : '<'
    | '>'
    | '<='
    | '>='
    | '!='
    | '=='
    ;

expr
    : expr '+' termo
    | expr '–' termo
    | termo
    ;

termo
    : termo '*' fator
    | termo '/' fator
    | fator
    ;

fator
    : Num
    | Id
    | ( expr )
    ;

Texto
    : [0-9a-zA-Z]+
    ;

Num
    : [0-9]+
    ;

Id
    : [a-zA-Z] [0-9a-zA-Z]*
    ;
