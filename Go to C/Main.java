import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new GoParser(System.in).Goal();
         
         root.accept(new GJNoArguDepthFirst()); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         try {
            String s = e.toString();
            String[] words = s.split(" ");
            System.err.print("Error: The given Go program has an Error at line ");
            System.err.print(words[8]);
            System.err.println(" column "+words[10].split("\n")[0]);
         } catch(Exception e2) {
            System.err.println("Error: The given Go program has an Error");
         }
      }
   }
} 



