import java.util.Scanner;
//Simple calculato progrom
public class Calculator {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
         // take input from user till user does not press X or x;
        int ans = 0;
        while (true) {
           // take the operator as input;
            System.out.print("Enter the operator: ");
           char op =in.next().trim().charAt(0);

           if(op =='+' || op =='-' || op =='*' || op =='/' || op =='%'){
               //Input two number;
               System.out.print("Enter two number: ");
               int num1 = in.nextInt();
               int num2 = in.nextInt();
                // for addition
               if(op == '+'){
                   ans = num1 +num2;
               }
               // for substration
                if(op == '-'){
                    ans = num1 -num2;
                }
                // for multiply
                 if(op == '*'){
                     ans =num1 *num2;
                 }
                 // for devide
                  if(op == '/'){
                    if(num2 !=0) {
                      ans = num1 /num2;
                    }
                  }
                   if(op == '%'){
                       ans = num1 %num2;
                   }
           }
           else if(op =='x' || op =='X'){
               break;
           }
           else {
               System.out.println("Invalid operation");
           }
           System.out.println(ans);
        }
    }
}
