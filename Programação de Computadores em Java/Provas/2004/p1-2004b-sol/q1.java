import javax.swing.*;

class Q1
{ public static void main (String[] a)
    { int maiorAltura = 0, menorAltura = Integer.MAX_VALUE, 
          numMenorAluno = Integer.MAX_VALUE, numMaiorAluno = 0;
      int n, h;
      do {  n = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite o número do aluno"));
            h = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite a sua altura, em cm:"));
            if (h == 0 || n == 0) break;
            if (h > maiorAltura)
               { numMaiorAluno = n; maiorAltura = h; }
            if (h < menorAltura)
               { numMenorAluno = n; menorAltura = h; }
         }
     while (true);
      JOptionPane.showMessageDialog(null, "Maior aluno = " + numMaiorAluno + 
        ", com altura: " + maiorAltura);
      JOptionPane.showMessageDialog(null, "Menor aluno = " + numMenorAluno + 
        ", com altura: " + menorAltura);
    }
}