package cap11;

/***************************************************************
*                    Senha.java                                * 
*  Exemplo de Applet e contendo um campo de texto              *
*  para leitura de uma senha de usuario                        *
*                                                              *
*  Codigo HTML usado para iniciar o Applet Senha:              *
* <html>                                                       *
*  <head>                                                      *
*    <title>Senha</title>                                      *
*  </head>                                                     *
*  <body>                                                      *
*      <h1>Senha</h1>                                          *
*      <hr>                                                    *
*      <applet code="Senha.class" width=250 height=100>        *
*         <param name=x value="">                              *
*      </applet>                                               *
*      <hr>                                                    *
*      <a href="/home/camarao/java/Senha.java">The source</a>. *
*  </body>                                                     *
* </html>                                                      *
*                                                              *
*--------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;

public class Senha extends JApplet
{ public void init ()
  { JPasswordField senha = new JPasswordField(20);

    JLabel l = new JLabel("Senha:",JLabel.RIGHT);
    l.setFont(new Font("Helvetica", Font.BOLD, 12));
    l.setForeground(Color.red);

    JPanel p = new JPanel();
    p.add(l);
    p.add(senha);

    getContentPane().add(p); 
    setSize(400,100); }
}