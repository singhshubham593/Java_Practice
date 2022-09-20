// Use of Parameter(Integer Function)
public class ParameterOne {
    public static void main(String[] args) {
        int ans =sum(4,6);
        System.out.println(ans);
    }
     // pass the value of number when you are calling the method in main() ;
    static int sum(int a,int b)  {
        int sum =a +b;
        return sum;
    }
}
