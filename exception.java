public class exception {
    public static void main(String[] args) {
        //  TRY - CATCH in EXCEPTION HANDING
        int[] marks = {66,47,80};
        try{
            System.out.println(marks[5]); // marks 5 is not exit;
        }catch (Exception exception) {
            //do something after catching
        }
        System.out.println("My name is Shubham Singh");

    }
}
