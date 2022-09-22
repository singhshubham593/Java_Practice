import java.util.Scanner;
// returning value method
public class returning {
    public static void main(String[] args) {
       int ans =  sum ();
        System.out.println(ans);
    }
      
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
