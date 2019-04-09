package cap10;

/**************************************************************
*                                                             *
*                 Poligono.java                               *
*                                                             *
*  Classe abstrata que representa poligonos,                  *
*  e duas subclasses dessa classe: Triangulo e Retangulo      *
*-------------------------------------------------------------*/

abstract class Poligono
{ public float dim[]; public String nome;

  abstract float area();
}

class Triangulo extends Poligono
{ Triangulo (float base, float altura)
  { dim = new float[2]; 
    dim[0] = base; dim[1] = altura;
    nome = "Triangulo"; } 

  public float area ()
  { return dim[0] * dim[1] / 2; }
}

class Retangulo extends Poligono
{ Retangulo (float comprimento, float largura)
  { dim = new float[2]; 
    dim[0] = comprimento; dim[1] = largura;
    nome = "Retangulo"; } 

  public float area () 
  { return dim[0] * dim[1]; }
}