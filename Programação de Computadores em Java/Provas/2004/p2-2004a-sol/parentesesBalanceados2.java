class BalancedParentheses {
    char toMatch;

    static boolean hasBalancedParenteses (String s, int begin, int end) {
	if (begin>end) return True; 
	else 
	    {  toMatch = s.charAt(begin);
		if (hasBalancedParentheses(s, begin+1, end-1))
		   return match(toMatch,hasBalancedParentheses(s.charAt(end));
				else return false;

if (s.charAt(0) == '(' && s.charAt(s.length-1) = ')' and
		 }
    }
}

class Main {
    public static void main (String[] args) {
    }
}