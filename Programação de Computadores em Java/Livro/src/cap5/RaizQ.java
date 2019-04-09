package cap5;

/********************************************************
*                                                       *
*     Calculo aproximado da raiz quadrada               *
*     pelo metodo de aproximacoes sucessivas de Newton  *
*-------------------------------------------------------*/

class RaizQ 
{ final static double e = 0.0001;

  public static double raizq (double x)
  { double y = x;
    while (! fim(y,x)) y = melhore(y,x);
    return y; }

  static private boolean fim (double y, double x)
  { return Math.abs(y * y - x) < e; }

  static private double melhore (double y, double x) 
  { return (y + x/y) / 2; }
}