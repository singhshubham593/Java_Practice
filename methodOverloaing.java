public class methodOverloaing {
    public static void main(String[] args) {
        //Method overloading
        fun(6);
        int ans = sum(47,86);
        System.out.println(ans);
        fun("Shubham Singh");

    } static void fun(int a){ //Two or more fumction of same name can exit;
                              // no of Argument or type of Argument will be differet;
        System.out.print("First one:");
        System.out.println(a);
    }
    static int sum(int a, int b){
       System.out.print("Second one:");
        return a + b;
    }
    static void fun(String name){
        System.out.print("Third one:");
        System.out.println(name);

    }
}

