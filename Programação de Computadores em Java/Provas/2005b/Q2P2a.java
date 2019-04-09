class Q2P2a {

    // Escreva em Java um programa que leia dois valores inteiros
    // positivos $n$ e $m$, que representam respectivamente o n�mero
    // de quest�es de uma prova de m�ltipla escolha e o n�mero de
    // alunos de uma turma. Em seguida, o programa deve ler, para cada
    // um dos $m$ alunos, $n$ valores inteiros n�o-negativos, que
    // representam as respostas de cada aluno para cada quest�o da
    // prova. Depois disso, o programa deve ler, para cada uma das
    // quest�es, um valor inteiro que indica a resposta correta de
    // cada quest�o. O programa deve imprimir, para cada aluno, o seu
    // n�mero (de 1 a $m$), e o n�mero de respostas corretas dadas por
    // esse aluno.


    public static void main (String[] a) {
	int n = l�Inteiro(); // n�mero de quest�es da prova
	int m = l�Inteiro(); // n�mero de alunos da turma

	int[][] notas = new int[m][n]; // notas de um aluno
        int[] gabarito = new int[n]; 

	l�Notas(notas);
	l�ArranjoInteiros(gabarito);

	notasTotais(notas,gabarito)
    }

    static void l�Notas (int[][] notas) {
	for (int i=1; i<=m; i++)
	    notas[i-1] = arranjoInteiros();
    }

    static void arranjoInteiros (int[] a) {
	// l� arranjo de inteiros e armazena os valores lidos no
	// arranjo passado como argumento
	for int (i=0; j<a.length; i++)
	    a[i] = l�Inteiro();
    }

    static void notasTotais (int [][] notas, int[] gabarito) {
	// calcula e imprime, para cada aluno, o seu n�mero e 
	// o n�mero de notas que ele acertou, segundo o gabarito.
	int acertos;
	for (int i=0; i<notas.length; i++) {
	    acertos = 0;
	    for (j=0; j<gabarito.length; j++) 
		if (notas[i][j] == gabarito[j]) acertos++;
	    imprime(i, acertos);
	}
    }

    static void imprime (int n, int i) {
	System.out.print(n + " ");
	System.out.println(i);
    }
}
		
		
	

