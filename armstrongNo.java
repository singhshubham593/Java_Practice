import java.util.Scanner;

public class armstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(armstro(num));

    }
    static boolean  armstro(int num){
        int ori=num;
        int sum =0;
        while (num>0){
            int rem = num % 10;
            rem =rem /10;
            int remcub =rem * rem * rem;
            sum = sum + remcub;
        }
        if (sum == ori){
            return true;
        }
        return false;
    }
}
