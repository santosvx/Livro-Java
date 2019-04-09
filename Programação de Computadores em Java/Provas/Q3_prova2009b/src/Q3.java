import java.util.Scanner;
public class Q3 {

	/* Escreva um programa que leia um inteiro positivo $n$, depois
	$n$ valores inteiros $a_1, \ldots, a_n$, e imprima uma mensagem
	indicando se a sequência de valores $a_1, \ldots, a_n$ é
	não-decrescente (ou seja, cada valor $a_{i+1}$ é maior ou igual a
	$a_i$, para $i=1,\ldots,n-1$), não-crescente (ou seja, cada valor
	$a_{i+1}$ é menor ou igual a $a_i$, para $i=1,\ldots,n-1$), constante
	(todos os valores $a_i$ são iguais entre si, para $i=1,\ldots,n$), ou
	nenhuma dessas opções (nem não-decrescente, nem não-decrescente, nem
	constante).
	*/
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt(); // lê n
		int[] a = new int[n]; 
		for (int i=0; i<n; i++)
			a[i] = entrada.nextInt(); // lê a_i (em a[i-1]
		System.out.print(testOrdem(a));
	} // fim main

	static String testOrdem(int[] a) {
		// Retorna mensagem indicando se "a" contém uma sequência 
		// constante, não-decrescente, não-crescente ou nenhuma dessas opções
		boolean constante=true,
			naoDecresc = true, 	
			naoCresc = true;
		int v,prev;
		for (int i=1; i<a.length; i++) {
			v = a[i]; prev=a[i-1];
			if (v > prev) { naoCresc = false; constante = false; } else
			if (v < prev) { naoDecresc = false; constante = false; }
		}
		return (constante ? "Constante, não-decrescente e não-crescente" :
				naoCresc ? "Não-crescente" :
				naoDecresc ? "Não-decrescente" : 
					"Nem constante, nem não-crescente, nem não-decrescente");
	} // fim testOrdem
} // fim Q3	            