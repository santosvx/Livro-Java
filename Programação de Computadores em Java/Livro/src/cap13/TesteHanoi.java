package cap13;

/**********************************************
*                                             *
*            TesteHanoi.java                  *
*                                             *
*  Teste do programa das Torres de Hanoi      *
*---------------------------------------------*/
import java.util.LinkedList;
import Hanoi;
import Torre;

class TesteHanoi
{ public static void main (String[] a)
  { int n = Integer.parseInt(a[0]);
    LinkedList dA = new LinkedList();
    LinkedList dB = null; LinkedList dC = null; 
    
    for (int i=1; i<=n; i++) dA.add(new Integer(i));
    Torre tA = new Torre("A", dA);
    Torre tB = new Torre("B", dB);
    Torre tC = new Torre("C", dC);

    Hanoi.move(tA,tB,tC);
  }
}