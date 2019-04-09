/*
 * TriangNum.java
 *
 * Criado em 7 de Outubro de 2005, 11:03
 *
 */

/**
 *
 * @author Carlos Camarão
 */
import javax.swing.*;

/** Este programa lê um valor "n" inteiro positivo e 
 *  imprime um triângulo, com "n" linhas, da forma:
 *	       1
 *          2  3  4
 *       5  6  7  8  9
 *    10 11 12 13 14 15 16
 * 17 18 19 20 21 22 23 24 25
 * ... 
 *
 * Ou seja, a 1a. linha tem apenas o número 1, cada linha tem dois
 * números a mais que a linha anterior, o primeiro número de cada linha é
 * um a mais do que o último número da linha anterior, os números em cada
 * linha estão em ordem crescente, e os números no triângulo estão
 * alinhados. O alinhamento dos números é tal que cada número de cada
 * linha é separado do seguinte por um ou mais espaços, e o primeiro
 * dígito de cada um dos n-2 números mais internos de cada linha está
 * sempre na mesma posição (coluna) do primeiro dígito de um número da
 * linha anterior.
 *
*/
class TriangNum {
        
    public static void main (String[] a) {  
        int n = Integer.parseInt(
  	  JOptionPane.showInputDialog("Digite o número de linhas"));
	triangNum(n); 
        System.exit(0);
    }

    static void triangNum (int n) {
        int k = numDigs(n*n)+1; // n*n é o maior número a ser impresso
	int e = (n-1)*k;     // número de espaços inicial da 1a. linha
        triangNum (1,1,e,k,1,n); 
    }

    static void triangNum (int prim, int q, int esp, int k, int lin, int n) {
	/* imprime triângulo de números com n linhas, sendo:
         * prim = primeiro valor da linha
         * q    = quantidade (número) de valores a serem impressos
	 * esp  = número de espaços antes do primeiro número da linha
         * k    = diferença entre número de espaços de linhas consecutivas
         * lin  = número da linha
	 */
	if (lin <= n) {
	    int v = escreveLin(esp, prim, lin, q, k); 
	    triangNum(v+1, q+2, esp-k, k, lin+1, n);
	}
    }

    static int escreveLin (int esp, int prim, int lin, int q, int k) {
	/* imprime n-ésima linha do triângulo de números e retorna
         * último valor escrito, sendo:
         *  esp  = número de espaços antes do primeiro número.
         *  prim = primeiro número da linha 
         *  q    = quantidade de números a serem impressos
         *  k    = número de caracteres a serem impressos a cada número,
         *         incluindo os espaços
	 */
	int p = prim;
        escreveEspaços(esp); 
	for (int i=1; i<=q; i++) {
	    escreve(p,k);
	    p++;
	}
	System.out.println();
	return p-1;
    }

    static void escreveEspaços (int e) {
	for (int i=1; i<=e; i++) System.out.print(' ');
    }

    static void escreve (int v, int k) { 
	System.out.print(v); 
        escreveEspaços(k - numDigs(v));
    }

    static int numDigs (int v) {
	if (v==0) return 0;
        else return 1 + numDigs(v/10);
    }
}
