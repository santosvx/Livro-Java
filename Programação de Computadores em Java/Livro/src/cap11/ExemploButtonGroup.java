package cap11;

/************************************************************
*                  ExemploButtonGroup.java                  * 
*        Exemplo de uso de grupo de botoes                  *
*                                                           *
*-----------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;

class ExemploButtonGroup extends JFrame
{ public static void main (String[] a)
  { new ExemploButtonGroup(); }

  ExemploButtonGroup()
  { super("Exemplo: ButtonGroup");
    JToggleButton b1 = new JToggleButton("B1",true);
    JToggleButton b2 = new JToggleButton("B2",false);
    JToggleButton b3 = new JToggleButton("B3",false);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(b1); c.add(b2); c.add(b3);

    ButtonGroup bg = new ButtonGroup();
    bg.add(b1); bg.add(b2); bg.add(b3);

    setSize(200,100);
    setVisible(true);

    b2.getModel().setSelected(true);
    // Mesmo efeito que setSelected(b2.getModel(),true); 
  } 
}