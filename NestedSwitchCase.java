import java.util.Scanner;
// Nested switch with Employ example;
public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID =in.nextInt();
        String department =in.next();

        switch(empID){
               case 1:
                   System.out.println("Shubham singh" );
                   break;
               case 2:
                   System.out.println("Pritush singh");
                   break;
               case 3:
                   System.out.println("empoy no 3");
                   switch(department){
                       case "IT":
                           System.out.println("IT Department");
                           break;
                       case "CSE":
                           System.out.println("CSE Department");
                           break;
                       default:
                           System.out.println("Envalid department");

                   }break;
               default:
                   System.out.println("NO empoy is here");
                   break;
        }
        // New syntex of above program;
        /*
        switch (empID) {
            case 1 -> System.out.println("Shubham singh");
            case 2 -> System.out.println("Pritush singh");
            case 3 -> {
                System.out.println("empoy no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "CSE" -> System.out.println("CSE Department");
                    default -> System.out.println("Envalid department");
                }
            }
            default -> System.out.println("NO empoy is here");
        }
         */
    }
}
