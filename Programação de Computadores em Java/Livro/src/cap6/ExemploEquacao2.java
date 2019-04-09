package cap6;

/********************************************************
*                                                       *
*            ExemploEquacao2.java                       *
*     (testa classe equacao de segundo grau)            *
*-------------------------------------------------------*/

import Equacao2;

class ExemploEquacao2
{ 
	static void main (String[] args)
  { Equacao2 eq = new  Equacao2(1.0f,2.0f,-8.0f); 
    if (eq.num_raizes == 0)
       System.out.println("Equacao nao tem raizes reais"); 
    else if (eq.num_raizes == 1)
       System.out.println("A raiz da equacao 'e " + eq.r1);
    else
       System.out.println("As raizes da equacao sao " + eq.r1 + " e " + eq.r2);  }
}