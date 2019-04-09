package cap5;

/********************************************************
*                                                       *
*            Arit.java                                  *
*                                                       *
*  mult  - multiplicacao - versao iterativa             *
*  multr - multiplicacao - versao recursiva             *
*  exp   - exponenciacao - versao iterativa             *
*  expr  - exponenciacao - versao recursiva             *
*-------------------------------------------------------*/

class Arit 
{ static int mult (int m, int n)
  { int r=0;
    for (int i=1; i<=n; i++) r+=m;
    return r; }

  static int multr (int m, int n) 
  { if (n==0) return 0;
    else return (m + multr(m, n-1)); }

  static int exp (int m, int n)
  { int r=1;
    for (int i=1; i<=n; i++) r*=m;
    return r; }

  static int expr (int m, int n)
  { if (n==0) return 1;
    else return (m * expr(m, n-1)); }

  static int exp2 (int m, int n)
  { if (n==0) return 1;
    else if (n%2 == 0)  // n par
            { int x = exp2(m,n/2);
               return x* x; }
         else return m * exp2(m,n-1); }
}