public class string {
    public static void main(String[] args) {
        //concatenation
        String firstFame = "Shubham";
        String lastName = " Singh";
        String fullName = firstFame +" "+lastName; // addition of two string
        System.out.println(fullName);

        // charAt
        for( int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i)); // for index 0 to n ,to print all world
        }
    }
}
