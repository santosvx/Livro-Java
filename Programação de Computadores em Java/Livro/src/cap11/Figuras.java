package cap11;

/*************************************************************
*                    Figuras.java                            * 
*  Exemplo de desenho de figuras geometricas e uso de cores  *
*                                                            *
*  Codigo HTML usado para iniciar o Applet Fig:              *
* <html>                                                     *
*  <head>                                                    *
*    <title>Figuras Geometricas</title>                      *
*  </head>                                                   *
*  <body>                                                    *
*      <h1>Figuras Geometricas</h1>                          *
*      <hr>                                                  *
*      <applet code="Fig.class" width=470 height=250>        *
*         <param name=x value="">                            *
*      </applet>                                             *
*      <hr>                                                  *
*      <a href="/home/camarao/java/Fig.java">The source</a>. *
*  </body>                                                   *
* </html>                                                    *
*                                                            *
*------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*; 

public class Figuras extends JApplet
{ public void init ()
  { Figs fs = new Figs(); 
    Container c = getContentPane();
    c.add(fs); 
    setVisible(true); }
}

class Figs extends JPanel
{ Figs () { repaint(); }
  public void paintComponent (Graphics g)
  { super.paintComponent(g); 
    setBackground(Color.white);
    g.setColor(Color.magenta);
    g.fillRect(10,10,100,200); 
    g.setColor(Color.red);
    g.fillRoundRect(120,10,100,200,30,30); 
    g.setColor(Color.green);
    g.fill3DRect(230,10,100,200,true);
    g.setColor(Color.yellow);
    g.fillArc(340,10,100,200,90,180);
    g.setColor(Color.black);
    int[] xs = { 400,450,400,450,400 };
    int[] ys = { 10,10,210,210,10 }; 
    g.drawPolygon(xs,ys,5);
  }
}