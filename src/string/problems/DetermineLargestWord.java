package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {

    public static void largestWordFound() {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        for (Map.Entry<Integer, String> findWord : wordNLength.entrySet()) {
            var longestWord = (Map.Entry) findWord;
            System.out.println("The length of the largest word and the largest word in the sentence are as follows:");
            System.out.println(longestWord.getKey() + " " + longestWord.getValue());
        }

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //Implement here

        String[] eachWord = wordGiven.split(" ");
        for (String s : eachWord) {
            if (s.length() >= st.length())
                st = s;
        }
        map.put(st.length(), st);
        return map;
    }
}
