import java.util.Scanner;
// find the largest in 3 no;
public class largestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();

         int max = a;

         if (b>max){
             max =b;
         }
        if (c > max) {
            max=c;
        }
         System.out.println(max);
    }
}
