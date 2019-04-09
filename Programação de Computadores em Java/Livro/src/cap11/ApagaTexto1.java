package cap11;

/***************************************************************
*                    ApagaTexto1.java                          * 
*         Exemplo de tratamento de evento em botao             *
*                                                              *
*--------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ApagaTexto1
{ 
	public static void main (String[] a)
  { new JTexto1(); }  
}

class JTexto1
{ JFrame f = new JFrame("Apaga Texto"); 
  JTextField ct = new JTextField(20);  
  JButton bl = new JButton("Limpa");


  JTexto1 () 
  { ct.setEditable(true);
    ct.addActionListener(new TrataCampoDeTexto(ct));
    bl.addActionListener(new TrataBotaoLimpa(ct));

    Container c = f.getContentPane();
    c.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
    c.add(ct);  c.add(bl);
    f.setSize(300,70); f.show(); }
}

class TrataBotaoLimpa implements ActionListener
{ JTextField ct;
  
  TrataBotaoLimpa(JTextField ct)
  { this.ct = ct; }

  public void actionPerformed (ActionEvent e) 
  { ct.setText(""); } 
}

class TrataCampoDeTexto implements ActionListener
{ JTextField ct;
  
  TrataCampoDeTexto(JTextField ct)
  { this.ct = ct; }

  public void actionPerformed (ActionEvent e)
  { JOptionPane.showMessageDialog (null, 
       "O campo de texto contem: " + ct.getText()); }
}