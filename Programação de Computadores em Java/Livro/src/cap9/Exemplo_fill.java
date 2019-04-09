package cap9;

/**************************************************************
*                Exemplo_fill.java                            * 
* Exemplo de uso do metodo fill para inicializacao de arranjo *
*                                                             *
*-------------------------------------------------------------*/

import java.util.*;
import ArranjoDeInteiros;
import ArranjoDeBooleanos;

class Exemplo_fill
{ 
  public static void main(String[] a)
  { int tam = 10; // Tamanho usado para os arranjos, caso nenhum valor
                  // seja fornecido na iniciacao do programa
    if (a.length != 0)
       tam = Integer.parseInt(a[0]);

    ArranjoDeInteiros a1 = new ArranjoDeInteiros(tam);
    ArranjoDeBooleanos a2 = new ArranjoDeBooleanos (tam);

    Arrays.fill(a1.a,1); 
    Arrays.fill(a2.a,true);

    a1.print(System.out);
    a2.print(System.out); }
}