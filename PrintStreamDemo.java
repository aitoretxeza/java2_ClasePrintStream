import java.io.*;

public class PrintStreamDemo {

   public static void main(String[] args) {
      Object c = 15;

      PrintStream ps = new PrintStream(System.out);

      ps.println(c);
      ps.print("New Line");
      
      ps.flush();
   }
}
