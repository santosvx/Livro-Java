package cap11;

/***************************************************************
*                    MiniCalcES.java                           *
*                                                              *
*          Interface da minicalculadora simples                *
*--------------------------------------------------------------*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.StringTokenizer;
import Funcs;
import Func;

class MiniCalcES extends JPanel implements ActionListener
{ JTextField args   = new JTextField (30);
  JTextField result = new JTextField (30);
  JButton[] buttons;

  MiniCalcES (String[] ops, JApplet applet)
  { setLayout(new GridLayout(3,1)); 
    addArgs(); addButtons(ops);
    addRes(); 
    applet.getContentPane().add(this);
    applet.setSize(400,200); }

  private void addArgs()
  { JPanel p = new JPanel();
    p.add(new JLabel("Argumentos: ", JLabel.RIGHT));  
    p.add(args); add(p);	}

  private void addButtons(String[] ops) 
  { int numOps = ops.length; 
    buttons  = new JButton[numOps];
    JPanel p = new JPanel();
    for (int i=0; i<numOps; i++)
       { buttons[i] = new JButton (ops[i]);
         p.add(buttons[i]); buttons[i].addActionListener(this); }
    this.add(p); }

  private void addRes()
  { JPanel p = new JPanel();
    p.add(new JLabel("Resultado: ", JLabel.RIGHT)); 
    p.add(result);
    this.add(p); }
    
  public void actionPerformed (ActionEvent ev)
  { String so = ((JButton) ev.getSource()).getText();    

    try { Func f = Funcs.getFunc(so); 
          int nArgs = f.numArgs();
          double[] fArgs = getArgs(nArgs);  
          result.setText(Double.toString(f.aplic(fArgs))); } 
    catch (Exception e)
        { result.setText(e.getMessage()); }
  }

  private double[] getArgs(int nArgs) throws Exception
  { StringTokenizer sArgs = new StringTokenizer(args.getText());
    if (sArgs.countTokens() != nArgs) 
       throw new Exception("numero de argumentos incorreto");
    else { double[] fArgs = new double[nArgs];
           for (int i=0; i<nArgs; i++) fArgs[i] = Double.parseDouble(sArgs.nextToken());
           return fArgs; } 
  }
}