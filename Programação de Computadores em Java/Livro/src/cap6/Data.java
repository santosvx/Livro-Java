package cap6;

/********************************************************
*                                                       *
*            Data.java                                  *
*                                                       *
*-------------------------------------------------------*/

import java.text.*;

class Data
{ 
	
	int d, m, a;
  
  public Data (int d, int m, int a)  
  { this.a=a; this.m=m; this.d=d; }

  public String toString ()
  { DecimalFormat a2 = new DecimalFormat("00");
    DecimalFormat a4 = new DecimalFormat("0000");
    return (a2.format(d) + "/" + a2.format(m) + "/" + a4.format(a)); }

  public int compara (Data dt) 
  { return (a != dt.a ? a-dt.a : 
           (m != dt.m ? m-dt.m :
	   (d != dt.d ? d-dt.d : 0))); }
}