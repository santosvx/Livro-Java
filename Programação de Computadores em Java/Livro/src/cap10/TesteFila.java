package cap10;

/**************************************************************
*                                                             *
*                 TesteFila.java                              *
*                                                             *
*  Teste de operacoes de insercao e remocao de elementos      *
*   em uma fila, implementada pela classe Fila                *
*-------------------------------------------------------------*/

import Fila;

class TesteFila
{ 
  public static void main (String[] a)
  { Fila f = new Fila(2);
  
    try { f.insere(new Integer(1));
          f.insere(new Integer(2));
          System.out.println(f.retira());
          f.insere(new Integer(3));
          System.out.println(f.retira());
          System.out.println(f.retira());
          System.out.println(f.retira()); }
    catch (Exception e) 
        { System.out.println(e.getMessage()); }
  }
}