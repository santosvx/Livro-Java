import javax.swing.*;
class NumPerfeito
{   public static void main (String[] a)
    {   String s = "";
        int n = Integer.parseInt(
                 JOptionPane.showInputDialog("Digite um n�mero inteiro"));
        for (int i=1; i<=n; i++) 
          if (�Perfeito(i)) s+=i + " ";
        JOptionPane.showMessageDialog(null, s);
    }

    static boolean �Perfeito(int n)
    { int somaDivisores = 0;
      for (int i=1; i<n; i++)
          if (n%i==0) somaDivisores +=i;
      return somaDivisores == n;
    }
}
    