import java.util.Scanner;

public class arraySyntex {
    public static void main(String[] args) {
      // Syntex

      // datatype[] variable_name = new datatype[size];


      // Shubham Singh got marks in class 10 in 5 subject;

      int[] marks = new int[5];

      marks[0]=74;//English;
      marks[1]=64;//Maths;
      marks[2]=64;//Science;
      marks[3]=76;//Hindi;
      marks[4]=84;//Social Science;

       //to direct;
       //  int[] marks ={74;64;64;76;84} ;

      for (int i =0;i<5;i++){
          System.out.println(marks[i]);

      }
      /*
        Scanner no = new Scanner(System.in);
        int size =no.nextInt();
        int number[] =new int[size];

        // input
        for(int i =0; i < size;i++){
          number[i]=no.nextInt();
        }
        //print the no in array;
        for(int i = 0; i<size; i++){
            System.out.println(number[i] + " ");
        }
        */
    }

}
