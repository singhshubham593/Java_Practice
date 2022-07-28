public class maxnoarr {
    public static void main(String[] args) {
        int[] arr ={1,3,6,28,9};
        System.out.println(max(arr));
    }
     static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
