package cap13;

/******************************************************
*                                                     *
*                 ExemploIterator.java                *
*                                                     *
*  Exemplo de uso de metodos da interface Iterator    *
*-----------------------------------------------------*/
import java.util.*;

class ExemploIterator
{ public static void main(String[] a)
  { LinkedList l = new LinkedList();

    l.add("1"); 
    l.add("2"); 
    l.add("3");

    Iterator i = l.iterator();
    System.out.println(i.next());
    System.out.println(i.next()); 
    System.out.println(l.size());
    i.remove();
    System.out.println(l.size());
    i.remove(); /* ocorre excecao */ 
  }
}