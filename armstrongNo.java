import java.util.Scanner;
// Armstrong Number
public class armstrongNo {
    public static void main(String[] args) {
        // using scanner
        Scanner sc = new Scanner(System.in);
        // taking intput
        int num = sc.nextInt();
        // function calling and printing output
        System.out.println(armstro(num));

    }
    //creating new function
    static boolean  armstro(int num){
        int ori=num;
        int sum =0;
        // for armstrong
        while (num>0){
            int rem = num % 10;
            rem =rem /10;
            int remcub =rem * rem * rem;
            sum = sum + remcub;
        }
        // checking condition
        if (sum == ori){
            return true;
        }
        return false;
    }
}
