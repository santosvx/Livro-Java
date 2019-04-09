package cap9;

/************************************************
*                                               *
*                 Fila.java                     *
*                                               *
*  Classe que implementa o tipo abstrato fila   * 
*-----------------------------------------------*/

class Fila
{ 
  protected Object[] fila;
  protected int inicio=0, fim=0, tam=0;

  Fila (int n)
  { fila = new Object[n]; }

  void insere(Object x) throws Exception
  { if (tam>=fila.length) throw new Exception("Fila cheia");
    else { fila[fim] = x;
           fim = (fim + 1) % fila.length;
           tam++; }
  }
 
  Object retira() throws Exception
  { if (tam<=0) throw new Exception("Fila vazia");
    else { tam--;
           Object x = fila[inicio];
           inicio = (inicio + 1) % fila.length;
             return x; }
  }
}