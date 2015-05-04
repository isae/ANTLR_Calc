grammar G;

@header{
	import java.util.*;
}

@members{
	public Map<String, Integer> values = new HashMap<String, Integer>();
}

file : r SEMICOLON (NEWLINE* r SEMICOLON)* ;
r  : ID '=' e
    {
     Integer result = $e.value;
     values.put($ID.text, result);
     System.out.println(String.format("%s = %d;", $ID.text, result));
    };
e returns[Integer value]:
    t {$value = $t.value;}
    (
        '+'   t {$value += $t.value;}
        | '-' t {$value -= $t.value;}
    )*;
t returns[Integer value]:
    f {$value = $f.value;}
    (
    '*' f {$value *= $f.value;}
    )*;
f returns[Integer value]:
    '-' f {$value = $f.value;}
    | NUM {$value = Integer.parseInt($NUM.text);}
    | ID {$value = values.get($ID.text);}
    | '(' e ')' {$value = $e.value;}
    ;

WS : [ \t \r \n]+ -> skip ;
ID : [a-z]+ ;
NUM : [0-9]+ ;
SEMICOLON: ';' ;
NEWLINE : '\r\n'|'\n'|'\r' ;
