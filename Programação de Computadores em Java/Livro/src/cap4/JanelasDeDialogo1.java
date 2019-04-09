package cap4;
	
	/********************************************************
	*                                                       *
	*            JanelasDeDialogo1.java                     *
	*                                                       *
	*         Exemplos simples de E/S em janelas            *
	*-------------------------------------------------------*/
	
import javax.swing.*;

	class JanelasDeDialogo1
	{ 
		public static void main(String[] a)
	  { String entrada = JOptionPane.showInputDialog
	                       ("Entre com um valor inteiro: ");
	    int x = Integer.parseInt(entrada);

	    entrada = JOptionPane.showInputDialog
	                       ("Entre com outro valor inteiro: ");
	    int y = Integer.parseInt(entrada);

	    JOptionPane.showMessageDialog
	                (null,"Soma dos valores digitados = " + (x+y)); 
	    System.exit(0);}
	}