package string.problems;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void anagrams(String string1, String string2) {
        char[] word1 = string1.toLowerCase().toCharArray();
        char[] word2 = string2.toLowerCase().toCharArray();

        if (string1.length() != string2.length())
            System.out.println("Given 2 words are not Anagrams");
        else {
            Arrays.sort(word1); //sorting out the characters in the word1 array
            System.out.println(Arrays.toString(word1)); // printing out word1 char array as a String
            Arrays.sort(word2); // sorting out the characters in the word2 array
            System.out.println(Arrays.toString(word2)); // printing out word2 char array as a String
            System.out.println(Arrays.equals(word1, word2)); // Method in Arrays class, to compare 2 arrays and return boolean
            if (Arrays.equals(word1, word2)) // defining condition saying, if word1 = word2 (both have same characters) then:
                System.out.println("Given 2 words are anagrams");
            else // if word word1 and word2 does not have same characters, then:
                System.out.println("Given 2 words are not anagrams");
        }
    }
}