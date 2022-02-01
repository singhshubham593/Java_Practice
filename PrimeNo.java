import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
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
    }
}
