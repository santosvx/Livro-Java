import java.io.*;

class Eleição
{   public static void main (String[] a) throws IOException
    {   int votosCand1=0, votosCand2=0, nulos=0, emBranco=0, 
            voto, numVotos=0;
        do { voto = EntradaPadrão.lêInteiro();
             numVotos++;
             if (voto==1) votosCand1++; else
             if (voto==2) votosCand2++; else
             if (voto==3) nulos++; else
             if (voto==4) emBranco++; 
           }
        while (voto != 0);

        System.out.println( 
           "Votos candidato 1 = " + votosCand1 + "\n" + 
           "Votos candidato 2 = " + votosCand2 + "\n" + 
           "Porcentagem de votos nulos = " + nulos*100.0/numVotos + "\n" + 
           "Porcentagem de votos em branco = " + emBranco * 100.0/numVotos); 
    }
}

class EntradaPadrão
{   static BufferedReader f = new BufferedReader(
             new InputStreamReader(System.in));

    public static int lêInteiro() throws IOException
    {   
        return Integer.parseInt(f.readLine());
    }
}