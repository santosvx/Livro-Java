package cap5;

/********************************************************
*                                                       *
*            Fatorial.java                              *
*                                                       *
*      fat   - fatorial - versao iterativa              *
*      fatr  - fatorial - versao recursiva              *
*      fatr1 - fatorial - versao recursiva alternativa  *
*-------------------------------------------------------*/

class Fatorial
{ static int fat (int n)
  { int f=1;
    for (int i=1; i<=n; i++) f*=i;
    return f; }

  static int fatr (int n) 
  { if (n==0) return 1;
    else return n * fatr(n-1); }

  static private int fatIter (int n, int i, int f)
  { if (i>n) return f;
    else return fatIter(n, i+1, f*i); }

  static int fatr1 (int n)
  { return fatIter (n,1,1); }
}