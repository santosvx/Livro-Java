package cap13;

/********************************************************
*                                                       *
*         ArranjoFlexivelOrdenado.java                  *
*                                                       *
*  Classe que implementa um arranjo ordenado usando     *
*  um arranjo flexivel subclasse da classe Vector       *
*-------------------------------------------------------*/
import java.util.Vector;

public class ArranjoFlexivelOrdenado extends Vector
{ public void ins (int x)
  { int i=0;
    while (i<this.size() && ((Integer)this.elementAt(i)).intValue() <= x) i++; 
    this.insertElementAt(new Integer(x),i); }

  public ArranjoFlexivelOrdenado (int[] a)
  { int n = a.length;
    elementData = new Object[n];
    for (int i=0; i<n; i++) ins(a[i]); }  
}

class TesteArranjoFlexivel
{ public static void main(String[] args)
  { int[] a = {10,8,6,4,2,9,7,5,3,1};
    ArranjoFlexivelOrdenado o = new ArranjoFlexivelOrdenado(a);
    for (int i=0; i<o.size(); i++)
        System.out.println(((Integer) o.elementAt(i)).intValue()); } 
}