package cap6;

//Sup�e classe Data definida no mesmo pacote (an�nimo).
//Ou seja, sup�e Data.class acess�vel ao compilar esse arquivo.

class Ex6_7 // usa classe Conta
{ 
	public static void main (String[] a)
 { Data hoje       = new Data (8,10,2003);
   ContaEspecial c = new ContaEspecial (1,"Carlos Camar�o", "1111", 
                                      hoje, "xpto", -200);
   c.dep�sito(1000);
   c.saque(1100);
   System.out.println("saldo = " + c.saldo());
 }
}

class ContaEspecial extends Conta
{ protected double limite;

ContaEspecial (int num, String nome, String cpf,
              Data d, String senha, double lim)
 { super(num,nome,cpf,d,senha); 
   limite = lim; // O valor limite � suposto negativo.
                 // Na pr�tica, claro que isso deveria ser testado,
                 // mas esse n�o est� no enunciado e n�o � o objetivo 
                 // do exerc�cio.
}

void saque (double valor)
 { if (saldo-limite >= valor) saldo -= valor; }
}