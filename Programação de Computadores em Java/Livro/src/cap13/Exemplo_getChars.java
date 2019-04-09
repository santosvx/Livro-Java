package cap13;

/***********************************************************
*                Exemplo_getChars.java                     * 
*                                                          *
*        Exemplo de uso de metodos da classe String        *
*----------------------------------------------------------*/
import java.util.Arrays;
import java.io.PrintStream;

class Exemplo_getChars
{ public static void main (String[] args)
  { PrintStream tela = System.out;
    char[] a = new char[4];

    "xpto".getChars(1,3,a,0);
    tela.print(":");
    tela.println(a);     // :pt

    Arrays.fill(a,' ');
    "xpto".getChars(1,4,a,0);
    tela.print(":");
    tela.println(a);     // :pto

    Arrays.fill(a,' ');
    "xpto".getChars(0,0,a,0);
    tela.print(":");
    tela.println(a);     // :

    /* "xpto".getChars(1,5,a,0);
    tela.println(a);    // IndexOutOfBoundsException */

    /* a = null;
    "xpto".getChars(1,3,a,0); // NullPointerException */
  }
}