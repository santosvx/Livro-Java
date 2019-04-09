package cap13;

/******************************************************
*                                                     *
*                 ExemploVector.java                  *
*                                                     *
*        Exemplo de uso de metodos da classe Vector,  *
*        que implementa arranjos flexiveis            *
*-----------------------------------------------------*/
import java.util.Vector;

class ExemploVector
{ public static void main(String[] a)
  { Vector v = new Vector(2,2); 
     // arranjo flexivel criado com tamanho inicial igual a 0,
     // capacidade inicial igual a 2 e valor de incremento igual a 2

    System.out.println("Tamanho inicial: " + v.size()); 
    System.out.println("Capacidade inicial: " + v.capacity());

    v.addElement(new Integer(1)); 
    v.addElement(new Integer(2)); 
    v.addElement(new Integer(3)); 
    System.out.println("Tamanho apos insercao: " + v.size()); 
    System.out.println("Capacidade apos insercao: " + v.capacity());

    v.insertElementAt(new Integer(4),1); 
    v.insertElementAt(new Integer(5),2); 
    v.insertElementAt(new Integer(6),3); 
    System.out.println("Tamanho apos insercao: " + v.size());
    System.out.println("Capacidade apos insercao: " + v.capacity());

    System.out.print("Elementos no vetor $v$: "); 
    for (int i=0; i<v.size(); i++) 
        System.out.print(v.elementAt(i)+" "); 
    System.out.println();
  } 
}