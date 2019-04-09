package cap11;

/*****************************************************
*                  ExemploScrollPane.java            * 
*               Exemplo de uso de JScrollPane        *
*                                                    *
*----------------------------------------------------*/
import javax.swing.*;

class ExemploScrollPane extends JFrame
{ public static void main(String[] a)
  { new ExemploScrollPane(); }

  ExemploScrollPane()
  { super("Exemplo: JScrollPane");
    ImageIcon   i = new ImageIcon("Follow.jpg");
    JScrollPane j = new JScrollPane(new JLabel(i));
    getContentPane().add(j);
    setSize(300,200);
    setVisible(true); }
}