package cap2;

/********************************************************
*                                                       *
*                   Ponto.java                          *
*                                                       *
*         Primeiro exemplo de definicao de classe       *
*-------------------------------------------------------*/
class Ponto
{ int x, y;

  Ponto (int a, int b) { x=a; y=b; } 

  void move (int dx, int dy) 
  { x+=dx; y+=dy; }

  double distancia (Ponto p) 
  { int dx = this.x - p.x;
    int dy = this.y - p.y;
    return Math.sqrt(dx*dx+dy*dy); } 
}

class ExemploPonto 
{ public static void main(String[] a) 
  { Ponto p1 = new Ponto(0,0); 
    Ponto p2 = new Ponto(10,20); 
    p1.move(3,25); 
    p2.move(1,14); 
    System.out.println(p1.distancia(p2)); } 
}