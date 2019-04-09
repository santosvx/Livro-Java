package cap11;

/***************************************************************
*                    Funcs.java                                *
*                                                              *
*   Lista de funcoes da minicalculadora simples                *
*--------------------------------------------------------------*/
import Func; 

class Funcs
{ static final Func[] funcs =
     { new Soma(), new Sub(), new Mult(), new Div(), new Exp() }; 
  static final String[] nomes = 
     { "soma", "sub", "mult", "div", "exp" };

  public static Func getFunc(String s) throws Exception 
  { int i = indice(s);
    if (i>=nomes.length) 
       throw new Exception("Funcao nao encontrada: " + s );
    else return funcs[i]; }   

  private static int indice(String s)
  { int i = 0;
    while (i<nomes.length)
    if (nomes[i].equals(s)) return i; else i++;
    return i;  }
}