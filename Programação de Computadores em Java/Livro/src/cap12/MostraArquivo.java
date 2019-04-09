package cap12;

/*********************************************************
*                                                        *
*                 MostraArquivo.java                     *
*                                                        *
*  Exemplo de uso dos metodos da classe FileInputStream  *
*  para leitura do conteudo de uma arquivo de bytes      *
*--------------------------------------------------------*/
import java.io.*; 

class MostraArquivo 
{ public static void main (String[] args) throws IOException
  { int i;
    InputStream fi;

    try { fi = new FileInputStream(args[0]); }
    catch (FileNotFoundException e)
        { System.out.println("Arquivo nao encontrado"); return; } 
    catch (ArrayIndexOutOfBoundsException e)
        { System.out.println("Arquivo esperado como parametro"); return; } 

      // le bytes do arquivo \\
      do { i = fi.read();
           if (i != -1) System.out.print((char) i);
         } while (i != -1);
      fi.close();
  }
}