grammar isiLang;

// EDIT Claudio 08.12.2020 : Mexi nas operações aritméticas. Inseri suporte às operações lógicas.
// TODO: Parar de usar literais nas regras sintáticas quando se poderia introduzir um token.
// TODO: Renomear as regras para algo mais intuitivo de usar.
// TODO: Remover os exemplos de operação aritmética que eu introduzi e escolher um.

prog
    : 'programa' declara bloco 'fimprog' '.'
    ;

declara
    : 'declare' ID (',' ID)* '.'
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
    : 'leia' AP ID FP;

cmdEscrita
    : 'escreva'( TEXT | ID ) ;

cmdIf
    : 'se' AP exprLogic FP
        'entao' AC cmd+ FC
        ('senao' AC cmd+ FC )?
    ;

cmdExpr
    : ID ATTR expr
    ;

expr
    : exprAritm
    | exprLogic
    ;

exprLogic // Criado na maneira ANTLR4. Se quiser, reescrevam eliminando recursividade.
    : exprAritm REL_OP exprAritm exprLogic2
    | 'not' exprLogic exprLogic2
    | AP exprLogic FP exprLogic2
    | LOGIC_LITERAL exprLogic2
    | ID exprLogic2
    ;

exprLogic2
    : LOG_OP exprLogic exprLogic2
    ;

exprAritm
    : expr4
    ;

expr4
    : termo4 (('+' | '-') termo4)*
    ;

termo4
    : fator4 (('*' | '/') fator4)*
    ;

fator4
    : NUM
    | ID
    | AP expr FP
    ;


//TOKENS:

ATTR
    : ':='
    ;

REL_OP
    : '<'
    | '>'
    | '<='
    | '>='
    | '!='
    | '=='
    ;

LOG_OP
    : '&&'
    | '||'
    ;

TEXT
    : [0-9a-zA-Z]+
    ;

LOGIC_LITERAL
    : 'Verdadeiro'
    | 'Falso'
    ;

AP
    : '('
    ;

FP
    : ')'
    ;

AC
    : '{'
    ;

FC
    : '}'
    ;

NUM
    : [0-9]+
    ;

ID
    : [a-zA-Z] [0-9a-zA-Z]*
    ;

WP
    : (' '
    | '\n'
    | '\t'
    | '\r') -> skip;