package string.problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here

        //Anagrams Method called: (Needs 2 String Input)
        Anagram.anagrams("Part", "tRaP");

        System.out.println("***********************************************************************");
        // Find the largest word in: "Human brain is a biological learning machine"
        DetermineLargestWord.largestWordFound();

        System.out.println("***********************************************************************");
        //Find duplicate words in: "Java is a programming Language Java is also an Island of Indonesia Java is a widely used language"
        DuplicateWord.findDuplicates();

        System.out.println("***********************************************************************");
        //Creating an object of the Class Palindrome
        Palindrome palindrome = new Palindrome();
        // Calling out the isPalindrome method to check if the word is a Palindrome (word input required):
        palindrome.isPalindrome("DAD");

        System.out.println("***********************************************************************");
        //Calling out the permutation method (input required):
        Permutation.permutation("ABC");
    }
}
