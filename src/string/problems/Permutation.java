package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */
    }

    public static void permutation(String word){
        int x = word.length();
        permute(word, 0, x-1);
    }

    public static void permute (String word, int a, int b){
        if (a == b)
            System.out.println(word);
        else {
            for (int i = a; i <= b; i++){
            word = swapper(word, a, i);
            permute(word, a+1, b);
            word = swapper(word, a, i);
            }
        }
    }

    public static String swapper(String word, int i, int j){
        char swapper;
        char[] charArray = word.toCharArray();
        swapper = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = swapper;
        return String.valueOf(charArray);
    }
}
