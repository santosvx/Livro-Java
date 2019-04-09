class madameMin {
    public static void main (String[] args) {
	try {
	    int x = lêInteiro(); 
	    PrinWriter f = new OutputWriter(System.out);
	    while (x > 0 && x < 365) imprime(f, x);
	    catch (Exception e) { }
    }

    public static void fat (String[] n) {
	if (n==0) return 1;
	else return n * fat(n-1);
    }

    public static void numOcorrências (int dígito, int n) {
	
    }

    public static void imprime (PrintWriter f, int n) {
	f.print(n); f.println('!');
	for (int i=0; i++; i<=9) 
	    imprimeDig(i, numOcorrências(i,n); 
    }
}