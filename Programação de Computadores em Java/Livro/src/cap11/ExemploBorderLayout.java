package cap11;

/***************************************************************************
*                  ExemploBorderLayout.java                                * 
*   Exemplo de disposicao de botoes em um painel segundo BorderLayout      *
*                                                                          *
*--------------------------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;

class ExemploBorderLayout extends JFrame
{ ExemploBorderLayout()
  { super("Exemplo de BorderLayout");
    setSize(300,200);

    Container c = getContentPane();
    c.setLayout(new BorderLayout());
    c.add(new JButton("centro"), BorderLayout.CENTER);
    c.add(new JButton("norte"),  BorderLayout.NORTH);
    c.add(new JButton("sul"),    BorderLayout.SOUTH);
    c.add(new JButton("leste"),  BorderLayout.EAST); 
    c.add(new JButton("oeste"),  BorderLayout.WEST);

    setVisible(true);
  }

  public static void main(String[] a)
  { new ExemploBorderLayout(); }
}