// pass value in function
public class PassExample {
    public static void main(String[] args) {
        String name = "Shubham Singh";
        greet(name);
    }

    static void greet(String naam) { // in this case name or naam contain same name"Shubham Singh";
        System.out.println(naam); // in java, It is contain value olny,not refirsatio;
                                  // if create anthor object,then it wiil take previous one;
    }

}
