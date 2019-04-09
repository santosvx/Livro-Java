package cap13;

/*******************************************************
*                                                      *
*            ExemploListIterator.java                  *
*                                                      *
*  Exemplo de uso de metodos da interface ListIterator *
*------------------------------------------------------*/
import java.util.*;

class ExemploListIterator
{ public static void main(String[] a)
  { LinkedList l = new LinkedList();

    l.add("1"); 
    l.add("2"); 
    l.add("3");

    ListIterator i = l.listIterator();
    System.out.println(i.next());
    System.out.println(i.next()); 
    System.out.println(l.size());

    i.remove();
    System.out.println(l.size());

    i.previous(); 
    i.remove();
    System.out.println(i.next());
  }
}