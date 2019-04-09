package cap13;

/***********************************************************
*                Exemplo_substring.java                    * 
*                                                          *
*        Exemplo de uso de metodos da classe String        *
*----------------------------------------------------------*/
import java.io.PrintStream;

class Exemplo_substring
{ public static void main (String[] a)
  { PrintStream tela = System.out;
    tela.println("xpto".substring(1)); // "pto"
    tela.println("xpto".substring(4)); // 
    /* tela.println("xpto".substring(5)); ArrayIndexOutOfBounds */

     tela.println("xpto".substring(0,2)); // "xp"
     tela.println("xpto".substring(0,3)); // "xpt"
     tela.println("xpto".substring(0,4)); // "xpto"
     /* tela.println("xpto".substring\/}(0,5)); ArrayIndexOutOfBounds} */
  }
}