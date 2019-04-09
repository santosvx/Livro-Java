class Q3P1 {

    //  Escreva em Java um programa para imprimir a seguinte tabela:

    //  1  2  3  4   5   6   7   8   9  10
    //  2  4  6  8   10  12  14  16  18
    //  3  6  9  12  15  18  21  24
    //  ...
    //  8  16  24
    //  9  18 
    //  10 

    public static void main (String[] a) {
	int numCols = 10;
	for (int lin=1; lin<=10; lin++) {
	    for (int n=lin,col=lin; n<=10; n++,col+=lin) 
		System.out.print(col + (col<10? "  " : " "));
	    System.out.println();
	}
    }
