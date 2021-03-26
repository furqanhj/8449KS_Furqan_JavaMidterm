package design;

import java.util.Scanner;

public class UnfinishedEmployeeInfo {
    public static int calculateEmployeeBonus(String performance, int salary) {
        int total = 0;
        switch (performance) {
            case "Best":
                total = salary / 100 * 10;
                System.out.println("Your bonus is $" + total);
                break;
            case "Average":
                total = salary / 100 * 8;
                System.out.println("Your bonus is $" + total);
                break;
            case "Bellow Average":
                total = salary / 100 * 3;
                System.out.println("Your bonus is $" + total);
                break;
            default:
                System.out.println("Keep working. You're not qualified for a bonus at this time.");
        }

        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = UnfinishedEmployeeInfo.UnfinishedDateConversion.convertDate(joiningDate);
        String convertedTodaysDate = UnfinishedEmployeeInfo.UnfinishedDateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }



    private static class UnfinishedDateConversion {

        public UnfinishedDateConversion(Months months) {

        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }


}
