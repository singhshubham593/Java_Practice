// SCOPE
public class Scope {
    public static void main(String[] args) {
        // Method scope syntex

        /*
        //Code here CANNOT use x

        int x = 100;      // scope means can only accessible this variable in this function olny;

        // Code here can use x
        System.out.println(x); */

        //Block scope Syntex;

         /*
        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x  //value initialised in this block, will remin in block;
                                      // Can not use outside the block;
                                      //outside initialised value can changed in this block;
            int x = 100;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x
          */
    }
}
