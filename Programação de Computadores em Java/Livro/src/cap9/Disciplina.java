package cap9;

/***********************************************************
*                Disciplina.java                           * 
*                                                          *
* Classe que representa notas de alunos em uma disciplina  *
*----------------------------------------------------------*/
import ArranjoDeInteiros;

class Disciplina
{ 
  private ArranjoDeInteiros[] notasParciais;
  private ArranjoDeInteiros notasFinais;
  private float media; 

  Disciplina(int numAlunos, int numAvaliacoes) 
  { notasParciais = new ArranjoDeInteiros[numAlunos];
    for (int i=0; i<numAlunos; i++) 
        notasParciais[i] = new ArranjoDeInteiros(numAvaliacoes);
    notasFinais = new ArranjoDeInteiros(numAlunos); 
  }        

  public void atribuiNota (int i, int j, int nota)
  { notasParciais[i].a[j] = nota; }

  public int notaFinal (int i)
  { return notasFinais.a[i]; }

  public float mediaNotas()
  { return media; }

  void calcNotas()
  { int n = notasParciais.length; // n = numero de alunos
    notasFinais = new ArranjoDeInteiros(n);
    for (int i=0; i<n; i++)
        notasFinais.a[i] = notasParciais[i].soma();
    media = notasFinais.media();
  }
}