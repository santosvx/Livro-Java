package cap11;

/***************************************************************
*                    Retangulo.java                            * 
*     Exemplo de uso dos metodos paintComponent e repaint      *
*                                                              *
*--------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;

public class Retangulo 
{ public static void main (String[] a)
  { JFrame f = new JFrame("Retangulo"); 
    Painel p = new Painel();     
    f.getContentPane().add(p); 
    f.setSize(200,200);
    f.setVisible(true); }
}

class Painel extends JPanel
{ Painel() { repaint (); }

  public void paintComponent (Graphics g)
  { super.paintComponent(g); 
    g.drawRect(20,10,100,60); }
}