package cap8;

/*---------------------------------------------------------*
*      Interface de entrada e saida da MiniMiniCalc        * 
*                                                          *
*     Metodos para leitura da operacao e dos arguementos   * 
*     da operacao a ser executada na  minicalculadora      *
*----------------------------------------------------------*/
import java.io.*;

class Entrada extends StreamTokenizer 
{ Entrada (InputStreamReader r)
  { super(r); }

  String prox() throws IOException
  { String s; 
    
    nextToken();  
    if (ttype == TT_NUMBER)    s = Integer.toString((int) nval);
    else if (ttype == TT_WORD) s = sval;
    else s = null;
    return s; }

  int leInteiro () throws IOException
  { nextToken();
    if (ttype == TT_NUMBER) return (int) nval;
    else throw new IOException(); } 
}