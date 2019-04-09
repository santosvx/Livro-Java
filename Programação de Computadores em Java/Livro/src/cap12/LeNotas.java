package cap12;

/*******************************************************************
*                                                                  *
*                 LeNotas.java                                     *
*                                                                  *
*  Programa para leitura das notas de alunos em uma disciplina     *
*  gravacao dessas notas e da nota final de cada aluno num arquivo *
*------------------------------------------------------------------*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class LeNotas extends JFrame
{ public static void main (String[] a)
  { new DDisciplina(); }

  LeNotas (DDisciplina d)
  { super("Notas");
    try { Container c = getContentPane();
          c.setLayout(new BorderLayout());

          DataOutputStream f = new DataOutputStream(new FileOutputStream(d.turma));
          f.writeInt(d.nAlunos);
          f.writeInt(d.nAvaliacoes);

          DNotas notas = new DNotas(d.nAlunos,d.nAvaliacoes,f);
          c.add("Center",notas);
          setSize(500,150); show();
         }
     catch (Exception IOException)
         { System.out.println("Erro em operacao de E/S");
           dispose(); new LeNotas(d); }
  }
}

class DDisciplina implements ActionListener
{ String turma;
  int nAlunos, nAvaliacoes;

  JFrame j1               = new JFrame("Entrada de dados");
  JTextField tTurma       = new JTextField(20);
  JTextField tNAlunos     = new JTextField(3);
  JTextField tNAvaliacoes = new JTextField(2);

  DDisciplina()
  { Container c = j1.getContentPane();
    c.setLayout(new BorderLayout());
    
    JPanel dadosJ1      = new JPanel(new GridLayout(3,2,5,15));
    JLabel rTurma       = new JLabel("Arquivo de notas");
    JLabel rNAlunos     = new JLabel("Numero de alunos"); 
    JLabel rNAvaliacoes = new JLabel("Numero de avaliacoes de cada aluno");
    JPanel pNAlunos     = new JPanel(); pNAlunos.add(tNAlunos);
    JPanel pNAvaliacoes = new JPanel(); pNAvaliacoes.add(tNAvaliacoes);

    dadosJ1.add(rTurma);       dadosJ1.add(tTurma);
    dadosJ1.add(rNAlunos);     dadosJ1.add(pNAlunos);
    dadosJ1.add(rNAvaliacoes); dadosJ1.add(pNAvaliacoes);
    c.add("Center",dadosJ1);
    
    JButton fim1 = new JButton("Fim"); fim1.addActionListener(this);
    JPanel pb    = new JPanel();
    pb.add(fim1); c.add("South",pb);
    j1.setSize(600,150); j1.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e)
  { turma       = tTurma.getText();
    nAlunos     = Integer.parseInt(tNAlunos.getText());
    nAvaliacoes = Integer.parseInt(tNAvaliacoes.getText());
    j1.dispose();
    new LeNotas(this);
  }
}

class DNotas extends JPanel implements ActionListener
{ JTextField       notasAluno = new JTextField(30);
  JTextField       numAluno   = new JTextField(10);
  JButton          fim;
  int 	           nAlunos, nAvaliacoes;
  int[][]          notas;
  DataOutputStream f;

  DNotas(int n, int m, DataOutputStream f)
  { nAlunos = n; nAvaliacoes = m; this.f = f;
    notas = new int[n][m];

    setLayout(new BorderLayout(10,30));

    JPanel p1 = new JPanel();
    JLabel l  = new JLabel("Notas: ",JLabel.RIGHT);
    p1.add(l); p1.add(notasAluno); notasAluno.addActionListener(this);
    add("North",p1);

    JPanel p2  = new JPanel(); 
    p2.setLayout(new GridLayout(1,2));
    JPanel p21 = new JPanel();
    JLabel pNumAluno = new JLabel("Numero do aluno: ",JLabel.RIGHT);
    numAluno.setText("1"); p21.add(pNumAluno); p21.add(numAluno);

    JPanel p22 = new JPanel();
    fim        = new JButton("Fim");
    p22.add(fim); fim.addActionListener(this);
    p2.add(p21); p2.add(p22); add(p2); 
  } 

  public void actionPerformed (ActionEvent e)
  { Object o = e.getSource();
    try { if (o instanceof JButton || o instanceof JTextField)
             { if (o instanceof JTextField)
		  { int n = Integer.parseInt(numAluno.getText())-1; 
	            StringTokenizer s = new StringTokenizer(notasAluno.getText());
                    int j = 0;
 		    while (s.hasMoreTokens()) 
                       { notas[n][j] = Integer.parseInt(s.nextToken());  j++; } 
		    while (j<nAvaliacoes)
		       { notas[n][j] = 0; j++; }
                    numAluno.setText(Integer.toString(n+2));
                    notasAluno.setText("");
		  }
 	       else if ( ((JButton) o).getText().equals("Fim") )
                  { for (int i=0; i<nAlunos; i++)
                       for (int j=0; j<nAvaliacoes; j++)
			  f.writeInt(notas[i][j]);
                    System.exit(0); }
             }
        }
    catch (Exception IOException)
    { System.err.println("Excecao ocorrida ao gravar notas");
      System.err.println(IOException.getClass());
      System.err.println(IOException.getMessage()); 
    }
  }
}