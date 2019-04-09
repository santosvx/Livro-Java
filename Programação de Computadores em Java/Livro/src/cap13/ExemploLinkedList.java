package cap13;

/******************************************************
*                                                     *
*                 ExemploLinkedList.java              *
*                                                     *
*   Exemplo de uso de metodos da classe LinkedLis,    *
*   que implementa listas encadeadas                  *
*-----------------------------------------------------*/
import java.util.LinkedList;

class ExemploLinkedList
{ public static void main(String[] a)
  { LinkedList l = new LinkedList(); // cria uma lista vazia

    // adiciona elementos no inicio da lista 
    l.addFirst("c"); 
    l.addFirst("b");
    l.addFirst("a");

    System.out.println("Lista l = " + l); 

    // adiciona elementos no fim da lista
    l.add("d");
    l.addLast("e");

    System.out.println("Lista l = " + l); 

    // adiciona elementos entre o inicio e o fim da lista
    l.add(1,"x");

    System.out.println("Lista l = " + l); 

    // remove determinado elemento da lista
    l.remove("x");

    // remove elemento em determinado indice da lista
    l.remove(2); // tem aqui mesmo efeito que l.remove("c")

    // remove primeiro elemento
    l.removeFirst();

    // remove ultimo elemento
    l.removeLast();

    System.out.println("Lista l apos operacoes de remocao = " + l);
  } 
}