import java.util.Arrays;
// Change value of array at index no 0.
public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void change(int[] nums){
        nums[0]=77;//ijf you make a change to the object via this ref  variable,same object will be changed;
    }
}
