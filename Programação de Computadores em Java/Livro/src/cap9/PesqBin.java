package cap9;

/*******************************************************
*                PesBin.java                           * 
*   Pesquisa binaria em arranjo ordenado:              *
*   Teste: pesquisa pelo valor 10 no arranjo ordenado  *
*   passado como argumento na iniciacao do programa    *
*------------------------------------------------------*/

class PesqBin
{ 
  static int pesqBin (int[] a, int x)
  { int inicio=0, fim=a.length-1, i = (inicio+fim)/2, v;
    do 
      { v = a [i]; 
        if      (x == v)    return i; 
        else if (x <  v)    fim    = i-1;
        else /* (x >  v) */ inicio = i+1; 
        i = (inicio + fim) / 2; } 
    while (inicio <= fim); 
    return -1; // -1 indica que x nao se encontra em a
  }

 public static void main (String[] a)
 { int[] b = new int [a.length];

   for (int i=0; i < b.length; i++)
     b[i] = Integer.parseInt(a[i]);

   System.out.println(pesqBin(b,10));
 }
}