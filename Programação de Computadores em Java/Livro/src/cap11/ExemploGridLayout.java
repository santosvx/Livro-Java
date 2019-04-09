package cap11;

/***************************************************************************
*                    ExemploGridLayout.java                                * 
*  Exemplo de disposicao de botoes em um painel                            *
*                                                                          *
*  Codigo HTML usado para iniciar o Applet ExemploGridLayout:              *
* <html>                                                                   *
*  <head>                                                                  *
*    <title>Campo de GridLayout</title>                                    *
*  </head>                                                                 *
*  <body>                                                                  *
*      <h1>Exemplo de GridLayout</h1>                                      *
*      <hr>                                                                *
*      <applet code="ExemploGridLayout.class" width=400 height=200>        *
*         <param name=x value="">                                          *
*      </applet>                                                           *
*      <hr>                                                                *
*      <a href="/home/camarao/java/ExemploGridLayout.java">The source</a>. *
*  </body>                                                                 *
* </html>                                                                  *
*             *                                                            *
*--------------------------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class ExemploGridLayout extends JApplet
{ public void init ()
  { String texto = "Proemiatur apte, narrat aperte," +
                   "pugnat acriter, colligit fortifier, ornat excelse." +
                   "Postremo docet, delectat, afficit.";

    getContentPane().setLayout (new GridLayout(7,2)); 
    
   StringTokenizer tokens = new StringTokenizer(texto);
   while (tokens.hasMoreTokens())
      getContentPane().add(new JButton(tokens.nextToken()));
   setSize(400,200); }
}