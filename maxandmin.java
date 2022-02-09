import java.util.Scanner;

public class maxandmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
         int[] number = new int[size]; //2

         //input;

        for(int i = 0; i<size ; i++){ // 54 and 76
            number[i] =in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i <number.length ; i++){ // compare value
            if(number[i]<min){
                min = number[i];
            }
            if (number[i]>max){
                max = number[i];
            }
        }
        System.out.println("Largest number is " + max);    // max =76
        System.out.println("Smallest number is " + min);    // min = 54
    }
}
