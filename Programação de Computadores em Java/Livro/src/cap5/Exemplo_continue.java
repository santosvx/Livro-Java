package cap5;

/********************************************************
*                                                       *
*            Exemplo_continue.java                      *
*                                                       *
* execute como: java Exemplo_continue 20 5              *
*-------------------------------------------------------*/

import javax.swing.*;
 
class Exemplo_continue
{ public static void main (String[] a)
  { int n    = Integer.parseInt(a[0]),
        m    = Integer.parseInt(a[1]), 
        col = 1;
    String s = "Notacao unaria: de 1 a " + n +
               ", sem multiplos de " + m + "\n";

    for (int i=1; i<=n; i++)
       { s += "\n";
         if (i%m == 0) continue;
         for (col=1; col<=i; col++) s += "|"; }

    JOptionPane.showMessageDialog
         (null, s, "Exemplo do comando continue",
          JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);  }
}