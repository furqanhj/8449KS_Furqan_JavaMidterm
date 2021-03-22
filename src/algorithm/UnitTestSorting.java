package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is used to help with unit testing of sorting algorithms from the Sort class
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        // Create instance of Sort class
        Sort sort = new Sort();

        // Pass the unsorted array to selectionSort() method from Sort class
        sort.selectionSort(unSortedArray);
        System.out.print("The sorted array using selectionSort: ");
        for (int selection : unSortedArray)
            System.out.print(selection);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the selectionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************
        // Pass the unsorted array to insertionSort() method from Sort class
        sort.insertionSort(unSortedArray);
        System.out.print("The sorted array using insertionSort: ");
        for (int insertion: unSortedArray)
            System.out.print(insertion);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the insertionSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************
        // Verify if the unsorted array is sorted by the bubbleSort() method
        sort.bubbleSort(unSortedArray);
        System.out.print("The sorted array using bubbleSort: ");
        for (int bubble: unSortedArray)
            System.out.print(bubble);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the bubbleSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************
//        // Verify if the unsorted array is sorted by the mergeSort() method
//        sort.mergeSort(unSortedArray, 0, unSortedArray.length);
//        System.out.print("The sorted array using mergeSort: ");
//        for (int merge: unSortedArray)
//            System.out.print(merge);
//        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
//        System.out.println();
//
//        // Verify if the unsorted array is sorted by the selectionSort() method
//        try {
//            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
//        } catch (Exception ex) {
//            ex.getMessage();
//        }
//        System.out.println("****************************************************************************");
//        System.out.println();
// *********************************************************************************************************************
        // Verify if the unsorted array is sorted by the quickSort() method
        sort.quickSort(unSortedArray, 0, unSortedArray.length-1);
        System.out.print("The sorted array using quickSort: ");
        for (int quick: unSortedArray)
            System.out.print(quick);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the quickSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************
        // Verify if the unsorted array is sorted by the heapSort() method
        sort.heapSort(unSortedArray);
        System.out.print("The sorted array using heapSort: ");
        for (int heap: unSortedArray)
            System.out.print(heap);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the heapSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************
//        // Verify if the unsorted array is sorted by the bucketSort() method
//        sort.bucketSort(unSortedArray, unSortedArray.length-1);
//        System.out.print("The sorted array using bucketSort: ");
//        for (int bucket: unSortedArray)
//            System.out.print(bucket);
//        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
//        System.out.println();
//
//        // Verify if the unsorted array is sorted by the bucketSort() method
//        try {
//            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
//        } catch (Exception ex) {
//            ex.getMessage();
//        }
//        System.out.println("****************************************************************************");
//        System.out.println();
// *********************************************************************************************************************
        // Verify if the unsorted array is sorted by the shellSort() method
        sort.shellSort(unSortedArray);
        System.out.print("The sorted array using shellSort: ");
        for (int shell: unSortedArray)
            System.out.print(shell);
        System.out.println("\nThe execution time is: " + sort.executionTime + " Milliseconds");
        System.out.println();

        // Verify if the unsorted array is sorted by the shellSort() method
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "ARRAY IS NOT SORTED... YET!\n***YOU GOT THIS!***");
        } catch (Exception ex) {
            ex.getMessage();
        }
        System.out.println("****************************************************************************");
        System.out.println();
// *********************************************************************************************************************

    }
}
