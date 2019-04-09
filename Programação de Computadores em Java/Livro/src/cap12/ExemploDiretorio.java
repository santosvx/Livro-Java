package cap12;

/****************************************************************
*                                                               *
*                 ExemploDiretorio.java                         *
*                                                               *
*         Exemplo de uso de metodos da classe File              *
*---------------------------------------------------------------*/
import java.io.*; 

class ExemploDiretorio
{ static void pr (String s) { System.out.println(s); }

  public static void main (String[] a) 
  { File f = new File("/home/camarao/java/");

    String[] arqs = f.list();
    if (f.isDirectory())
       for (int i=0; i<arqs.length; i++) pr(arqs[i]);
    else pr(new Boolean(f.isFile()).toString());
  }
}