package cap5;

/********************************************************
*                                                       *
*            Exemplo_break.java                         *
*                                                       *
* execute como: java Exemplo_break 15                   *
*-------------------------------------------------------*/

import javax.swing.*;

class Exemplo_break
{ static int proxf (int n) { return 2*n; } 
     
  static int f0 = 1;

  public static void main (String[] a)
  { int n = Integer.parseInt(a[0]),
        r = f0, max = 32;

    String s = "                               f(x)\n" + 
               "  |--------------------->";

   for (int i=1; i<=n; i++)
       { if (r > max) break;
         s += "\n  |";
         for (int j=1; j<r; j++) s += " ";
         r = proxf(r);
         s += "*"; }

   s += "\nx|";
   JOptionPane.showMessageDialog
         (null, s, "Grafico", JOptionPane.INFORMATION_MESSAGE);
   System.exit(0);
  }
}