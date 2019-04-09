package cap11;

/*******************************************************
*                    Rotulo.java                       * 
*              Exemplo de uso de Rotulo                *
*                                                      *
*------------------------------------------------------*/
import javax.swing.*;

class Rotulo
{ public static void main(String[] a)
  { JFrame f = new JFrame();
    JLabel l = new JLabel("nome", new ImageIcon("button1.gif"), JLabel.LEFT);

    f.getContentPane().add(l);
    f.setSize(150,100);
    f.setVisible(true); }
}