import java.util.Scanner;

public class switchexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        //about fruit;

        switch (fruit) {
            case "mango":
                System.out.println("The king of mango");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "orange":
                System.out.println("Sweet yellow fruit");
                break;
            case "grapes":
                System.out.println("My favorite fruit");
                break;
            default:
                System.out.println("please enter valid fruit");

                //new Syntax of above example;
                /*switch (fruit) {
            case "mango" -> System.out.println("The king of mango");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Sweet yellow fruit");
            case "grapes" -> System.out.println("My favorite fruit");
            default -> System.out.println("please enter valid fruit");
            */
        }
    }
}
