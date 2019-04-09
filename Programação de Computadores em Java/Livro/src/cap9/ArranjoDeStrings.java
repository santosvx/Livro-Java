package cap9;

/*************************************************************
*                ArranjoDeStrings.java                       * 
*  Ilustra ordenacao dos elementos de um arranjo de strings  *
*  usando o metodo de ordenacao por selecao                  *
*------------------------------------------------------------*/

import java.io.*;

class ArranjoDeStrings
{ 
  String[] a;

  ArranjoDeStrings(int n)
  { a = new String[n]; }

  ArranjoDeStrings(String[] o)
  { a = new String[o.length];
    for (int i=0; i<o.length; i++) a[i] = o[i]; } 

  void ordena() // ordenacao por selecao
  { for (int i=0; i<a.length-1; i++)
    troca(i, indMenor(i)); }

  private int indMenor (int i)
  { int m = i, j; String menor = a[m];
    for (j=i+1; j<a.length; j++)
    if (a[j].compareTo(menor) < 0) { m=j; menor=a[m]; }
    return m; }

  private void troca (int i, int j)
  { String t = a[i]; a[i]=a[j]; a[j]=t; }

  void print(PrintStream saida, int inicio, int fim)
  { for (int i=inicio; i<fim; i++)
        { saida.print(a[i]);
          saida.print(", "); }
    saida.print(a[fim]);
    saida.println('\n'); }

  void print(PrintStream saida)
  { print(saida,0,a.length-1); }
}