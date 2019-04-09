package cap11;

/*****************************************************************************
*                    ApagaTexto3.java                                        * 
*         Exemplo de tratamento de evento em botao                           *
* Uso de instanceOf para determinacao do componente no qual ocorreu o evento *
*----------------------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ApagaTexto3
{ public static void main (String[] a)
  { new JTexto3(); }  
}

class JTexto3 implements ActionListener
{ JFrame f = new JFrame("Apaga Texto"); 
  JTextField ct = new JTextField(20);
  JButton bl = new JButton("Limpa");

  JTexto3 () 
  { ct.setEditable(true);
    ct.addActionListener(this);
    bl.addActionListener(this);
    Container c = f.getContentPane(); 
    c.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
    c.add(ct); c.add(bl);
    f.setSize(300,70); f.show(); }

  public void actionPerformed (ActionEvent e)
  { Object o = e.getSource();
    if (o == bl)  ct.setText(""); 
    else if (o == ct) JOptionPane.showMessageDialog(null,
              "O campo de texto contem: " + ct.getText()); } 
}