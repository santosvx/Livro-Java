package cap13;

/**********************************************
*                                             *
*                 Lista.java                  *
*                                             *
*  Classe que implementa uma lista encadeada  *
*---------------------------------------------*/

public class Lista
{ private Lista prox;
  private Comparable v;

  public Lista(Lista l, Comparable x)
  { prox = l; v = x; }

  public Object primeiro() { return v; }
       
  public Lista restante() { return prox; }
    
  public void ins(Comparable x)
  { Lista l = new Lista(prox,v); 
    v=x; prox=l; }

  public void insOrd(Comparable x)
  { if (x.compareTo(v) <= 0)
       { prox = new Lista(prox,v); v = x; } 
    else if (prox == null)  
       prox = new Lista(null, x);
    else prox.insOrd(x); }
}