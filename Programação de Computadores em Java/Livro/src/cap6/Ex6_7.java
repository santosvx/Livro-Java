package cap6;

//Supõe classe Data definida no mesmo pacote (anônimo).
//Ou seja, supõe Data.class acessível ao compilar esse arquivo.

class Ex6_7 // usa classe Conta
{ 
	public static void main (String[] a)
 { Data hoje       = new Data (8,10,2003);
   ContaEspecial c = new ContaEspecial (1,"Carlos Camarão", "1111", 
                                      hoje, "xpto", -200);
   c.depósito(1000);
   c.saque(1100);
   System.out.println("saldo = " + c.saldo());
 }
}

class ContaEspecial extends Conta
{ protected double limite;

ContaEspecial (int num, String nome, String cpf,
              Data d, String senha, double lim)
 { super(num,nome,cpf,d,senha); 
   limite = lim; // O valor limite é suposto negativo.
                 // Na prática, claro que isso deveria ser testado,
                 // mas esse não está no enunciado e não é o objetivo 
                 // do exercício.
}

void saque (double valor)
 { if (saldo-limite >= valor) saldo -= valor; }
}