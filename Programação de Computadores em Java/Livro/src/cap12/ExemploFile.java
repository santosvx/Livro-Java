package cap12;

/****************************************************************
*                                                               *
*                 ExemploFile.java                              *
*                                                               *
*         Exemplo de uso de metodos da classe File              *
*---------------------------------------------------------------*/
import java.io.*; 

class ExemploFile
{ static void pr (String s) { System.out.println(s); }

  public static void main (String[] a) throws FileNotFoundException
  { File f = new File("/home/camarao/java", "t.t");

    if (f.exists())
       { pr("Arquivo `t.t' existe");

         pr("Nome: " + f.getName());

         pr("Localizado em: " + f.getParent()); 
         pr("Nome completo: " + f.getPath());
       }
    else pr("Arquivo `t.t' nao existe");
  }
}