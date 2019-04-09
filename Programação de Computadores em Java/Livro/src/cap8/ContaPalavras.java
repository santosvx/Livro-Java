package cap8;

import java.io.*;

class ContaPalavras 
{ 
  public static int palavras=0;
  public static int linhas=0;
  public static int caracteres=0;

  public static void conta_palavras (InputStreamReader entrada) 
      throws IOException
  { StreamTokenizer st = new StreamTokenizer(entrada);

    st.resetSyntax();
    st.wordChars(33, 255);
    st.whitespaceChars(0,' ');
    st.eolIsSignificant(true);

    while (st.nextToken() != st.TT_EOF) 
    { switch (st.ttype) {
        case st.TT_EOL: 
          linhas++; 
          break;
        case st.TT_WORD:
          palavras++;
          caracteres += st.sval.length();
          break;
        default: 
          caracteres += st.sval.length();
          break;
      }
    }
  }

  public static void main (String[] args)
  { try {conta_palavras (new InputStreamReader(System.in));
         System.out.println ("\n" + "linhas     = " + linhas + "\n" +
                             "palavras   = " + palavras + "\n" +
                             "caracteres = " + caracteres); }
    catch (IOException e) {};
  }
}