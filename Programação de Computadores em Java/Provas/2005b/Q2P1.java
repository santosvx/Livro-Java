class Q2P1 {

    // Escreva em Java um programa que leia, repetidamente, valores
    // inteiros não-negativos --- um a um, até que o valor lido seja
    // menor do que zero ---, e imprima, para cada valor $n$ lido, a
    // soma das $n$ primeiras parcelas do somatório 
    //     $\frac{1}{1} - \frac{2}{3} + \frac{3}{5} - \frac{4}{7} +
    //      \frac{5}{9} - \frac{6}{11} + \ldots $
    // A soma é igual a zero se $n$ é igual a zero. 

    public static void main (String[]a) {
	int n, sinal; float soma, denom;
	do {
	    n = lêInteiro();
	    if (n<0) break;
	    soma = 0;
	    denom = -1;
            sinal = 1;
	    for (int i=1; i<=n; i++) {
		denom += 2;
		soma  += sinal * (i/denom);
		sinal = -sinal;
	    }
	    System.out.println(soma);
	while (true);
	}
    }
    static int lêInteiro() {
	return Integer.parseInt(
	  JOptionPane.showInputDialog(
            "Digite valor inteiro não negativo (negativo para parar)"));
    }
}