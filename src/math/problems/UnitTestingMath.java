package math.problems;

public class UnitTestingMath {

    public static void main(String[] args) {
        // Apply unit testing from each class contained within this package, here.

        //Object created for the Factorial class:
        Factorial factorial = new Factorial();
        // Factorial method using Iteration called:
        System.out.println(factorial.iterationFactorial(10));
        // Factorial method using Recursion called:
        System.out.println("The factorial for your input using recursion is: " +factorial.recursionFactorial(10));

        //Object created for the Fibonacci class:
        Fibonacci fibonacci = new Fibonacci();
        // Fibonacci method called:
        System.out.println(fibonacci.fibonacciChallenge(40));

        //Object created for the FindLowestDifference class:
        FindLowestDifference difference = new FindLowestDifference();
        // lowestDifference method called:
        difference.lowestDifference(); // Answer is 1.

        // Find the missing number from the array {10, 2, 1, 4, 5, 3, 7, 8, 6}.
        FindMissingNumber.missingNumber(); // Answer is 9.

        //Find the lowest number from the array {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        LowestNumber.lowestNumber(); // Answer is 5.

        //Found and implemented the PATTERN:
        Pattern.printPattern();

        //Printing prime numbers from 2 to 1,000,000 (with time taken):
        PrimeNumber.printPrimeNums();
    }
}
