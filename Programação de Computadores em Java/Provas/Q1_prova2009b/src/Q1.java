import java.util.Scanner;

public class Q1 {

	/* Escreva um programa que leia um número inteiro positivo $n$, 
	em seguida $n$ valores inteiros positivos $v_1,\ldots, v_n$, depois um
	valor inteiros $m$ e um valor inteiro positivo $k$, e imprima todos os
	valores dentre $v_1,\ldots, v_n$ que são maiores que $m$.

	Os valores devem ser lidos do dispositivo de entrada padrão e podem
	estar separados entre si por um ou mais espaços ou linhas.

	A saída deve imprimir os valores separados por um espaço, e contendo
	no máximo $k$ valores por linha: a cada $k$ valores impressos deve ser
	impresso um caractere de terminação de linha
	
	*/
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt(); // lê n
		int[] v = new int[n]; 
		for (int i=0; i<n; i++)
			v[i] = entrada.nextInt(); // lê v_i (em v[i-1])
		int	m = entrada.nextInt(); // lê m
		int k = entrada.nextInt(); // lê k
		
		for (int i=0,impressos=0; i<n; i++) { 
			// imprime valores de v maiores que m, pulando de linha sempre que
			// 	k valores forem impressos
			int vi = v[i];
			if (vi>m) {
				System.out.print(vi + " ");
				impressos++;
				if (impressos == k) {
					impressos = 0;
					System.out.println();
				} // fim if
			} // fim if
		} // fim for
	} // fim main
} // fim Q1