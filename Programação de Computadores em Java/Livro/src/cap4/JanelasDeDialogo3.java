package cap4;

/********************************************************
*                                                       *
*            JanelasDeDialogo3.java                     *
*                                                       *
*         Exemplos simples de E/S em janelas            *
*-------------------------------------------------------*/

import javax.swing.*;

class JanelasDeDialogo3
{ 
	public static void main(String[] a)
  { ImageIcon icone = new ImageIcon("forward.gif");

    String entrada = (String) JOptionPane.showInputDialog
              (null,"Entre com um valor booleano: ","Entrada",
               JOptionPane.QUESTION_MESSAGE, icone, null, null);
    boolean x = Boolean.valueOf(entrada).booleanValue();

    entrada = (String) JOptionPane.showInputDialog
              (null,"Entre com outro valor booleano: ","Entrada",
               JOptionPane.QUESTION_MESSAGE, icone, null, null);
    boolean y = Boolean.valueOf(entrada).booleanValue();

    JOptionPane.showMessageDialog
              (null, x + " OU " + y + " = " + (x|y),
                 "Resultado", JOptionPane.INFORMATION_MESSAGE); 

    System.exit(0); }
}