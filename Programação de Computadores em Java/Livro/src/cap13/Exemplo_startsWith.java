package cap13;

/***********************************************************
*                Exemplo_startsWith.java                   * 
*                                                          *
*        Exemplo de uso de metodos da classe String        *
*----------------------------------------------------------*/
import java.io.PrintStream;

class Exemplo_startsWith
{ public static void main (String[] a)
  { PrintStream tela = System.out;
    tela.println("xpto".startsWith("")); 
    tela.println("xpto".startsWith("xp")); 
    tela.println("xpto".startsWith("pt",1)); 

    tela.println("xpto".endsWith(""));
    tela.println("xpto".endsWith("pto"));
    tela.println("xpto".endsWith("xpto"));
    tela.println("xpto".endsWith("oo"));
  }
}