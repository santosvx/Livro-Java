package cap10;

/**************************************************************
*                                                             *
*                 TestePoligono.java                          *
*                                                             *
*  Exemplo de definicao de subclasses e associacao dinamica   *
*-------------------------------------------------------------*/
import Poligono;

class TestePoligono
{ public static void main (String[] a)
  { int n=4; 
    Poligono[] pols = new Poligono[n];
    pols[0] = new Triangulo(1,2);
    pols[1] = new Retangulo(1,2);
    pols[2] = new Triangulo(3,4);
    pols[3] = new Retangulo(3,4);
    for (int i=0; i<n; i++)
        System.out.println(pols[i].nome + ": " + "area = " + pols[i].area()); }
}