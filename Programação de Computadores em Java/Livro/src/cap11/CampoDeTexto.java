package cap11;

/**********************************************************************
*                    CampoDeTexto.java                                *
*  Exemplo de Applet e contendo um campo de texto                     *
*                                                                     *
*  Codigo HTML usado para iniciar o Applet CampoDeTexto:              *
* <html>                                                              *
*  <head>                                                             *
*    <title>Campo de texto</title>                                    *
*  </head>                                                            *
*  <body>                                                             *
*      <h1>Campo de Texto</h1>                                        *
*      <hr>                                                           *
*      <applet code="CampoDeTexto.class" width=250 height=100>        *
*         <param name=x value="">                                     *
*      </applet>                                                      *
*      <hr>                                                           *
*      <a href="/home/camarao/java/CampoDeTexto.java">The source</a>. *
*  </body>                                                            *
* </html>                                                             *
*                                                                     *
*---------------------------------------------------------------------*/

import java.awt.event.*;
import javax.swing.*;

public class CampoDeTexto extends JApplet implements ActionListener
{ private JTextField campoDeTexto;  
  private JPanel p = new JPanel();

  public void init()
  { campoDeTexto = new JTextField(20);
    setSize(400,100); 
    campoDeTexto.addActionListener(this);
    p.add(campoDeTexto);
    getContentPane().add(p); }
 
  public void actionPerformed(ActionEvent e)
  { campoDeTexto.setText(campoDeTexto.getText() + '*'); }
}