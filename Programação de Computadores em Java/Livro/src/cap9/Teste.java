package cap9;

/**************************************************************
*                                                             *
*                 Teste.java                                  *
*                                                             *
*  Exemplo de definicao de subclasses e associacao dinamica   *
*-------------------------------------------------------------*/

import java.io.*;

class Inteiro
{ 
  int a;
  Inteiro(int p)    { a = p; }
  void add (int b)  { a += b; }
  void inc ()       { a++; }
  void println (PrintStream f) 
  { f.println(a); }
}

class Racional extends Inteiro
{ 
  int b;
  Racional (int a, int b) { super(a); this.b=b; }
  void add (Racional r)   { a = a * r.b + b * r.a; b *= r.b; } 
  void inc ()             { a += b; }
  void println (PrintStream f)
  { f.print(a);
    f.print("/");
    f.println(b); }
}

class Teste
{ 
  public static void main(String[] a)
  { Inteiro i  = new Inteiro(1);
    Racional r = new Racional(2,2);

    i = r; i.inc(); i.println(System.out);

    System.out.println(); 

    i.add(1); i.println(System.out);   }
}