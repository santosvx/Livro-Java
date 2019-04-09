package cap11;

/************************************************************
*                  Portinari.java                           * 
*  Exemplo de uso de lista de opcoes em showInputDialog     *
*                                                           *
*-----------------------------------------------------------*/
import javax.swing.*;

class Portinari
{ public static void main(String[] a)
  { ImageIcon icone = new ImageIcon("atelie.gif");

    String[] obrasDePortinari =
        { "Menino de Brodosqui", "Clarinetista", "Baile na Roca",
          "Cafe", "Tiradentes", "Emigrantes", "Guerra e Paz" }; 
    String entrada = (String) JOptionPane.showInputDialog
        (null, "Escolha uma obra de Portinari","Entrada",
         JOptionPane.QUESTION_MESSAGE,icone,
         obrasDePortinari,"Menino de Brodosqui");

    JOptionPane.showMessageDialog
        (null," Voce escolheu " + entrada,"Resultado",
         JOptionPane.INFORMATION_MESSAGE); }
}