package cap9;

/*************************************************************
*                MaiFreq.java                                * 
*  Determina o algarismo que ocorre com maior frequencia     *
*  no string passado como argumento na iniciacao do programa *
*  (supoe que esse string contem apenas algarismos)          *
*------------------------------------------------------------*/

class MaisFreq
{ 
	static char MaisFreq (String s)
  { int[] dig = new int[10];

    for (int i=0; i<10; i++) dig[i] = 0;
    for (int i=0; i<s.length(); i++)
	dig [s.charAt(i) - '0'] ++; 

    int freqMax = 0, digMaisFreq = 0;
    for (int i=0; i<10; i++)
	if (dig[i] > freqMax) { freqMax = dig[i]; digMaisFreq = i; }

    return (char)(digMaisFreq + '0');
  }

  public static void main (String[] arg)
  { System.out.println(MaisFreq(arg[0])); }
}


