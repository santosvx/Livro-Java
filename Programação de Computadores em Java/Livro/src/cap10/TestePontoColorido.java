package cap10;

/********************************************************
*                                                       *
*                 TestePontoColorido.java               *
*                                                       *
*       Exemplo de associacao dinamica de metodos       *
*--------------------------------------------------------*/

class Ponto
{ int x, y;
  final int LIMITE = 50;

  void move (int dx, int dy)
  { x+=dx; y+=dy;
    if (Math.abs(x)>=LIMITE || Math.abs(y)>=LIMITE) 
       limpa(); }

  void limpa()
  { System.out.println("\t limpa Ponto");
    x = y = 0; } 
}

class PontoColorido extends Ponto
{ int cor;

  void limpa()
  { System.out.println("\t limpa PontoColorido");
    super.limpa(); cor = 0; }
}

class TestePontoColorido
{ public static void main(String[] a)
  { Ponto p = new Ponto();
    System.out.println("p.move(50,50)");
    p.move(50,50);
    PontoColorido pc = new PontoColorido();
    System.out.println("pc.move(50,50)");
    pc.move(50,50);
    p = pc;
    System.out.println("p.move(50,50), p colorido");
    p.move(50,50);  }
}