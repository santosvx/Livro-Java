package cap9;

/*************************************************************
*                TesteQuicksort.java                         * 
*  Teste de ordenacao usando o metodo quicksort              *
*  ordena um arranjo de inteiros cujos elementos sao valores *
*  gerados aleatoriamante meio do uso do metodo random       *
*------------------------------------------------------------*/
import ArranjoDeInteiros;

class TesteQuicksort
{ 
  public static void main (String[] a)
  { int n = Integer.parseInt(a[0]);
    ArranjoDeInteiros x = new ArranjoDeInteiros(n);
    
    for (int i=0; i<n; i++) x.a[i] = (int) (Math.random() * Integer.MAX_VALUE); 
    x.print(System.out);

    x.ordena();

    x.print(System.out); 
  }
}