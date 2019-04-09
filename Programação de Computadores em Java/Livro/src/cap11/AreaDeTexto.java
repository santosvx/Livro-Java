package cap11;

/**********************************************************
*                    AreaDETexto.java                     * 
* Exemplo de uso de JTextArea e de tratamento de evento   *
*                                                         *
*---------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AreaDeTexto
{ public static void main (String[] a)
  { JFrame f = new JFrame();

    JTextArea a1 = new JTextArea("aaaaaaaaaaaaaaaaa\n" +
                                 "bbbbbbbbbbbb\n" +
                                 "ccccccccc\n" +
                                 "ddddd\n", 10,10),
              a2 = new JTextArea("",10,10);

    JButton b = new JButton("Copia ===>");
    b.addActionListener(new Copia(a1, a2));

    a2.setEditable(false);
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout(FlowLayout.LEFT,10,5));
    f.setSize(450,200);
    c.add(a1); c.add(b); c.add(a2);
    f.show(); }
}

class Copia implements ActionListener
{ JTextArea de, para;

  Copia(JTextArea a1, JTextArea a2)
  { de = a1; para = a2; }

  public void actionPerformed(ActionEvent e)
  { String s = de.getSelectedText(); 
    para.setText(s);}
}