package algorithm;

import java.util.Collections;
import java.util.Vector;

import static java.util.Arrays.sort;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// ******************************************************************************************************************

    public int[] insertionSort(int[] array) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// ******************************************************************************************************************
    public int[] bubbleSort(int[] array) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// ******************************************************************************************************************
    // Helper method for mergeSort:
    public void merge(int[] array, int l, int m, int r) {

        //Find sizes of 2 sub-arrays to be merged:
        int size1 = m - l + 1;
        int size2 = r - m;

        // Creating temp arrays:
        int[] tempL = new int[size1];
        int[] tempR = new int[size2];

        // Copying data to temp arrays:
        for (int i = 0; i < size1; i++)
            tempL[i] = array[l + i];
        for (int j = 0; j < size2; j++)
            tempR[j] = array[m + 1 + j];

        //Merging the temp arrays:
        // Initial indexes of the first and second sub-arrays:
        int i = 0, j = 0;

        // Initial index of the merged subarray array:
        int k = 1;
        while (i < size1 && j < size2) {
            if (tempL[i] <= tempR[j]) {
                array[k] = tempL[i];
                i++;
            } else {
                array[k] = tempR[j];
                j++;
            }
            k++;
        }
        // Copying remaining elements of tempL[], if any:
        while (i < size1) {
            array[k] = tempL[i];
            i++;
            k++;
        }
        // Copying remaining elements of tempR[], if any:
        while (j < size2) {
            array[k] = tempR[j];
            j++;
            k++;
        }
    }
    // Actual mergeSort Function, that will sort array[l..r], using the merge():
    public int[] mergeSort(int[] array, int l, int r) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        if (l < r) {
            // To find the middle point in the array:
            int m = l + (r - 1) / 2;

            //Sorting first and second halves:
            sort(array, l, m);
            sort(array, m + 1, r);

            //Merging the sorted halves:
            merge(array, l, m, r);
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// ******************************************************************************************************************
    //Helper method for quickSort:
    /*  This function takes last element as pivot, places the pivot element at its correct position in sorted
        array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right
        of pivot */
    public int partition(int[] array, int low, int high) {
        int swapper = 0;
        int swapper2 = 0;
        int pivot = array[high]; //Declaring the last value in the array as a pivot.
        int i = (low - 1);

        for (int j = low; j <= high; j++) {
            if (array[j] < pivot) { //If element(value) on the current index is lesser than pivot
                i++; // Increment index of smaller element.
                swapper = array[i];
                array[i] = array[j];
                array[j] = swapper;
            }
        }
        swapper2 = array[i + 1];
        array[i + 1] = array[high];
        array[high] = swapper2;
        return i + 1;
    }
    /*
    Actual quickSort function, which will sort the array with the help of partition().
    array[] ---> Array to be sorted.
    begin -----> Starting index.
    end -------> Ending Index.
     */
    public int[] quickSort(int[] array, int begin, int end) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            quickSort(array, begin, partitionIndex - 1); //Sort elements before partition
            quickSort(array, partitionIndex + 1, end); //Sort elements after partition
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// ******************************************************************************************************************

    //Helper method for heapSort:
    //To heapify a subtree rooted with node "i", which is an index in array[]. "n" is the size of the heap.
    public void heapify(int[] array, int n, int i){
        int swapper = 0;    // Declaring a swapper variable
        int largest = i;    // Initialize largest as root
        int l = 2 * i + 1;  // left = 2+i + 1
        int r = 2 * i + 2;  // right = 2*i + 2

        if (l < n && array[l] > array[largest]) // If left child is larger than root
            largest = l;
        if (r < n && array[r] > array[largest]) // If right child is larger than root
            largest = r;
        if (largest != i) {
            swapper = array[i];
            array[i] = array[largest];
            array[largest] = swapper;

            heapify(array, n, largest); // Recursively heapify the affected subtree
        }
    }

    // Actual heapSort method to sort an array with the help of heapify().
    public int[] heapSort(int[] array) {
        final long START_TIME = System.currentTimeMillis();
        int swapper = 0; // Swapper variable
        int[] list = array;

        int n = array.length;

        // Build heap (Re-arrange array):
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap:
        for (int i = n - 1; i > 0; i--){
            // Move current root to end
            swapper = array[0];
            array[0] = array[i];
            array[i] = swapper;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }

// ********************************************************************************************************************

    // Function to sort array[] of size n, using BucketSort:
    public int[] bucketSort(int[] array, int n) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        if (n <= 0)
            return null;

        // 1) Creates n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Integer>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++){
            buckets[i] = new Vector<Integer>();
        }

        // 2) Put array elements in different buckets:
        for (int i = 0; i < n; i++){
            int index = array[i] * n;
            buckets[index].add(array[i]);
        }

        // 3) Sort individual buckets:
        for (int i = 0; i < n; i++){
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into array[]
        int index = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < buckets[i].size(); j++){
                array[index++] = buckets[i].get(j);
            }
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
// *******************************************************************************************************************

    public int[] shellSort(int[] array) {
        final long START_TIME = System.currentTimeMillis();
        int[] list = array;

        int n = array.length;

        //Start with a big gap and reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2){
            /*
                Do a gapped insertion sort for this gap size.
                The first gap elements a[0 .. gap-1] are already in gapped order.
                Keep adding one more element until the entire array is gap stored.
             */
            for (int i = gap; i < n; i++){ //(nested loop)
                //add a[i] to the elements that have been gap sorted.
                //Save a[i] in swapper and make a hole at position "i"
                int swapper = array[i];
                //Shift earlier gap-stored elements up until the correct location for a[i] is found
                int j;
                for ( j = i; j >= gap && array[j - gap] > swapper; j -= gap)
                    array[j] = array[j - gap];

                //put swapper (the original a[i]) in its correct location
                array[j] = swapper;
            }
        }

        final long END_TIME = System.currentTimeMillis();
        this.executionTime = END_TIME - START_TIME;
        return list;
    }
}
// ********************************************************************************************************************