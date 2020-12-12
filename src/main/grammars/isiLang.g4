grammar isiLang;

// EDIT Claudio 08.12.2020 : Mexi nas operações aritméticas. Inseri suporte às operações lógicas.
// TODO: Parar de usar literais nas regras sintáticas quando se poderia introduzir um token.
// TODO: Renomear as regras para algo mais intuitivo de usar.
// TODO: Remover os exemplos de operação aritmética que eu introduzi e escolher um.

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
    : 'se' '(' exprLogic1 ')'
        'entao' '{' cmd+ '}'
        ('senao' '{' cmd+ '}' )?
    ;

cmdExpr
    : Id ':=' expr
    ;

expr
    : exprAritm
    | exprLogic1
    ;

exprLogic1 // Criado na maneira ANTLR4. Se quiser, reescrevam eliminando recursividade.
    : exprAritm Op_rel exprAritm exprLogic2
    | 'not' exprLogic1 exprLogic2
    | '(' exprLogic1 ')' exprLogic2
    | LiteralLógico exprLogic2
    | Id exprLogic2
    ;

exprLogic2
    : Op_log exprLogic1 exprLogic2

exprAritm
    : expr2
    ;

//Esta é a maneira ANTLR4 de lidar com recursões a esquerda e respeitando a precedência. Limpa e sem adaptações.
expr2
    : expr2 ('*' | '/') expr2
    | expr2 ('+' | '-') expr2
    | '(' expr2 ')'
    | Num
    | Id
    ;

// ANTLR *TAMBÉM* aceita essas regras como elas estão, ele só falha quando tem recursividade à esquerda indireta
// Esse é a maneira original deixada no pdf
expr3
    : expr3 '+' termo3
    | expr3 '–' termo3
    | termo3
    ;

termo3
    : termo3 '*' fator3
    | termo3 '/' fator3
    | fator3
    ;

fator3
    : Num
    | Id
    | '(' expr ')'
    ;

// Agora vamos fazer aquilo que o professor espera para livrar a gramática de recursão pra ganhar nota
expr4
    : termo4 (('+' | '-') termo4)*
    ;

termo4
    : fator4 (('*' | '/') fator4)*
    ;

fator4
    : Num
    | Id
    | '(' expr ')'
    ;


//TOKENS:
Op_rel
    : '<'
    | '>'
    | '<='
    | '>='
    | '!='
    | '=='
    ;

Op_log
    : '&&'
    | '||'
    ;

Texto
    : [0-9a-zA-Z]+
    ;

LiteralLógico
    : 'Verdadeiro'
    | 'Falso'
    ;

Num
    : [0-9]+
    ;

Id
    : [a-zA-Z] [0-9a-zA-Z]*
    ;
