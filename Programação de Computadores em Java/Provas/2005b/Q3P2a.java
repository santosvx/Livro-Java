class Q3P2a {
    // Madame Zen � uma figura m�stica que, al�m de prever o futuro
    // lendo a m�o das pessoas, acredita que a freq��ncia de
    // ocorr�ncia dos d�gitos na representa��o decimal dos fatoriais
    // de n�meros naturais est� relacionada ao futuro das pessoas. Ela
    // decidiu vender seus servi�os, fazendo previs�es sobre a vida de
    // seus fregueses, baseadas nessas freq��ncias, e pediu voc� para
    // ajud�-la, determinando esses valores para ela.

    // Ela espera usar dados de entrada como os dias da semana, do m�s
    // e do ano como valores de entrada, que s�o valores positivos
    // menores ou iguais a 365, e voc� deve ent�o fazer um programa
    // que leia uma lista de n�meros naturais e imprima, para cada um,
    // o n�mero de ocorr�ncias de cada d�gito decimal na representa��o
    // decimal do fatorial desse n�mero. O programa deve terminar
    // quando o n�mero lido for maior do que 365 ou menor ou igual a
    // zero.

    // Por exemplo, para a entrada:

    //     3 
    //     8
    //     100
    //     0
 
    // o programa deve imprimir uma tabela como a seguinte (3!=6,
    // 8!=40310, 10!=3628800):

    // 3! 
    // (0)    0    (1)    0    (2)    0    (3)    0    (4)    0
    // (5)    0    (6)    1    (7)    0    (8)    0    (9)    0
    // 8!
    // (0)    2    (1)    0    (2)    1    (3)    1    (4)    1
    // (5)    0    (6)    0    (7)    0    (8)    0    (9)    0
    // 10!
    // (0)    2    (1)    0    (2)    1    (3)    1    (4)    0
    // (5)    0    (6)    1    (7)    0    (8)    2    (9)    0

    // Os dados devem ser lidos do dispositivo de entrada padr�o.

    public static void main (String[] a) {
	int n;
	do {
	    try {
		n = l�Inteiro();
		if (n>365 || n<0) break;
		imprimeTab(String.valueOf(fat(n)));
	    }
	    catch (NumberFormatException e) {
		System.out.println("Valor digitado deve ser um inteiro");
		main (null);
	    }	
	    while (true);
	}
    }

    static int fat (int n) {
	if (n==0) return 1;
	else return n * fat(n-1);
    }

    static void imprimeTab (String s) {
	int[] freq = new int[10];
	for (int i=0; i<s.length; i++)
	    freq[s.charAt(i)-'0']++;
	for (int i=0; i<10; i++)
	    imprime(i,freq[i]);
    }

    static void imprime (int i, int n) {
	System.out.print("(" + i + ")\t" + freq[i]);
        if (i % 4 == 0) System.out.println();
    }
}
	
