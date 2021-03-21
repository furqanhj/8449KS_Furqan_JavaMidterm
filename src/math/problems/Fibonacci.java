package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static int fibonacciChallenge(int length) {
        int num1 = 0;
        int num2 = 1;
        int output = 0;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i < length; i++) {
            output = num1 + num2;
            System.out.print(output + " ");
            num1 = num2;
            num2 = output;
        }
        return output;
    }
}
