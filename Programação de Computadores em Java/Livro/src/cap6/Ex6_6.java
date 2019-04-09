package cap6;

//Supõe classe Data definida no mesmo pacote (anônimo).
//Ou seja, supõe Data.class acessível ao compilar esse arquivo

class Ex6_6 // usa classe Conta
{ 
	public static void main (String[] a)
{ Data hoje = new Data (8,10,2003);
 Conta c   = new Conta (1,"Carlos Camarão", "1111", hoje, "xpto");
 c.depósito(1000);
 c.saque(500);
 System.out.println("saldo = " + c.saldo());
}
}

class Conta
{ protected int num;      // O uso de "protected" teria que ser explicado 
                       // na aula sobre a solução desse exercício
protected String correntista;
protected String cpf;
protected Data dataAbertura;
protected String senha;
protected double saldo; // O saldo poderia ter inteiro, se o valor 
                       // armazenado representasse o saldo*100, 
                       // o que poderia ser vantajoso para evitar 
                       // erros de arredondamento de valores de tipo double

Conta (int num, String nome, String cpf,
      Data d, String senha)
{ this.num = num;     correntista  = nome;
 this.cpf = cpf;     dataAbertura = d;
 this.senha = senha; saldo        = 0.0;
}

void depósito (double valor)
{ saldo += valor; }

void saque (double valor)
{ if (saldo >= valor) saldo -= valor; }

double saldo() { return saldo; }
}
