package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    // Getting factorial using iteration:
    public static long iterationFactorial(int number) {
        long factorial = -1;
        if (number > 0) {
            factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.print("The factorial for " + number + " using iteration is: ");
        }
        return factorial;
    }

    //Getting Factorial using recursion:
    public static long recursionFactorial(int num) {
        long factorial = 0;
        if (num < 1) {
            return 1;
        } else {
            return (num * recursionFactorial(num - 1));
        }
    }
}
