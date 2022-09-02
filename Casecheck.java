import java.util.Scanner;
// Case chack 
public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // case chack of alphabet;

        char ch =in.next().trim().charAt(2); // 2 = can be varaible with
         if(ch >= 'a' && ch <='z'){
             System.out.println("Lowercase");
         }
          else{
              System.out.println("Uppercase");
         }
          System.out.println(ch);

    }
}
