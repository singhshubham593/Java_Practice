import java.util.Scanner;

public class methodsum {
    public static void main(String[] args) {
    //    sum();
      //  sum();   // we can use  some for many time if we want;
        int n2;
        int ni;
        int res = sum(ni=5,  n2=6);
        System.out.println(res);
    }
    // Syntex of method;
        /*
         return_tpye Functionname (type arg1, type arg2..) {
             // body ;
             return statement;
         */
    static int sum(int n1, int n2){
        int summ= n1 + n2;
        return summ;

    }
 /*
    static void sum() {  // At place sum, we can use( -,*,/ e.t.c)
        Scanner in =new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1=in.nextInt();
        System.out.println("Enter num 2:");
        int num2=in.nextInt();
        int sum =  num1 +  num2;
        System.out.println("The sum of num1 and num2 is "+sum);

    }*/

}

