public class Countnum {
    public static void main(String[] args) {

        // find how many times 6 is coming in 6473636;

        int n =6473636;
        int count = 0;

        while (n > 0) {
            int rem =n %10;
            if (rem == 6) {
                count ++;
            }
            n =n/10; // n/= 10;
        }
        System.out.println(count);
    }
}
