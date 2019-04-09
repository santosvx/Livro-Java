package cap9;

/***********************************************************
*                ArranjoDeInteiros.java                    * 
*         Exemplos de operacoes sobre arranjos             *
*                                                          *
*----------------------------------------------------------*/

import java.io.*;
import Entrada;

class ArranjoDeInteiros
{ 
  int[] a;

  ArranjoDeInteiros(int n)
  { a = new int[n]; }

  public int soma()
  { int s=0, i=0;
    while (i<a.length) { s+=a[i]; i++; }
    return s; }

  public float media()
  { return this.soma() / (float) a.length; }

  public int maior()
  { int x = a[0];
    for (int i=1; i<a.length; i++)
        if (a[i] > x) x = a[i];
    return x; }
     
  public int menor()
  { int x = a[0];
    for (int i=1; i<a.length; i++)
        if (a[i] < x) x = a[i];
  return x; }

  void ordena() // ** ordenacao por quicksort
  { quicksort(0,a.length-1); }

  private void quicksort (int i, int j)
  { if (i<j)
       { int pivo = a[(i+j)/2];
         int m = divide(pivo,i,j);
         quicksort(i,m); quicksort(m+1,j); }
  }

  private int divide (int pivo, int i0, int j0)
  { int i = i0-1, j=j0+1;
    do { do {i++;} while (a[i]<pivo);
         do {j--;} while (a[j]>pivo);
         if (i<j) troca(i,j);
       } while (i<j);
    return j; 
  }

  private void troca (int i, int j)
  { int t = a[i]; a[i]=a[j]; a[j]=t; }


  void print(PrintStream saida, int inicio, int fim)
  { for (int i=inicio; i<fim; i++)
        { saida.print(a[i]);
          saida.print(", "); }
    saida.print(a[fim]);
    saida.println('\n'); }

  void print(PrintStream saida)
  { print(saida,0,a.length-1); }
      
  void read(Entrada entrada, int inicio, int fim) throws IOException
  { for (int i=inicio; i<=fim; i++)
         a[i] = entrada.leInteiro(); }

  void read(Entrada entrada) throws IOException
  { read(entrada,0,a.length-1); }

}