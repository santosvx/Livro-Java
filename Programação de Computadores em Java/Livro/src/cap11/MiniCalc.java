package cap11;

/**********************************************************************
*                    MiniCalc.java                                    *
*       Applet que implementa um minicalculadora simples              *
*                                                                     *
*  Codigo HTML usado para iniciar o Applet MiniCalc:                  *
* <html>                                                              *
*  <head>                                                             *
*    <title>Minicalculadora</title>                                   *
*  </head>                                                            *
*  <body>                                                             *
*      <h1>Minicalculadora</h1>                                       *
*      <hr>                                                           *
*      <applet code="MiniCalc.class" width=250 height=100>            *
*         <param name=ops value="soma sub mult div exp">              *
*      </applet>                                                      *
*      <hr>                                                           *
*      <a href="/home/camarao/java/MiniCalc.java">The source</a>.     *
*  </body>                                                            *
* </html>                                                             *
*                                                                     *
*---------------------------------------------------------------------*/
import javax.swing.*;
import java.lang.*;
import java.util.StringTokenizer;

public class MiniCalc extends JApplet
{ static String[] ops;
  static int numOps;

  public void init()
  { /* Obtem os nomes das operacoes da minicalculadora */
    StringTokenizer opsTokens = new StringTokenizer(getParameter("ops"));
    numOps = opsTokens.countTokens();
    ops = new String[numOps];
    for (int i=0; i<numOps; i++)
        ops[i] = opsTokens.nextToken(); }

    public void start()
    { /* Cria interface da minicalculadora */
      MiniCalcES minicalcES = new MiniCalcES(ops,this); } 

    public static void main(String[] args)
    { /* Obtem os nomes das operacoes da minicalculadora */ 
      /* e cria a interface da minicalculadora           */      
      MiniCalc minicalc = new MiniCalc();
      numOps = args.length;
      ops = new String[numOps];
      for (int i=0; i<numOps; i++) ops[i] = args[i];
      minicalc.start(); 
      JFrame f = new JFrame("MiniCalc");
      f.getContentPane().add(minicalc);
      f.setVisible(true);  f.pack(); }
}