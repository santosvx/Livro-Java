import java.util.Scanner;
public class Q2 {
	/* Escreva um programa que leia um valor inteiro positivo $n$,
	em seguida $n$ valores inteiros positivos $v_1,v_2,\ldots, v_n$,
	depois um valor positivo $m$, e imprima o valor resultante do cálculo
	de:

	   \[ ((m-1) \times v_1) + ((m-2) \times v_2) + \ldots + ((m-n)\times v_n) \]

	Os valores devem ser lidos do dispositivo de entrada padrão e podem
	estar separados entre si por um ou mais espaços ou linhas.

    */
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt(); // lê n
		int[] v = new int[n];
		for (int i=0; i<n; i++) 
			v[i] = entrada.nextInt(); // lê v_i (em v[i-1])
		int m = entrada.nextInt();
		int soma=0;  
		for (int i=1; i<n; i++) 
			soma += (m-i) * v[i-1];
		System.out.println(soma);
	}

}