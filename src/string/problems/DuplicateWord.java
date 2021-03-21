package string.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWord {

    public static void findDuplicates() {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "\"Java is a programming Language Java is also an Island of Indonesia Java is a widely used language \"";

        int counter;
        String[] splitWords = st.toLowerCase().split(" ");
        System.out.println("Duplicate words in: " + st + " are: ");

        for (int i = 0; i < splitWords.length; i++) {
            counter = 1;
            for (int j = i + 1; j < splitWords.length; j++) {
                if (splitWords[i].equals(splitWords[j])) {
                    counter++;
                    splitWords[j] = "0";
                }
            }
            if (counter > 1 && !splitWords[i].equals("0"))
                System.out.println("\"" + splitWords[i] + "\":" + " " + counter + " times");
        }
    }
}
