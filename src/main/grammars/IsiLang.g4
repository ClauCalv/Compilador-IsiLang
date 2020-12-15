grammar IsiLang;

// EDIT Claudio 08.12.2020 : Mexi nas operações aritméticas. Inseri suporte às operações lógicas.
// TODO: Renomear as regras para algo mais intuitivo de usar. WHELP -Daniel

// EDIT Daniel e Ricardo 13.12.2020 : Retiramos todos os literais, incluímos um comando de while e resolvemos dois itens do TODO

// EDIT Claudio 14.12.2020 : Adicionei suporte a texto. Mexi nos IFs. Organizei os tokens em categorias.

prog
    : BEGIN declara bloco END END_CMD
    ;

declara
    : DECL varDeclare (SEP varDeclare)* END_CMD
    ;

varDeclare
    : ID (ATTR expr)?
    ;

bloco
    : (cmd END_CMD)+
    ;

cmd
    : cmdLeitura
    | cmdEscrita
    | cmdAttrib
    | cmdIf
    | cmdWhile
    ;

cmdLeitura
    : CMD_RD AP ID FP
    ;

cmdEscrita
    : CMD_WT AP ( expr ) FP
    ;

cmdIf
    : CMD_IF AP exprLogic FP
        CMD_THEN thenCmd
        (CMD_ELSE elseCmd )?
    ;

thenCmd
    : cmdBlock
    ;

elseCmd
    : cmdBlock
    ;

cmdBlock
    : AC bloco FC
    | cmd
    ;

cmdAttrib
    : ID ATTR expr
    ;

cmdWhile
    : CMD_WHILE AP exprLogic FP
        CMD_DO cmdBlock
    ;

expr
    : exprText
    | exprLogic
    | exprAritm
    ;

exprText
    : exprText1 exprText2?
    ;

exprText1
    : stringTypeCast
    | stringLiteral
    | id
    ;

id
    : ID
    ;

stringTypeCast
    : CMD_TEXT AP expr FP
    ;

stringLiteral
    : TEXT_LITERAL
    ;

exprText2
    : CONCAT_OP exprText
    ;

exprLogic
    : exprLogic1 exprLogic2?
    ;

exprLogic1
    : aritmRelation
    | log_negation
    | parent_logic
    | bool_literal
    | id
    ;

aritmRelation
    : ex1=exprAritm REL_OP ex2=exprAritm
    ;

log_negation
    : NOT_OP exprLogic
    ;

parent_logic
    : AP exprLogic FP
    ;

bool_literal
    : LOGIC_LITERAL
    ;

exprLogic2
    : LOG_OP exprLogic
    ;

exprAritm
    : exprAritm2 (ARIT_L exprAritm2)*
    ;

exprAritm2
    : exprAritm3 (ARIT_H exprAritm3)*
    ;

exprAritm3
    : numLit
    | id
    | numParen
    | numCast
    ;

numLit
    : NUMERIC_LITERAL
    ;

numParen
    : AP exprAritm FP
    ;

numCast
    : CMD_NUM AP expr FP
    ;


////// TOKENS:

// Operadores:

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
    : '!' //Era 'não'
    ;

CONCAT_OP // Estou criando agora
    : '++'
    ;

// Comandos:

CMD_TEXT // Estou criando agora
    : 'texto'
    ;

CMD_NUM
    : 'num'
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

// ID e Literais:

ID
    : ALPHABETIC (ALPHABETIC | NUMERIC | '_')*
    ;

TEXT_LITERAL
    : TEXT_DECL TEXT_ELEM* TEXT_DECL
    ;

fragment
TEXT_ELEM
    : ~["\\] // TUDO MENOS ASPAS E BARRA
    | '\\' ["\\] // OU ASPAS E BARRA COM UMA BARRA ATRÁS
    ;

fragment
TEXT_DECL
    : '"'
    ;

LOGIC_LITERAL
    : 'Verdadeiro'
    | 'Falso'
    ;

NUMERIC_LITERAL
    : NUM_INT
    | NUM_DEC
    ;

fragment
NUM_INT
    : NUMERIC+
    ;

fragment
NUM_DEC
    : NUMERIC+ SEP NUMERIC+
    ;

fragment
NUMERIC
    : [0-9]
    ;

fragment
ALPHABETIC
    : [a-zA-Z]
    ;

// Outros tokens:

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

END_CMD
    : '.'
    ;

SEP
    : ','
    ;

WP
    : (' '
    | '\n'
    | '\t'
    | '\r') -> skip;

