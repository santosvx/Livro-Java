package cap11;

/***************************************************************
*                    Func.java                                 * 
*  Classe usada na implementacao da Minicalculadora            *
*                                                              *
*--------------------------------------------------------------*/
import java.util.StringTokenizer;

public abstract class Func
{ public abstract int numArgs();
  
  public abstract double aplic(double[] args);
}


class Soma extends Func
{ public int numArgs() { return 2; }

  public double aplic(double[] args) { return args[0] + args[1]; }
}

class Sub extends Func
{ public int numArgs() { return 2; }

  public double aplic(double[] args) {return args[0] - args[1]; }
}

class Mult extends Func
{ public int numArgs() { return 2; }

  public double aplic(double[] args) { return args[0] * args[1]; }
}

class Div extends Func
{ public int numArgs() { return 2; }

  public double aplic(double[] args) { return args[0] / args[1]; }
}


class Exp extends Func
{ public int numArgs() { return 2; }

  public double aplic(double[] args) { return Math.pow(args[0], args[1]); }
}