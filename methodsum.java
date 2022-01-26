import java.util.Scanner;

public class methodsum {
    public static void main(String[] args) {
       sum();
       sum();
       sum();   // we can use  some for many time if we want;
    }
      // Syntex of method;
        /*
        access modifier (we'll look in oop) return_tpye name () {
             // body ;
             return statement;
         */
        static void sum() {  // At place sum, we can use( -,*,/ e.t.c)
            Scanner in =new Scanner(System.in);
            System.out.println("Enter num 1:");
            int num1=in.nextInt();
            System.out.println("Enter num 2:");
            int num2=in.nextInt();
            int sum =  num1 +  num2;
            System.out.println("The sum of num1 and num2 is "+sum);

        }

}
