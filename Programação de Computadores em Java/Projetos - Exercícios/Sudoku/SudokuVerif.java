import java.io.*;

/** Lê configuração inicial e jogadas e verifica se as jogadas 
 * preenchem corretamente o tabuleiro, segundo as regras do jogo Sudoku. 
 *
 * Em caso positivo, imprime "Sucesso"; caso contrário, "Insucesso". 
 *
 * A configuração inicial indica 9 linhas, cada linha com 9 números
 * (incluindo 0 caso não haja número a ser colocado).
 */
class Sudoku {

    int n = 9; // tamanho de uma linha do jogo  
    int m = 3; // tamanho de uma linha de uma região do jogo
    int [][] jogo = new int[n][];

    Sudoku() { 
	for (int i=0; i<n; i++)  jogo[i] = new int[n]; }

    public static void main(String[] args) throws IOException {
	System.out.println (new Sudoku().joga("sudoku.dados")); }

    String joga (String nomeArq) throws IOException {
	BufferedReader f = new BufferedReader 
	    (new FileReader (new File (nomeArq)));
	Str s;
	for (int i=1; i<=n; i++) {
	    s = new Str(f.readLine());
	    preencheConfiguraçãoInicial(i-1, s); 
	}
        return lê_verifica_preenche_jogadas(f);
    }

    /** Preenche "jogo[i]" com valores inteiros contidos em "s" */
    void preencheConfiguraçãoInicial (int i, Str s) {
    
       // k = índice do 1o. caractere que não é um espaço.
	int k = s.pulaEspaços(0), 
            j = 0;
        Par p;
        while (j < n) {
            // p = {v1,v2}, v1 = inteiro a partir de s.charAt(k)
            //              v2 = índice depois desse inteiro 
	    p = s.proxInt(k); 
            k = p.v2; jogo[i][j] = p.v1;
            j++; 
	}
    }        

    String lê_verifica_preenche_jogadas (BufferedReader f)
        throws IOException {
	Str s; Jogada jogada;
	while (true) {
	    s = new Str(f.readLine());
            if (s.s==null || s.s.length() < 1 || 
                !Character.isDigit(s.s.charAt(0))) break;
	    jogada = new Jogada(s);

	    if (jogada.válida(this))
		jogo[jogada.i][jogada.j] = jogada.v;
	    else return "Insucesso: " + jogada.i + "," + jogada.j;
	}
	return jogoCompleto();
    }
    
    /** Retorna true sse v (onde v=jogo[i][j]) ocorre na *linha* i, 
     *  ou na *coluna* j, ou na *região* 3x3 do tabuleiro em que está
     *  a linha i e coluna j. 
     */
    boolean repete (int i, int j, int v) {

	// testa repetição na linha e coluna
	for (int k=0; k<n; k++) {
	    if (k != j && jogo[i][k]==v) return true;
	    if (k != i && jogo[k][j]==v) return true; 
	}

        // teste de repetição na região
	// testa repetição na diagonal principal, 
        // se lin,col está na diagonal principal
        int lin0 = i - i%m,  col0 = j - j%m;  
            // linha e coluna de início da região (e da diagonal rincipal)
        if (i%3 == j%3)
  	   for (int lin=lin0, col=col0; lin<lin0+m; lin++, col++) 
	      if ((lin != i || col!=j) && jogo[lin][col]==v) 
		  { System.out.println("repete diag principal");return true; }

        int linF = lin0+m-1, colF=col0+m-1; 
        // linF,colF = linha e coluna mais à direita da diagonal secundária

	// testa repetição na diagonal secundária, 
        // se lin,col está na diagonal secundária
        if (Math.abs(i%3 - j%3)!= 1)
  	  for (int lin=linF, col=colF; lin>lin0; lin--,col--)
	      if ((lin != i || col != j) && jogo[lin][col]==v) return true; 
	return false;
    }
    
    String jogoCompleto () {
	for (int i=0; i<n; i++)
	    for (int j=0; j<n; j++)
		if (jogo[i][j]==0) 
                   return "Insucesso (na posição " + i + "," + j + ")";
	return "Sucesso";
    }
}

class Par {
    int v1,v2;
    Par (int v1, int v2) { this.v1 = v1; this.v2 = v2; }
}

class Jogada {
    int i, j, v;

    Jogada (Str s) {
	int k = s.pulaEspaços(0);
        Par p = s.proxInt(k); i = p.v1; k = p.v2;
            p = s.proxInt(k); j = p.v1; k = p.v2;
            p = s.proxInt(k); v = p.v1; 
    }

    boolean válida (Sudoku jogo) {
	int [][] tabuleiro = jogo.jogo;
	return (i >=0 && i < tabuleiro.length &&
                j >=0 && j < tabuleiro.length && 
                tabuleiro[i][j] == 0 && 
                !jogo.repete(i,j,v));
    }
} 

class Str {
    String s; 
    
    Str (String s) { this.s = s; }

    /** Cria e retorna par de valores, onde o primeiro componente do par é um
     *  inteiro contido em "this.charAt(k)" e o segundo é ou índice de "this" 
     *  a partir do qual existe próximo inteiro, ou o último índice de "this".
     */
    Par proxInt (int k) {
	char c = s.charAt(k); int v = 0;
	while (Character.isDigit(c)) {
            v = v*10 + (c-'0'); 
            k++;
            if (k>=s.length()) break;
            else c = s.charAt(k);
	}
        return new Par (v, pulaEspaços(k));           
    }

    /** Retorna índice de "this" a partir de "k" 
     *  a partir do qual "this" não contém espaço.
     */
    int pulaEspaços (int k) {
	while (k < s.length() && Character.isWhitespace(s.charAt(k))) 
            k++;
        return k;
    }
}