class Q1P1 { 

    // Escreva em Java um programa que leia, repetidamente, valores
    // inteiros n�o-negativos --- um a um, at� que o valor lido seja
    // menor do que zero ---, e imprima, para cada valor $n$ lido, o
    // resultado da multiplica\��o da soma dos d�gitos de $n$ pelo
    // maior d�gito de $n$.

    public static void main (String[] a) {
	int n;
	do {
	    n = l�Inteiro();
	    if (n<0) break;
	    System.out.println(somaDosD�gitosVezesMaiorD�gito(n));
    	}
	while (true);
    }

    static int somaDosD�gitosVezesMaiorD�gito(int n) {
	int soma = 0, dig = n%10, maiorDig = dig;
	while (n>0) {
	    if (dig > maiorDig) maiorDig = dig;
	    soma += dig;
	    n /= 10;
            dig = n%10;
	}
	return soma * maiorDig;
    }

    static int l�Inteiro() {
	return Integer.parseInt(
	   JOptionPane.showInputDialog(
             "Digite inteiro n�o negativo (negativo para parar)"));
    }

