import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new CParser(System.in).TranslationUnit();
         
         root.accept(new GJNoArguDepthFirst()); // Your assignment part is invoked here.
      }
      catch (ParseException e) {
         try {
            String s = e.toString();
            String[] words = s.split(" ");
            System.err.print("Error: The given C program has an Error at line ");
            System.err.print(words[8]);
            System.err.println(" column "+words[10].split("\n")[0]);
         } catch(Exception e2) {
            System.err.println("Error: The given C program has an Error");
         }
      }
   }
} 



