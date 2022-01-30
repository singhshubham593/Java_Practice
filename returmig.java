import java.util.Scanner;

public class returmig {
    public static void main(String[] args) {
       int ans =  sum ();
        System.out.println(ans);
    }
      // returmig value method
     static int sum(){
         Scanner in =new Scanner(System.in);
         System.out.println("Enter no1 :");
         int no1 =in.nextInt();
         System.out.println("Enter no2");
         int no2 = in.nextInt();
         int sum = no1 +no2;
         System.out.print("The ans is ");
         return sum;

    }

}
