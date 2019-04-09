package cap12;

/*******************************************************************
*                                                                  *
*            ImprimeNotas.java                                     *
*                                                                  *
*  Programa para impressao das notas de alunos em uma disciplina,  *
*  armazenadas no arquivo passado como argumento para o programa   *
*------------------------------------------------------------------*/
import java.io.*;
import java.lang.*;

class ImprimeNotas
{ public static void main (String[] a) throws IOException
  { PrintStream fo     = System.out;
    DataInputStream fi = new DataInputStream(new FileInputStream(a[0]));
    int numAlunos      = fi.readInt();
    int numAvaliacoes  = fi.readInt();

    Disciplina d = new Disciplina(numAlunos, numAvaliacoes);

    for (int i=0; i<numAlunos; i++)
 	for (int j=0; j<numAvaliacoes; j++)
            d.atribuiNota(i,j,fi.readInt());

    d.calcNotas();

    for (int i=0; i<numAlunos; i++)
        { fo.print("Nota final do aluno "); fo.print(i+1);
	  fo.print(": "); fo.println(d.notaFinal(i)); fo.println(""); }

    fo.print("Media de notas da turma = "); fo.println(d.mediaNotas());
  }
}