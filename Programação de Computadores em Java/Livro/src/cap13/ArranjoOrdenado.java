package cap13;

/********************************************************
*                                                       *
*                 ArranjoOrdenado.java                  *
*                                                       *
*  Classe que implementa um arranjo ordenado usando     *
*              um arranjo com tamnho fixo               *
*-------------------------------------------------------*/

public class ArranjoOrdenado extends ArranjoDeInteiros
{ int m;

  public ArranjoOrdenado (int n, int m) throws Exception
  { super(n); 
    if (n>=m) this.m = m;
    else throw new Exception("erro na criacao do arranjo"); }

  public void ins (int x)
  { int i=0; int j;
    while (i<m && a[i]<=x) i++;
    for (j=m; j>i; j--)
        a[j] = a[j-1];
    a[i] = x; m++; } 
}