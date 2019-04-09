import javax.swing.*;

class Calc
{   public static void main (String[] a)
    {   // Imprime 1+ (-2*3) + 4 + (5*6) + 7 + (-8*9) + 10 + 11*12 + ...
 do { int n = Integer.parseInt(
                      JOptionPane.showInputDialog(
                       "Digite um número inteiro positivo (0 para parar): ")); 
     if (n==0) break;
     JOptionPane.showMessageDialog(null, String.valueOf(somat(n)));
 } while (true);
    }

    static int somat(int n)
    { int soma = 0, sinal = -1, j = 1;
      for (int i=1; i<=n; i+=2)
          { soma += j + (sinal*(j+1)*(j+2));
            j = j+3; 
            sinal = -sinal;
   }
      return soma;
    }
}