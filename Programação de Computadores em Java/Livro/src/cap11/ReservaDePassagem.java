package cap11;

/**************************************************************
*                ReservaDePassagem.java                       * 
*  Interface para um programa de reserva de passagens aereas  *
*                                                             *
*-------------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ReservaDePassagem extends JFrame
{ public ReservaDePassagem() 
  { super("Reserva de Passagens");
    setSize(1000,400);
    Container c = getContentPane();
    c.setLayout(new BorderLayout(5,15));

    JLabel label_origem = new JLabel("Origem:"); 
    String[] locais = { "Aracaju","Belo Horizonte","Brasilia","Blumenau","Boa Vista",
       "Caceres","Campinas","Corumba","Cuiaba","Curitiba","Feira de Santana",
       "Florianopolis","Fortaleza","Goiania","Ilheus","Joao Pessoa","Juiz de Fora",
       "Macapa","Maceio","Manaus","Montes Claros","Natal","Nova Iguacu","Pelotas",
       "Porto Alegre","Recife","Ribeirao Preto","Rio Branco","Rio de Janeiro","Rio Grande",
       "Salvador","Santa Maria","Santarem","Santos","Sao Goncalo","Sao Luis",
       "Sao Paulo","Sorocaba","Vitoria","Uberaba","Uberlandia" };
    JList locais_origem = new JList(locais); 

    JScrollPane origem = new JScrollPane(locais_origem);
    locais_origem.setVisibleRowCount(4);
    JPanel p11   = new JPanel();

    JLabel label_destino = new JLabel("Destino:"); 
    JList locais_destino = new JList(locais); 
    JScrollPane destino = new JScrollPane(locais_destino); 
    locais_destino.setVisibleRowCount(4);
    JPanel p12   = new JPanel();

    p11.add(label_origem);
    p11.add(origem);
    p12.add(label_destino);
    p12.add(destino); 

    JPanel data           = new JPanel(new GridLayout(3,2,1,5));
    data.setBorder(new TitledBorder(new EtchedBorder(),"Data")); 

    JLabel label_dia     = new JLabel("Dia: "); 
    JTextField campo_dia = new JTextField(2); 
    JLabel label_mes     = new JLabel("Mes: "); 
    JTextField campo_mes = new JTextField(2); 
    JLabel label_ano     = new JLabel("Ano: "); 
    JTextField campo_ano = new JTextField(4); 

    data.add(label_dia); 
    JPanel dia = new JPanel(); dia.add(campo_dia); data.add(dia);
    data.add(label_mes); 
    JPanel mes = new JPanel(); mes.add(campo_mes); data.add(mes);
    data.add(label_ano); 
    data.add(campo_ano);
    JPanel p13 = new JPanel(); p13.add(data); 

    JPanel classe       = new JPanel(new GridLayout(3,1,5,5));
    classe.setBorder(new TitledBorder(new LineBorder(Color.black,3),"Classe")); 
    JLabel label_classe = new JLabel("Classe:");
    JRadioButton c1     = new JRadioButton("Primeira");
    JRadioButton c2     = new JRadioButton("Executiva");
    JRadioButton c3     = new JRadioButton("Economica");
    classe.add(c1); classe.add(c2); classe.add(c3);
    JPanel p14 = new JPanel(); p14.add(classe);

    JPanel p1 = new JPanel(new GridLayout(1,4,40,40));
    p1.add(p11); p1.add(p12); p1.add(p13); p1.add(p14);

    JPanel p = new JPanel(); p.add(p1); 
    c.add(p,BorderLayout.NORTH);

    JList  lista_voos = new JList();    
    JScrollPane vs    = new JScrollPane(lista_voos); 
    JPanel voos       = new JPanel(new BorderLayout(5,5)); 
    voos.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED),"Voos disponiveis")); 
    voos.add(vs,BorderLayout.CENTER); 

    c.add(voos,BorderLayout.CENTER);

    ButtonGroup bg      = new ButtonGroup(); 
    bg.add(c1); bg.add(c2); bg.add(c3); 
//    c3.getModel().setSelected(true);

    JPanel pBs = new JPanel();
    JPanel pbs = new JPanel();
    pbs.setLayout(new GridLayout(1,3,5,5));
    JButton b1 = new JButton("Pesquisar");
    JButton b2 = new JButton("Reservar");
    JButton b3 = new JButton("Sair");
    pbs.add(b1); pbs.add(b2); pbs.add(b3); 
    pBs.add(pbs);

    c.add(pBs,BorderLayout.SOUTH);

    setVisible(true); 
  }

  public static void main (String[] a)
  { new ReservaDePassagem(); }
}