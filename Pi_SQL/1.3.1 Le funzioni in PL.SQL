----- LE funzioni ------

Link di riferimento: http://www.w3ii.com/it/plsql/plsql_functions.html

Le funzioni in PL/SQL sono uguali alle procedure con la differenza che ques'ultime restituiscono un valore.
La sintassi per scrivere una funzione é:  
"
CREATE OR REPLACE FUNCTION miaFunzione
RETURN number IS
   numeroAnagrafica number(2) := 0;
BEGIN
   SELECT count(*)
   into numeroAnagrafica
   FROM ANAGRAFICA;
   
   RETURN numeroAnagrafica;
END;
/
"  
//********   Chiamata ad una funzione   *******

Quando si crea una funzione, si da definizione di ciò che la funzione deve fare.

Per Eseguire questa funzione bisognerà richiamarla per farla partire.

Possiamo in un blocco anonimo richiamare una funzione(cone passaggio di parametri se ce n'è bisogno), e se la funzione restituisce un ristituisce un risultato è possibile fare  un assegnazione per immagazinare il numero.
Per esempio:

  DECLARE
    c number(20);
  BEGIN
    c:=miaFunzione();
  END;
 /
