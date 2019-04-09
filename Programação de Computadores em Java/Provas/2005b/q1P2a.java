import javax.swing.*;

class Q1P2a {
    // Escreva um programa que leia um valor inteiro $n$ e calcule o
    // valor de $\sum_{i=1}^n (-i+1)/(i*i)$, e imprima esse valor, se
    // $n>0$, e $0$ caso contr�rio.

    // O programa deve tratar a exce��o que ocorre quando a cadeia de
    // caracteres lida n�o representa um n\'umero inteiro, informando
    // o usu�rio com uma mensagem apropriada e realizando a opera��o
    // de leitura novamente.
    public static void main (String[] a) {
	int n; 
	try {
	    n = l�Inteiro();
	    if (n<0) throw new Exception("N�mero inteiro n�o positivo");
	    imprime(somat(n) + "\n");
	}
	catch (Exception e) {
	    imprime(e.getMessage + "\n");
            main (null); // come�a novamente 
	}
    }

    static float somat (int n) {
	float soma = 0;
        for (int i=1; i<=n; i++) {
	    soma += (-i+1.0)/i*i; 
	}
	return soma;
    }

    static void imprime (String s) {
	JOptionPane.showMessageDialog (null, s);
    }

    static int l�Inteiro () throws NumberFormatException {
	return Integer.parseInt(
	    JOptionPane.showInputDialog("Entre com um inteiro: ")); 
    }
}

	
