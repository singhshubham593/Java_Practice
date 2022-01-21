public class Reversenum {
    public static void main(String[] args) {

        // Reverse the number;

        int num =47232;

        int ans = 0;
        while (num > 0) {

            int rem =num %10;
            num /=10;

            ans = ans * 10 +rem ;

        }
        System.out.println(ans);
    }
}
