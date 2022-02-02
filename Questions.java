import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
      /*
        // To find prime no;

        boolean ans = isprime(n);

        System.out.println(ans);
    }
    static boolean isprime(int n){
       if (n <= 1) {
           return false;
       }
       int c= 2;
       while (c * c <= n){
           if (n % c == n){
               return false;
           }
           c++;
       }
       if (c * c > n) {
           return true;
       }
       return false;

       */

    }
    //Print all the 3 digit no armstrong numbers;
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n> 0) {
            int rem = n % 10 ;
            n = n / 10 ;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
}
