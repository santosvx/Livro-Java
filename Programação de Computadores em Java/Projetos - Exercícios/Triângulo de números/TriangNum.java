/*
 * TriangNum.java
 *
 * Criado em 7 de Outubro de 2005, 11:03
 *
 */

/**
 *
 * @author Carlos Camar�o
 */
import javax.swing.*;

/** Este programa l� um valor "n" inteiro positivo e 
 *  imprime um tri�ngulo, com "n" linhas, da forma:
 *	       1
 *          2  3  4
 *       5  6  7  8  9
 *    10 11 12 13 14 15 16
 * 17 18 19 20 21 22 23 24 25
 * ... 
 *
 * Ou seja, a 1a. linha tem apenas o n�mero 1, cada linha tem dois
 * n�meros a mais que a linha anterior, o primeiro n�mero de cada linha �
 * um a mais do que o �ltimo n�mero da linha anterior, os n�meros em cada
 * linha est�o em ordem crescente, e os n�meros no tri�ngulo est�o
 * alinhados. O alinhamento dos n�meros � tal que cada n�mero de cada
 * linha � separado do seguinte por um ou mais espa�os, e o primeiro
 * d�gito de cada um dos n-2 n�meros mais internos de cada linha est�
 * sempre na mesma posi��o (coluna) do primeiro d�gito de um n�mero da
 * linha anterior.
 *
*/
class TriangNum {
        
    public static void main (String[] a) {  
        int n = Integer.parseInt(
  	  JOptionPane.showInputDialog("Digite o n�mero de linhas"));
	triangNum(n); 
        System.exit(0);
    }

    static void triangNum (int n) {
        int k = numDigs(n*n)+1; // n*n � o maior n�mero a ser impresso
	int e = (n-1)*k;     // n�mero de espa�os inicial da 1a. linha
        triangNum (1,1,e,k,1,n); 
    }

    static void triangNum (int prim, int q, int esp, int k, int lin, int n) {
	/* imprime tri�ngulo de n�meros com n linhas, sendo:
         * prim = primeiro valor da linha
         * q    = quantidade (n�mero) de valores a serem impressos
	 * esp  = n�mero de espa�os antes do primeiro n�mero da linha
         * k    = diferen�a entre n�mero de espa�os de linhas consecutivas
         * lin  = n�mero da linha
	 */
	if (lin <= n) {
	    int v = escreveLin(esp, prim, lin, q, k); 
	    triangNum(v+1, q+2, esp-k, k, lin+1, n);
	}
    }

    static int escreveLin (int esp, int prim, int lin, int q, int k) {
	/* imprime n-�sima linha do tri�ngulo de n�meros e retorna
         * �ltimo valor escrito, sendo:
         *  esp  = n�mero de espa�os antes do primeiro n�mero.
         *  prim = primeiro n�mero da linha 
         *  q    = quantidade de n�meros a serem impressos
         *  k    = n�mero de caracteres a serem impressos a cada n�mero,
         *         incluindo os espa�os
	 */
	int p = prim;
        escreveEspa�os(esp); 
	for (int i=1; i<=q; i++) {
	    escreve(p,k);
	    p++;
	}
	System.out.println();
	return p-1;
    }

    static void escreveEspa�os (int e) {
	for (int i=1; i<=e; i++) System.out.print(' ');
    }

    static void escreve (int v, int k) { 
	System.out.print(v); 
        escreveEspa�os(k - numDigs(v));
    }

    static int numDigs (int v) {
	if (v==0) return 0;
        else return 1 + numDigs(v/10);
    }
}
