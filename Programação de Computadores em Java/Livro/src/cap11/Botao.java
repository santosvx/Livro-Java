package cap11;

/***************************************************************
*                    Botao.java                                * 
*  Exemplo de Applet e de tratamento de evento em botao        *
*                                                              *
*  Codigo HTML usado para iniciar o Applet Botao:              *	
* <html>                                                       *
*  <head>                                                      *
*    <title>Botao</title>                                      *
*  </head>                                                     *
*  <body>                                                      *
*      <h1>Botao</h1>                                          *
*      <hr>                                                    *
*      <applet code="Botao.class" width=250 height=100>        *
*         <param name=x value="">                              *
*      </applet>                                               *
*      <hr>                                                    *
*      <a href="/home/camarao/java/Botao.java">The source</a>. *
*  </body>                                                     *
* </html>                                                      *
*                                                              *
*--------------------------------------------------------------*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Botao extends JApplet implements ActionListener
{ public void init()
    { JButton b = new JButton("Play");
      JPanel p = new JPanel();
      setSize(350,200);   
      p.add(b); 
      b.addActionListener(this);
      getContentPane().add(p); 
      p.setVisible(true); }

  public void actionPerformed(ActionEvent e)
  { JOptionPane.showMessageDialog(null,"Voce apertou Play","OK",
             JOptionPane.PLAIN_MESSAGE); }
}