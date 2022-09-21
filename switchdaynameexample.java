import java.util.Scanner;
// switch case example
public class switchdaynameexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        // day name in week;
          switch(day) {
              case 1:
                  System.out.println("monday");
                  break;
              case 2:
                  System.out.println("Tuesday");
                  break;
              case 3:
                  System.out.println("wednesday");
                  break;
              case 4:
                  System.out.println("Thursday");
                  break;
              case 5:
                  System.out.println("Friday");
                  break;
              case 6:
                  System.out.println("Saturday");
                  break;
              case 7:
                  System.out.println("sunday");
                  break;

        /*    //  fine Syntax of  day name in a week above program;
          switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("sunday");
        }

      */

          }
    }
}
