package math.problems;

public class FindMissingNumber {

    public static int missingNumber() {
        /*
         If n = 10, then array will have 9 elements in the range from 1 to 10.
            For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).

         Write a method to find the missing number from the array.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int sumOfArray = 0;
        int lengthOfIndex = array.length;
        int sumOfIndex;
        int missingNum;
        for (int i : array) {
            sumOfArray += i;
        }
        sumOfIndex = (lengthOfIndex + 1) * (lengthOfIndex + 2) / 2;
        missingNum = sumOfIndex - sumOfArray;
        System.out.println("The missing number from the array is: " + missingNum);
        return missingNum;

    }
}
