package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000000];
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        // Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortinhNumbers");
        List<String> numbers1 = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
        printValue(numbers1);

        n = num.length;
        randomize(num, n);

        // Bubble Sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort took: "
                + bubbleSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
        List<String> numbers2 = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
        printValue(numbers2);

        randomize(num, num.length);

        // Merge Sort:
        algo.mergeSort(num, 0, num.length-1);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution time of " + num.length + " numbers in Merge Sort took: "
                + mergeSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
        List<String> numbers3 = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
        printValue(numbers3);

        randomize(num, num.length);

        // Quick Sort:
        algo.quickSort(num, 0, num.length);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution time of " + num.length + " numbers in Quick Sort took: "
                + quickSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
        List<String> numbers4 = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
        printValue(numbers4);

        randomize(num, num.length);

        // Heap Sort:
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution time of " + num.length + " numbers in Heap Sort, took "
                + heapSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "SortingNumbers");
        List<String> numbers5 = connectToSqlDB.readDataBase("heao_sort", "SortingNumbers");
        printValue(numbers);

        randomize(num, num.length);

        // Bucket Sort:
        algo.bucketSort(num, num.length);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution tine of: " + num.length + " numbers in bucketSort took: "
                + bucketSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "SortingNumbers");
        List<String> heapNumbers = connectToSqlDB.readDataBase("bucket_sort", "SortingNumbers");
        printValue(heapNumbers);

        randomize(num, num.length);

        // Shell Sort:
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("The execution time for "  + num.length + " numbers in numberSort "
                + shellSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "SortingNumbers");
        List<String> shellNum = connectToSqlDB.readDataBase("shell_sort", "SortingNumbers");
        printValue(shellNum);

        randomize(num, num.length);
    }




    /*
    HELPER METHODS
     */

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
