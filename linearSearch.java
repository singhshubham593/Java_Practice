public class linearSearch {
    // linear search
    public static void main(String[] args) {
        int[] arr={34,56,99,87,99};
        int target =87;
        //store value in ans
        int ans = lenearSearch(arr,target);
        System.out.println("THe target is present at index no :" + ans);
    }
    //Search in the array :return the index if item is found
    //Otherwise if no found return -1
    static int lenearSearch(int[] arr,int target){
        //if array length is 0.then,return -1
        if(arr.length==0){
            return -1;
        }
        //to run for loop and check element=target at which index
        for(int index =0;index<=arr.length;index++){
            int element =arr[index];
            if(element==target){
                return index;
            }
        }
        //if target is not in array.then,return -1
        return -1;
    }
}
