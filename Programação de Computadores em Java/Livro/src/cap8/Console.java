package cap8;

import java.io.*;

class Console
{ final static BufferedReader console  = new BufferedReader (new InputStreamReader(System.in)); 
  final static PrintStream    terminal = System.out;

  public static byte readByte ()
  { try   { return Byte.parseByte(console.readLine()); }
    catch (IOException e) 
          { terminal.println("IOException ocorreu: tente de novo."); 
            return readByte(); }
    catch (NumberFormatException e) 
          { terminal.println("Ocorreu a excecao NumberFormatException \n" + 
                             "Era esperado um valor entre -128 e 127 (convertivel em um byte): tente de novo."); 
            return readByte(); }
  }

  public static short readShort ()
  { try   { return Short.parseShort(console.readLine()); }
    catch (IOException e) 
          { terminal.println("IOException ocorreu: tente de novo."); 
            return readShort(); }
    catch (NumberFormatException e) 
          { terminal.println("Ocorreu a excecao NumberFormatException \n" +
                             "Era esperado um inteiro curto (16 bits): tente de novo."); 
            return readShort(); }
  }

  public static int readInt ()
  { try   { return Integer.parseInt(console.readLine()); }
    catch (IOException e) 
          { terminal.println("IOException ocorreu: tente de novo."); 
            return readInt(); }
    catch (NumberFormatException e) 
          { terminal.println("Excecao NumberFormatException ocorreu \n" + 
                             "Era esperado um inteiro (32 bits): tente de novo."); 
            return readInt(); }
  }


  public static String readString ()
  { try   { return console.readLine(); }
    catch (IOException e) 
          { terminal.println("IOException ocorreu tente de novo."); 
            return readString(); }
  }

  public static void main (String[] a)
  { System.out.println(Console.readShort()); }
}