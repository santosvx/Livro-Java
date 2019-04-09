package cap9;

/******************************************************
*                PesSeq.java                          * 
*   Teste de pesquisa sequencial em arranjo:          *
*     pesquisa pelo valor 10 no arranjo dado como     *
*     argumento na iniciacao do programa              *
*-----------------------------------------------------*/

class PesqSeq
{ 
  static int pesqSeq (int a[], int x)
  { for (int i = 0; i < a.length; i++)
      if (a[i] == x) return i; 
    return -1; // -1 indica que x nao se encontra em a
  }

 public static void main (String[] a)
 { int[] b = new int [a.length];

   for (int i=0; i < b.length; i++)
     b[i] = Integer.parseInt(a[i]);

   System.out.println(pesqSeq(b,10));
 }
}