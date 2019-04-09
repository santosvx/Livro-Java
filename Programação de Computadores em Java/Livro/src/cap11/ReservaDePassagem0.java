package cap11;

/************************************************************
*                  ReservaDePassagem0.java                  * 
*        Exemplo de disposicao de botoes em um painel       *
*                                                           *
*-----------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;

class ReservaDePassagem0 extends JFrame
{ ReservaDePassagem0 ()
  { super("Reserva de Passagem");
    setSize(400,200);

    /* ... */ 

    JPanel pBs = new JPanel(); 
    JPanel pbs = new JPanel();
    pbs.setLayout(new GridLayout(1,3,10,10));

    JButton b1 = new JButton("Pesquisar");
    JButton b2 = new JButton("Reservar");
    JButton b3 = new JButton("Sair");

    pbs.add(b1); pbs.add(b2); pbs.add(b3); 
    pBs.add(pbs);

    getContentPane().add(pBs, BorderLayout.SOUTH); 

    setVisible(true); }

  public static void main(String[] a)
  { new ReservaDePassagem0(); }
}