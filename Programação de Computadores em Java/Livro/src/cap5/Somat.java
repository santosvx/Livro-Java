package cap5;

/**************************************************
*                                                 *
*           Somat.java                            *
*                                                 *
*      --- progressao aritmetica de razao 1       *
*      pa1      - versao iterativa                *
*      par1     - versao recursiva                *
*      par1Iter - versao recursiva alternativa    *
*                                                 *
*      --- progressao geometrica                  *
*      pg - versao iterativa                      *
*                                                 *
*      --- soma da serie harmonica                *
*      somaSerieHamonica - versao iterativa       *
*                                                 *
*      --- calculo aproximado de pi               *
*      piAprox - versao iterativa                 *
*                                                 *
*      --- calculo aproximado de e^x              *
*      eExp - versao iterativa                    *
*-------------------------------------------------*/

class Somat
{ static int pa1 (int n)
  { int s=0;
    for (int i=1; i<=n; i++) s+=i;
    return s; }

  static int pa1r (int n)
  { if (n==0) return 0;
    else return n + pa1r(n-1); }

  static private int pa1Iter (int n, int i, int s)
  { if (i>n) return s;
    else return pa1Iter(n, i+1, s+i); }

  static int pa1rIter (int n) 
  { return pa1Iter(n,1,0); }

  static int pg (int n, int x)
  { int s=1, parc=x;
    for (int i=1; i<=n; i++)
        { s+=parc; parc*=x; }
    return s; } 

  static float somaSerieHarmonica (int n)
  { float s=0.0f;
    for (int i=1; i<=n; i++) s+=1/(float) i;
    return s; }

  static float piAprox (int n)
  { float s=0.0f, denom=1.0f; int sinal=1;
    for (int i=1; i<=n; i++)
        { s+=sinal/denom;
          sinal=-sinal; denom+=2; }
    return 4*s; }

  static float eExp (float x, int n)
  { float s=1.0f; int i=1;
    float numer=x; int denom=1;
    while (i<=n)
      { s+=numer/denom; 
        i++; numer*=x; denom*=i; }
    return s; } 
}