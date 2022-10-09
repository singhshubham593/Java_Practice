// import util package[all  classes]
import java.util.*;
public class collectionFramework {
    public static void main(String[] args) {
    /*
    // creating collection

    1) type safe - same type of element(object) are added to collection

    ArrayList<string> name = new ArrayList<String>();
     name.add("Durgesh");
        name.add("Durga");
        name.add("Drishti");
        name.add("druw");
        System.out.println(name);

    2) untype safe - different type of element(object) are added to collection

    LinkedList list = new linkedList();
     list.add(100);
     list.add("Durga");
     list.add(346.655);
     list.add(true);
     System.out.println(list);

     */

        // type safe collection
        ArrayList<String> name = new ArrayList<>();
        name.add("Durgesh");
        name.add("Durga");
        name.add("Drishti");
        name.add("druw");
        System.out.println(name);
        // get method
        System.out.println(name.get(0));
        System.out.println(name.get(2));
        //remove
        name.remove("Durga");
        System.out.println(name);
        //size
        System.out.println("SIZE =" +name.size());
        //Checking item is present or not
        //type ka equal method call karta hai checking karne ke liye
        System.out.println(name.contains("Drishti"));
        //checking
        System.out.println(name.isEmpty());
        //setting value
        name.set(1,"ram"); // here index 1 name is replace by ram
        System.out.println(name);
        //add value at any index
        name.add(1,"shyam"); // here shyam is at index 1 and index 1 element ia place at index 2
        System.out.println(name);

        // and many more collection is left
    }
}
