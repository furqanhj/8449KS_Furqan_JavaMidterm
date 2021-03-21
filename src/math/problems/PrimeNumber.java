package math.problems;

public class PrimeNumber {

        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */

    public static void printPrimeNums() {
        System.out.println("Prime numbers from 2 to 1,000,000 are as follows: ");
        final long startTime = System.currentTimeMillis();
        for (int i = 2; i < 1000000; i++)
            if (isPrime(i))
                System.out.println(i);
        final long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time taken for completion = " + totalTime + " Milli-seconds");
    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(num); i += 2) {
            if (num % i == 0 || num % Math.sqrt(num) == 0) {
                return false;
            }
        }
        return true;
    }
}
