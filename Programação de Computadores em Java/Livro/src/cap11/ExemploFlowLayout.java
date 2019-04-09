package cap11;

/***************************************************************************
*                    ExemploFlowLayout.java                                * 
*  Exemplo de disposicao de botoes em um painel                            *
*                                                                          *
*  Codigo HTML usado para iniciar o Applet ExemploFlowLayout:              *
* <html>                                                                   *
*  <head>                                                                  *
*    <title>Campo de FlowLayout</title>                                    *
*  </head>                                                                 *
*  <body>                                                                  *
*      <h1>Exemplo de FlowLayout</h1>                                      *
*      <hr>                                                                *
*      <applet code="ExemploFloLayout.class" width=400 height=200>         *
*         <param name=x value="">                                          *
*      </applet>                                                           *
*      <hr>                                                                *
*      <a href="/home/camarao/java/ExemploFlowLayout.java">The source</a>. *
*  </body>                                                                 *
* </html>                                                                  *
*             *                                                            *
*--------------------------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ExemploFlowLayout extends JApplet
{ public void init ()
  { String texto = "Proemiatur apte, narrat aperte," +
                   "pugnat acriter, colligit fortifier, ornat excelse." +
                   "Postremo docet, delectat, afficit.";

    getContentPane().setLayout (new FlowLayout(FlowLayout.RIGHT,10,5)); 
    
   StringTokenizer tokens = new StringTokenizer(texto);
   while (tokens.hasMoreTokens())
      getContentPane().add(new JButton(tokens.nextToken()));
   setSize(400,200); }
}