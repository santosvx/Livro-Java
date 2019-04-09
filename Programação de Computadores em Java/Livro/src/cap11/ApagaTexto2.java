package cap11;

/***************************************************************
*                    ApagaTexto2.java                          * 
*         Exemplo de tratamento de evento em botao             *
*                   uso de classe interna                      *
*--------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ApagaTexto2
{ public static void main (String[] a)
  { new JTexto2(); }  
}


class JTexto2 
{ JFrame f = new JFrame("Apaga Texto");     
  JTextField ct = new JTextField(20);  
  JButton bl = new JButton("Limpa");

  JTexto2 ()
  { ct.setEditable(true);
    ct.addActionListener(new TrataCampoDeTexto());
    bl.addActionListener(new TrataBotaoLimpa());

    Container c = f.getContentPane(); 
    c.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
    c.add(ct);  c.add(bl);
    f.setSize(300,70); f.show(); 
  }

  class TrataBotaoLimpa implements ActionListener
  { public void actionPerformed (ActionEvent e)
    { ct.setText(""); }  
  }

  class TrataCampoDeTexto implements ActionListener
  { public void actionPerformed (ActionEvent e)
    { JOptionPane.showMessageDialog(null,
           "O campo de texto contem: " + ct.getText()); } 
  }
}