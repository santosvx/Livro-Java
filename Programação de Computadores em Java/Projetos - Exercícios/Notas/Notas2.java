import java.io.*;
import java.util.ArrayList;

class Notas {

    public static void main(String[] args) throws IOException {
	imprime("notas.totais",soma(l�Notas("notas.txt")));
    }

    static ArrayList[] l�Notas(String nomeArq) throws IOException {
	BufferedReader f = new BufferedReader 
	    (new FileReader (new File (nomeArq)));
	String s         = f.readLine();
	int n            = Integer.parseInt(s);
        ArrayList[] arr = new ArrayList[n];
	for (int i=0; i<n; i++) {
	    s = f.readLine();
            arr[i] = new ArrayList();
	    preenche(arr[i], s); 
	}
        return arr;
    }

    static void preenche (ArrayList vs, String s) {
        // Preenche "arr[i]" com valores inteiros contidos em "s"
	int k  = pulaEspa�os(s,0), j = 1;
        while (maisInteiros(s,k))
	    k = proxInt(s,k,vs);
    }

    static boolean maisInteiros (String s, int k) {
	// Retorna se existem mais inteiros contidos a partir de 
        // "s.charAt(k)"
	return (k < s.length() && Character.isDigit(s.charAt(k))); }

    static int proxInt (String s, int k, ArrayList vs) {
	// Armazena em "vs" inteiro contido em "s.charAt(k)" e 
        // retorna ou �ndice de "s" a partir do qual existe pr�ximo inteiro, 
        // ou o �ltimo �ndice de "s".
	char c = s.charAt(k); int v = 0;
	while (Character.isDigit(c)) {
            v = v*10 + (c-'0'); 
            k++;
            if (k>=s.length()) break;
            else c = s.charAt(k);
	}
        vs.add(new Integer(v));
	return pulaEspa�os(s,k);
    }

    static int pulaEspa�os (String s, int k) {
	// Retorna �ndice de "s" a partir de "k" 
        // a partir do qual "s" n�o cont�m espa�o.
	while (k < s.length() && Character.isWhitespace(s.charAt(k))) 
            k++;
        return k;
    }
     
    static int[] soma (ArrayList[] arr) {
	// Cria e retorna arranjo vs tal que vs[i] cont�m
	// soma dos valores contidos no arranjo "arr[i]". 
	int[] vs = new int [arr.length];
	for (int i=0; i<arr.length; i++)
	    for (int j=0; j<arr[i].size(); j++) {
		vs[i] += ((Integer)arr[i].get(j)).intValue(); 
	    }
	return vs;
    }

    static void imprime (String nomeArq, int[] vs) 
        throws IOException {
	// Cria arquivo de nome "nomeArq" e imprime nesse arquivo
        // valores contidos em "vs", um por linha.
	PrintWriter f = new PrintWriter
	    (new BufferedWriter(new FileWriter(new File(nomeArq))));
	for (int i=0; i<vs.length; i++) 
	    f.println(vs[i]);
	f.flush(); f.close();
    }
}	    
	    