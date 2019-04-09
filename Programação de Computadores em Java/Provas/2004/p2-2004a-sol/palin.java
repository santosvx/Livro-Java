class palin {
    public static void main (String[] args) {
	
    }

    public static void isPalin (String s, int begin, int end) {
	if (s.length() <= 1 || begin>=end) return true;
	else if (s.charAt(begin) == s.charAt(end))
	    return isPalin(s,begin+1,end-1);
    }

    public static String converte(int n, int base) {
	String r ="";
	while (n > 0) {
	    r += n % base;
	    n = n / base;
	}
	return r;
    }
}