grammar isiLang;

// EDIT Claudio 08.12.2020 : Mexi nas operações aritméticas. Inseri suporte às operações lógicas.
// TODO: Renomear as regras para algo mais intuitivo de usar. WHELP -Daniel

// EDIT Daniel e Ricardo 13.12.2020 : Retiramos todos os literais, incluímos um comando de while e resolvemos dois itens do TODO

prog
    : BEGIN declara bloco END END_CMD
    ;

declara
    : DECL ID (SEP ID)* END_CMD
    ;

bloco
    : (cmd END_CMD)+
    ;

cmd
    : cmdLeitura
    | cmdEscrita
    | cmdExpr
    | cmdIf
    ;

cmdLeitura
    : CMD_RD AP ID FP;

cmdEscrita
    : 'escreva'( TEXT | ID ) ;

cmdIf
    : CMD_IF AP exprLogic FP
        CMD_THEN AC cmd+ FC
        (CMD_ELSE AC cmd+ FC )?
    ;

cmdExpr
    : ID ATTR expr
    ;

cmdWhile
    : CMD_WHILE AP exprLogic FP
        CMD_DO AC bloco FC
    ;

expr
    : exprAritm
    | exprLogic
    ;

exprLogic // Criado na maneira ANTLR4. Se quiser, reescrevam eliminando recursividade.
    : exprAritm REL_OP exprAritm exprLogic2
    | NOT_OP exprLogic exprLogic2
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
    : termo4 (ARIT_L termo4)*
    ;

termo4
    : fator4 (ARIT_H fator4)*
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

ARIT_H
    : '*'
    | '/'
    ;

ARIT_L
    : '+'
    | '-'
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

NOT_OP
    : 'nao'
    ;

TEXT
    : [0-9a-zA-Z]+
    ;

LOGIC_LITERAL
    : 'Verdadeiro'
    | 'Falso'
    ;

CMD_IF
    : 'se'
    ;

CMD_THEN
    : 'entao'
    ;    

CMD_ELSE
    : 'senao'
    ;

CMD_WHILE
    : 'enquanto'
    ;

CMD_DO
    : 'faca'
    ;

CMD_RD
    : 'leia'
    ;

CMD_WT
    : 'escreva'
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
    : NUM_INT
    | NUM_DEC
    ;

NUM_INT
    : [0-9]+
    ;

NUM_DEC
    : [0-9]+ SEP [0-9]+

ID
    : [a-zA-Z] [0-9a-zA-Z]*
    ;

WP
    : (' '
    | '\n'
    | '\t'
    | '\r') -> skip;

END_CMD
    : '.'
    ;

SEP
    : ','
    ;

BEGIN
    : 'programa'
    ;

END 
    : 'fimprog'
    ;

DECL
    : 'declare'
    ;