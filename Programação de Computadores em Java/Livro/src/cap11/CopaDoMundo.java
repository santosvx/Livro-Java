package cap11;

/***********************************************************************
*                    CopaDoMundo.java                                  * 
* Exemplo de uso de JComboBox para escolha dentre uma lista de opcoes  *
*                                                                      *
*  Codigo HTML usado para iniciar o Applet CopaDoMundo:                *
* <html>                                                               *
*  <head>                                                              *
*    <title>Copa do Mundo</title>                                      *
*  </head>                                                             *
*  <body>                                                              *
*      <h1>Copa do Mundo</h1>                                          *
*      <hr>                                                            *
*      <applet code="CopaDoMundo.class" width=400 height=100>          *
*         <param name=x value="">                                      *
*      </applet>                                                       *
*      <hr>                                                            *
*      <a href="/home/camarao/java/CopaDoMundo.java">The source</a>.   *
*  </body>                                                             *
* </html>                                                              *
*                                                                      *
*----------------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CopaDoMundo extends JApplet 
  implements ItemListener, ActionListener
{ JLabel jl2;
  JComboBox sl = new JComboBox(); 

  public void init ()
  { setSize(400,100);
    Container c = getContentPane(); 
    c.setLayout(new BorderLayout());
    
    JPanel p = new JPanel();
    p.setLayout(new FlowLayout()); 

    JLabel jl1 = new JLabel (new ImageIcon("bola.gif"));
    p.add(jl1);

    sl.addItem("Brasil");      sl.addItem("Franca");
    sl.addItem("Inglaterra");  sl.addItem("Alemanha"); 
    sl.addItem("Holanda");     sl.addItem("Espanha"); 
    sl.addItem("Argentina");    sl.addItem("Japao");
;
    sl.addItemListener(this);
    p.add(sl);

    jl2 = new JLabel (new ImageIcon("Brasil.gif"));   
    p.add(jl2); 

    JButton b = new JButton("Aposta");
    b.addActionListener(this);
    c.add(b,BorderLayout.SOUTH); 
    c.add(p,BorderLayout.CENTER);
}

  public void itemStateChanged (ItemEvent e)
  { String s = (String) e.getItem(); 
    jl2.setIcon(new ImageIcon(s + ".gif")); }

  public void actionPerformed (ActionEvent e)
  { String s = (String) sl.getSelectedItem();
    JOptionPane.showMessageDialog
          (null,"Voce apostou na selecao: " + s); }
}