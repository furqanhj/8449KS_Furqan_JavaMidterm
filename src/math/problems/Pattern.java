package math.problems;

public class Pattern {

    public static void printPattern() {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:
        100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...
        */

        int number = 0;
        int counter = 0;
        int i = 0;
        for (i = 100; i >= 0; i--) {
            counter++;
            if (counter <= 10)
                System.out.print(i + " ");
            else {
                for (i = 90; i >= 0; i -= 2)
                    if (counter <= 20) {
                        System.out.print(i + " ");
                        counter++;
                    }
                for (i = 70; i >= 0; i -= 3)
                    if (counter <= 30) {
                        System.out.print(i + " ");
                        counter++;
                    }
                for (i = 40; i >= 0; i -= 4)
                    if (counter <= 41) {
                        System.out.print(i + " ");
                        counter++;
                    }
            }
        }
    }
}
