package cap12;

/***********************************************************
*                BuscaEmCadeia.java                        * 
*                                                          *
*        Exemplo de uso de metodos da classe String        *
*----------------------------------------------------------*/
import java.io.PrintStream;

class BuscaEmCadeia
{ public static void main (String[] a)
  { PrintStream tela = System.out;

    tela.println("xpto".indexOf('x'));
    tela.println("xpto".indexOf('x',1));
    tela.println("xpto".indexOf("pt"));
    tela.println("xpto".indexOf('o'));
    tela.println("xptoo".lastIndexOf('o'));
  }
}