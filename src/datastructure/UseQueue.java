package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<String> name = new LinkedList<>();

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

        System.out.println(name.element());
        System.out.println(name.peek());
        System.out.println(name.poll());
        System.out.println(name.remove());




    }

}
