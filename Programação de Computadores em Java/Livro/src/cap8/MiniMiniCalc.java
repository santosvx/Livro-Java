package cap8;

/*----------------------------------------------------------*
*                     MiniMiniCalc.java                     * 
*                                                           *
*     Minicalculadora com operacoes aritmeticas simples     * 
*     e entrada e saida textual                             *
*-----------------------------------------------------------*/

import java.io.*;
import Entrada;
import PrimeirosExemplos;

class MiniMiniCalc
{ static void escreveMensagem(PrintStream saida)
  { saida.println(
       "--------------------------------------------------------------------\n" +
       "Escreva o nome da funcao a ser executada (ou 1,2,...,5, respect.)   \n" +
       "Opcoes: quadrado  somaDosQuadrados  eTriang  max max3               \n" +  
       "--------------------------------------------------------------------"); }

  public static void main(String[] args) throws IOException
  { PrintStream saida = System.out;
    Entrada entrada   = new Entrada (new InputStreamReader(System.in));

    escreveMensagem(saida);
    String s = entrada.prox();

    if (s != null)
    if (s.equals("quadrado") || s.equals ("1"))
       { saida.print("Digite um numero inteiro: ");
         int a = entrada.leInteiro();
         saida.print("Quadrado = ");
         saida.println(PrimeirosExemplos.quadrado(a)); }

    else if (s.equals("somaDosQuadrados") || s.equals("2"))
       { saida.print("Digite dois numeros inteiros: ");
         int a = entrada.leInteiro(); 
         int b = entrada.leInteiro();
         saida.print("Soma dos quadrados = ");
	 saida.println(PrimeirosExemplos.somaDosQuadrados(a,b)); }

    else if (s.equals("eTriang") || s.equals("3")) 
       { saida.print("Digite tres numeros inteiros: ");
         int a = entrada.leInteiro(); 
         int b = entrada.leInteiro();
         int c = entrada.leInteiro(); 
	 if (PrimeirosExemplos.tresIguais(a,b,c)) 
            saida.println("Constituem lados de um triangulo");
         else saida.println("Nao constituem lados de um triangulo"); }
       
    else if (s.equals("max") || s.equals("4")) 
       { saida.print("Digite dois numeros inteiros: ");
         int a = entrada.leInteiro(); 
         int b = entrada.leInteiro();
	 saida.print("Maior numero = ");
         saida.println(PrimeirosExemplos.max(a,b)); }

    else if (s.equals("max3") || s.equals("5")) 
       { saida.print("Digite tres numeros inteiros: ");
         int a = entrada.leInteiro(); 
         int b = entrada.leInteiro();
         int c = entrada.leInteiro(); 
	 saida.print("Maior numero = ");
         saida.println(PrimeirosExemplos.max3(a,b,c)); }

    else saida.println("Foi digitado algo nao esperado...");

    saida.println("Tchau...");
  }
}