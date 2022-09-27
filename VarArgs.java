import java.util.Arrays;
// variable argument
public class VarArgs {
    public static void main(String[] args) {
        /*
        //for single variable Argument;
        fun(4,7,4,8,9);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));

         */

        // for multiple variable Argument;
        multiple(3, 4, "Shubham Singh", "Raghu", "Shyamu");

    }

    static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));

    }
}