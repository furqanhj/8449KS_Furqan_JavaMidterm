package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        ArrayList<String> name = new ArrayList<>();
        name.add("Furqan");
        name.add("Pritam");
        name.add("Alex");
        name.add("Kamal");
        name.add("Javed");
        name.add("Das");

        Iterator<String> itrtr = name.iterator();
        System.out.println("\nThe Iterator values " + " of list are: ");
        {
        }
        while (itrtr.hasNext()){
            System.out.println(itrtr.next());
        }
        String[] signedBy = {"Jinnah", "Gandhi", "Shakespear", "Sami"};
        for (String s : signedBy){
            System.out.println(s);
        }

        name.remove("Javed");
        System.out.println("List after removal: " + name.remove("Javed"));

        System.out.println("Does this List contains the name \"ALEX\"? " + name.contains("Alex"));

        System.out.println("The name on index 3 of this list is: " + name.get(3));

    }
}
