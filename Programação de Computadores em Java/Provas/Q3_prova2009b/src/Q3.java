import java.util.Scanner;
public class Q3 {

	/* Escreva um programa que leia um inteiro positivo $n$, depois
	$n$ valores inteiros $a_1, \ldots, a_n$, e imprima uma mensagem
	indicando se a sequ�ncia de valores $a_1, \ldots, a_n$ �
	n�o-decrescente (ou seja, cada valor $a_{i+1}$ � maior ou igual a
	$a_i$, para $i=1,\ldots,n-1$), n�o-crescente (ou seja, cada valor
	$a_{i+1}$ � menor ou igual a $a_i$, para $i=1,\ldots,n-1$), constante
	(todos os valores $a_i$ s�o iguais entre si, para $i=1,\ldots,n$), ou
	nenhuma dessas op��es (nem n�o-decrescente, nem n�o-decrescente, nem
	constante).
	*/
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt(); // l� n
		int[] a = new int[n]; 
		for (int i=0; i<n; i++)
			a[i] = entrada.nextInt(); // l� a_i (em a[i-1]
		System.out.print(testOrdem(a));
	} // fim main

	static String testOrdem(int[] a) {
		// Retorna mensagem indicando se "a" cont�m uma sequ�ncia 
		// constante, n�o-decrescente, n�o-crescente ou nenhuma dessas op��es
		boolean constante=true,
			naoDecresc = true, 	
			naoCresc = true;
		int v,prev;
		for (int i=1; i<a.length; i++) {
			v = a[i]; prev=a[i-1];
			if (v > prev) { naoCresc = false; constante = false; } else
			if (v < prev) { naoDecresc = false; constante = false; }
		}
		return (constante ? "Constante, n�o-decrescente e n�o-crescente" :
				naoCresc ? "N�o-crescente" :
				naoDecresc ? "N�o-decrescente" : 
					"Nem constante, nem n�o-crescente, nem n�o-decrescente");
	} // fim testOrdem
} // fim Q3	            