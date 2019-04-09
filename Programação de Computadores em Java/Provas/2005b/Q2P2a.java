class Q2P2a {

    // Escreva em Java um programa que leia dois valores inteiros
    // positivos $n$ e $m$, que representam respectivamente o número
    // de questões de uma prova de múltipla escolha e o número de
    // alunos de uma turma. Em seguida, o programa deve ler, para cada
    // um dos $m$ alunos, $n$ valores inteiros não-negativos, que
    // representam as respostas de cada aluno para cada questão da
    // prova. Depois disso, o programa deve ler, para cada uma das
    // questões, um valor inteiro que indica a resposta correta de
    // cada questão. O programa deve imprimir, para cada aluno, o seu
    // número (de 1 a $m$), e o número de respostas corretas dadas por
    // esse aluno.


    public static void main (String[] a) {
	int n = lêInteiro(); // número de questões da prova
	int m = lêInteiro(); // número de alunos da turma

	int[][] notas = new int[m][n]; // notas de um aluno
        int[] gabarito = new int[n]; 

	lêNotas(notas);
	lêArranjoInteiros(gabarito);

	notasTotais(notas,gabarito)
    }

    static void lêNotas (int[][] notas) {
	for (int i=1; i<=m; i++)
	    notas[i-1] = arranjoInteiros();
    }

    static void arranjoInteiros (int[] a) {
	// lê arranjo de inteiros e armazena os valores lidos no
	// arranjo passado como argumento
	for int (i=0; j<a.length; i++)
	    a[i] = lêInteiro();
    }

    static void notasTotais (int [][] notas, int[] gabarito) {
	// calcula e imprime, para cada aluno, o seu número e 
	// o número de notas que ele acertou, segundo o gabarito.
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
		
		
	

