class Q1P1 { 

    // Escreva em Java um programa que leia, repetidamente, valores
    // inteiros não-negativos --- um a um, até que o valor lido seja
    // menor do que zero ---, e imprima, para cada valor $n$ lido, o
    // resultado da multiplica\ção da soma dos dígitos de $n$ pelo
    // maior dígito de $n$.

    public static void main (String[] a) {
	int n;
	do {
	    n = lêInteiro();
	    if (n<0) break;
	    System.out.println(somaDosDígitosVezesMaiorDígito(n));
    	}
	while (true);
    }

    static int somaDosDígitosVezesMaiorDígito(int n) {
	int soma = 0, dig = n%10, maiorDig = dig;
	while (n>0) {
	    if (dig > maiorDig) maiorDig = dig;
	    soma += dig;
	    n /= 10;
            dig = n%10;
	}
	return soma * maiorDig;
    }

    static int lêInteiro() {
	return Integer.parseInt(
	   JOptionPane.showInputDialog(
             "Digite inteiro não negativo (negativo para parar)"));
    }

