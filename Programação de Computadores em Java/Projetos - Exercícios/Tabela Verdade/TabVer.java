/*
 * TabVer.java
 *
 * Criado em 6 de Outubro de 2005, 23:36
 *
 */

import javax.swing.*;

/**
 * Programa para impressão de possíveis entradas de Tabelas-Verdade.
 * Um valor inteiro positivo "n" é lido e são impressas 2^n linhas,
 * cada uma contendo uma seqüência distinta de 0s e 1s correspondente a
 * cada entrada possível de Tabelas-Verdade com "n" variáveis. 
 *
 * Vamos chamar essa seqüência de linhas, com um caractere '|' entre
 * cada valor (zero ou um) da tabela, de "PETV" (Possíveis Entradas de
 * Tabelas Verdade).
 *
 * Os valores são impressos no dispositivo de saída padrão.
 * Eles podem ser impressos em um arquivo usando "redirecionamento" da
 * saida padrão, na interpretação do programa. Por exemplo, iniciando a 
 * execução do interpretador Java com o comando: 
 *                "java TabVer > xpto" 
 * é criado um arquivo de nome "xpto" que conterá os dados impressos pela
 * interpretação do programa "TabVer".
 *
 *@author Carlos Camarão
*/
public class TabVer {
    
   /** Método no qual é iniciada a interpretação do programa.
    * Chama seqüencialmente métodos para realizar a entrada de dados
    * (valor inteiro "n" que indica o número de linhas da PETV), 
    * e geração e impressão da PETV.
    */
    public static void main (String[] a) {
	int n;
	while (true) {
	    String entrada = JOptionPane.showInputDialog
				 ("Digite um inteiro: ");
            if (entrada == null) System.exit(0); 
            else {  n = Integer.parseInt(entrada);
                    if (n<0) break;
                    String s = genTab(n);
                    System.out.println(s);
                 }
	}
    }

    /** Recebe como argumento inteiro "n" que indica o número de
     *  linhas da PETV e retorna a PETV.  Para isso, cria a "PETV
     *  linearizada", ou seja, a seqüência de linhas sem os caracteres
     *  '\n' de quebra-de-linha e sem os caracteres '|' que separam
     *  cada valor (zero ou um), e em seguida "formata" a PETV
     *  linearizada, isto é, insere os caracteres '|' entre os valores
     *  e os caracteres '\n' para criação das linhas da PETV.
     */ 
    public static String genTab (int n) {
	String s = genTabLin(n), t = "";

	for (int i=0; i<s.length(); i+=n) 
	    t += formata(s.substring(i,i+n));
	return t;
    }    

    /** Insere caracteres '|' entre cada valor de uma PETV linearidada
     *  recebida como argumento, e caracteres '\n' que criam as linhas
     *  da PETV.
     */
    public static String formata (String s)
    {
	return "|" + barrinhasDepoisDeDígitos(s) + "\n";
    }

    /** Insere caracteres '|' depois de cada elemento da cadeia de
     *  caracteres recebida como argumento e retorna a cadeia
     *  resultante.
     */
    public static String barrinhasDepoisDeDígitos (String s)
    {
	String t = "";
	for (int i=0; i < s.length(); i++)
	    t += s.charAt(i) + "|";
	return t;
    }

    /** Recebe como argumento valor inteiro positivo "n" e retorna
     * PETV linearizada, correspondente a uma PETV com "n" linhas.
     */
    public static String genTabLin (int n) {
	if (n==1) return "01";
	else {
	    int k=n-1;
	    String s = genTabLin(k), t="";
	    for (int i=0; i<s.length(); i+=k)
		t += "0" + s.substring(i,i+k);
	    for (int i=0; i<s.length(); i+=k)
		t += "1" + s.substring(i,i+k);
	    return t;
	}
    }
}

