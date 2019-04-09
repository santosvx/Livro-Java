package cap3;

/********************************************************
*                                    			*
*                    Primeiros exemplos                 *
*                                                       *
*      Operacoes simples com valores basicos            *
*-------------------------------------------------------*/

class PrimeirosExemplos
{ 
static int quadrado (int x) 
  { return x*x; }

  static int somaDosQuadrados (int x, int y)
  { return (quadrado(x) + quadrado(y)); }

  static boolean tresIguais (int a, int b, int c) 
  { return ((a==b) && (b==c)); }

  static boolean eTriang (int a, int b, int c) 
  // a, b e c positivos e                        \\
  // cada um menor do que a soma dos outros dois \\
  { return (a>0) && (b>0) && (c>0) &&
           (a<b+c) && (b<a+c) && (c<a+b); }

  static int max (int a, int b) 
  { if (a>=b) return a; else return b; } 

  static int max3 (int a, int b, int c) 
  { return (max(max(a,b),c)); } 
}