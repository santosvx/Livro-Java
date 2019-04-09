package cap4;

/********************************************************
*                                                       *
*            JanelasDeDialogo2.java                     *
*                                                       *
*         Exemplos simples de E/S em janelas            *
*-------------------------------------------------------*/

import javax.swing.*;

class JanelasDeDialogo2
{ 
	public static void main(String[] a)
  { ImageIcon icone = new ImageIcon("forward.gif");

    String entrada = (String) JOptionPane.showInputDialog 
                 (null,"Entre com um valor inteiro: ","Entrada",
                  JOptionPane.QUESTION_MESSAGE, icone, null, null);
    int x = Integer.parseInt(entrada);

    entrada = (String) JOptionPane.showInputDialog
                (null,"Entre com outro valor inteiro: ","Entrada",
                 JOptionPane.QUESTION_MESSAGE, icone, null, null);
    int y = Integer.parseInt(entrada);

    JOptionPane.showMessageDialog 
                (null,"Soma dos valores digitados = " + (x+y),
                 "Resultado", JOptionPane.INFORMATION_MESSAGE); 
  
    System.exit(0); }
}