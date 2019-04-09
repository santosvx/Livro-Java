import javax.swing.*;
class NumPerfeito
{   public static void main (String[] a)
    {   String s = "";
        int n = Integer.parseInt(
                 JOptionPane.showInputDialog("Digite um número inteiro"));
        for (int i=1; i<=n; i++) 
          if (éPerfeito(i)) s+=i + " ";
        JOptionPane.showMessageDialog(null, s);
    }

    static boolean éPerfeito(int n)
    { int somaDivisores = 0;
      for (int i=1; i<n; i++)
          if (n%i==0) somaDivisores +=i;
      return somaDivisores == n;
    }
}
    