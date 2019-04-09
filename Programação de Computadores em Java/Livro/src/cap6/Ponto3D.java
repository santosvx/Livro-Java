package cap6;

/********************************************************
*                                                       *
*            Ponto3D.java                               *
*                                                       *
*-------------------------------------------------------*/

class Ponto
{ 
	int x, y;

  Ponto (int a, int b) { x=a; y=b; } 

  void move (int dx, int dy) 
  { x+=dx; y+=dy; }

  double distancia (Ponto p) 
  { int dx = this.x - p.x;
    int dy = this.y - p.y;
    return Math.sqrt(dx*dx+dy*dy); } 
}

class Ponto3D extends Ponto 
{ 
	int z;

  Ponto3D (int a, int b, int c)
  { super(a,b); z=c; }

    void move (int a, int b, int c)
    { super.move (a,b); z+=c; }

    double distancia (Ponto3D p) 
    { int dx = x - p.x;
      int dy = y - p.y;
      int dz = z - p.z;
      return Math.sqrt(dx*dx + dy*dy + dz*dz); }
}
