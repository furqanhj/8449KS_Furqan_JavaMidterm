package math.problems;

public class FindLowestDifference {

    public void lowestDifference() {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int swapper = 0;

        int minOfArr1 = array1[0];
        int minOfArr2 = array2[0];

        // Getting minimum value from Array1:
        for (int arr1 : array1) {
            if (minOfArr1 > arr1) {
                minOfArr1 = arr1;
            }
        }
        System.out.println("Lowest value of Array1 is: " + minOfArr1);

        // Getting minimum value from Array2:
        for (int arr2 : array2) {
            if (minOfArr2 > arr2) {
                minOfArr2 = arr2;
            }
        }
        System.out.println("Lowest value of Array2 is: " + minOfArr2);

        if (minOfArr1 < minOfArr2)
            System.out.println("The lowest difference between the 2 arrays is: " + minOfArr1);
        else
            System.out.println("The lowest difference between the 2 arrays is: " + minOfArr2);
    }
}
