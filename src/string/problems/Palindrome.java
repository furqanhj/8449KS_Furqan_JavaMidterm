package string.problems;

public class Palindrome {

        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

    public boolean isPalindrome(String word) {
        boolean flag = false;

        char[] arrayOfWord = word.toLowerCase().toCharArray();
        char[] reverseArray = new char[arrayOfWord.length];

        for (int i = arrayOfWord.length - 1; i >= 0; i--) {
            reverseArray[(arrayOfWord.length - 1) - i] = arrayOfWord[i];
        }

        for (int i = 0; i < arrayOfWord.length; i++) {
            if (arrayOfWord[i] != reverseArray[i]) {
                System.out.println(word + " is not a Palindrome");
                flag = false;
            } else {
                System.out.println(word + " is a Palindrome");
                flag = true;
            }
        }
        return flag;
    }
}
