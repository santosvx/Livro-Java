package cap6;

/********************************************************
*                                                       *
*            Equacao2.java                              *
*     (equacao de segundo grau)                         *
*-------------------------------------------------------*/

class Equacao2
{ 
	float a, b, c;
  int num_raizes; 
  float r1, r2;

  Equacao2 (float a, float b, float c)
  { if (a==0)
       { num_raizes=1; r1 = r2 = c/b; }
    else 
       { float d = b*b - 4*a*c;
         if (d<0) num_raizes = 0;
         else { if (d==0) num_raizes = 1;
                else num_raizes = 2;
                r1 = (-b + d)/(2*a);
                 r2 = (-b - d)/(2*a); } 
       }
  }
}