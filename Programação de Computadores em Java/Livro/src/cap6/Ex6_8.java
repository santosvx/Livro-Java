package cap6;

//Supõe classes Data e Conta definidas no mesmo pacote (anônimo).
//Ou seja, supõe Data.class e Conta.class acessíveis ao compilar esse arquivo.

class Ex6_8 // usa classe Conta
{ 
	public static void main (String[] a)
 { Data hoje     = new Data (8,10,2003);
   ContaInvest c = new ContaInvest (1,"Carlos Camarão", "1111", 
                                  hoje, "xpto", 200);
   c.depósito(1000);
   c.saque(800);
   System.out.println("saldo = " + c.saldo());
   System.out.println("rendimentos = " + c.rendimentos(0.1));
   System.out.println("saldo depois dos rendimentos = " + c.saldo());
 }
}

class ContaInvest extends Conta
{ protected double menorSaldoMensal;

ContaInvest (int num, String nome, String cpf,
            Data d, String senha, double depósito)
 { super(num,nome,cpf,d,senha); 
   saldo = menorSaldoMensal = depósito;
 }
 
void saque (double valor)
 { if (saldo >= valor) 
	{ saldo -= valor; 
	  if (saldo < menorSaldoMensal)
	      menorSaldoMensal = saldo;
	}
 }

double rendimentos (double taxa) 
 { double rendMensal = taxa * menorSaldoMensal;
   saldo += rendMensal;
   menorSaldoMensal = saldo;
   return rendMensal;
 }
}