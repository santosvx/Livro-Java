package cap11;

/****************************************************************
*                                                               *
*                 CopiaArquivo.java                             *
*                                                               *
*  Exemplo de uso dos metodos das classes                       *
*           FileInputStream e FileOutPutStream                  *
*  Copia o conteudo de um arquivo para outro arquivo:           *
*  os nomes dos arquivos sao dados como argumentos do programa  *
*---------------------------------------------------------------*/
import java.io.*; 

class CopiaArquivo 
{ public static void main (String[] args) throws IOException
  { int i;
    InputStream fi;
    OutputStream fo;

    try {
        try { fi = new FileInputStream(args[0]); }
        catch (FileNotFoundException e)
            { System.out.println("Arquivo de entrada nao encontrado"); return; }

        try { fo = new FileOutputStream(args[1]); }
        catch (FileNotFoundException e)
            { System.out.println("Arquivo de saida nao encontrado"); return; } 
        }
    catch (ArrayIndexOutOfBoundsException e) 
        { System.out.println("Arquivos esperados como parametros "); return; }

    // copia arquivo
    try {
        do { i = fi.read();
            if (i!=-1) fo.write(i);
           } while (i!=-1);
        }
    catch (IOException e) 
        { System.out.println("Erro de arquivo"); }

    fi.close();
    fo.close();
 }
} 