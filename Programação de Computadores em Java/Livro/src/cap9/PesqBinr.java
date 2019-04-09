package cap9;

/********************************************************
*                PesBinr.java                           * 
* Pesquisa binaria em arranjo, definida recursivamente. *
* Teste: pesquisa pelo valor 10 em uma arranjo ordenado *
* passado como argumento na iniciacao do programa       *
*-------------------------------------------------------*/

class PesqBinr
{
  static int pesqBinr (int[] a, int x)
  { return pesqBinRec (a, x, 0, a.length-1); }

  static int pesqBinRec (int[] a, int x, int inicio, int fim)
  { if (inicio>fim) return -1; // -1 indica pesquisa sem sucesso
 
    int meio = (inicio+fim)/2, v = a[meio];
    if (x==v) return meio;
    else if (x<v) return pesqBinRec(a, x, inicio, meio-1);
    else /* (x>v) */ return pesqBinRec(a, x, meio+1, fim);
  }

  public static void main (String[] a)
  { int[] b = new int [a.length];

    for (int i=0; i < b.length; i++)  b[i] = Integer.parseInt(a[i]);

    System.out.println(pesqBinr(b,10));
  }
}