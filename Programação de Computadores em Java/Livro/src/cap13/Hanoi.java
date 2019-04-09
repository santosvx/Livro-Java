package cap13;

/****************************************************
*                                                   *
*            Hanoi.java                             *
*                                                   *
*  Classe que implementa movimentacao dos discos    *
*       no problema das Torres de Hanoi             *
*---------------------------------------------------*/
import java.util.List;

class Hanoi
{ static void move(Torre tA, Torre tB, Torre tC)
  { if (tA.numDiscos() == 1)
       System.out.println("move " + tA.topo() +
                          " de " + tA.nome + " para " + tB.nome); 
    else { Torre tA1 = new Torre(tA.nome, tA.todosMenosUltimo());
           move(tA1,tC,tB); 
           Torre tA2  = new Torre(tA.nome, tA.apenasUltimo());
           move(tA2,tB,tC); 
           tC.discos = tA1.discos;
           move(tC,tB,tA); } }
}

class Torre
{ String nome; List discos;

  Torre(String s, List discos)
  { nome = s; this.discos = discos; }

  int numDiscos()         { return discos.size(); } 
  int topo()              { return ((Integer) discos.get(0)).intValue(); }
  List todosMenosUltimo() { return discos.subList(1,discos.size()); }
  List apenasUltimo()     { return discos.subList(0,1); }
}