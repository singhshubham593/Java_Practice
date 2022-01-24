import java.util.Scanner;

public class switchsyntax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int variable =in.nextInt();

        // Syntax;

        switch (variable){   // variable = expression;
            case 1:              //1 can be anything;
                //do something;
            case 2:              //2 can be anything;
                //do something;
            default:
                //do something;
        }
    }
}
