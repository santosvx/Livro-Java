package cap13;

/***********************************************************
*                Exemplo_regionMatches.java                * 
*                                                          *
*        Exemplo de uso de metodos da classe String        *
*----------------------------------------------------------*/
import java.io.PrintStream;

class Exemplo_regionMatches
{ public static void main (String[] a)
  { PrintStream tela = System.out;
    tela.println("xpto".regionMatches(1,"",0,1)); 
    tela.println("xpto".regionMatches(1,"",0,0)); 
    tela.println("xpto".regionMatches(1,"pt",0,2)); 
    tela.println("xpto".regionMatches(true,1,"PT",0,2));
    tela.println("xpto".regionMatches(1,"pt",0,1));
  }
}