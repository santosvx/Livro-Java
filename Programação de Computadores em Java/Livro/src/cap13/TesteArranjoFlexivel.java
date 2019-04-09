package cap13;

/************************************************************
*                                                           *
*         TesteArranjoFlexivel.java                         *
*                                                           *
*  Testa insercao de elementos em arranjo flexivel ordenado *
*-----------------------------------------------------------*/
import ArranjoFlexivelOrdenado;

class TesteArranjoFlexivel
{ public static void main(String[] args)
  { int[] a = {10,8,6,4,2,9,7,5,3,1};
    ArranjoFlexivelOrdenado o = new ArranjoFlexivelOrdenado(a);
    for (int i=0; i<o.size(); i++)
        System.out.println(((Integer) o.elementAt(i)).intValue()); } 
}