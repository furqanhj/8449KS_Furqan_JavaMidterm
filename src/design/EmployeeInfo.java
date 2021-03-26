package design;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

import static design.HelperMethods.validateString;

public class EmployeeInfo extends Department implements Employee{

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - COMPOSITION
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static final String COMPANY_NAME = "Java Professionals";
    String employeeFullName;
    private int employeeID;
    private int biWeeklyGross;
    private int salary;
    TimeOff timeOff;
    PC pc;
    SmartPhone smartPhone;


    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(){}

    public EmployeeInfo(int employeeId) {
        this.employeeID = employeeId;
    }

    public EmployeeInfo(String employeeFullName, int employeeId) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeId;
    }

    public EmployeeInfo(TimeOff timeOff, PC pc, SmartPhone smartPhone){
        this.timeOff = timeOff;
        this.pc = pc;
        this.smartPhone = smartPhone;
    }

    public EmployeeInfo(String employeeFullName, int employeeID, TimeOff timeOff){
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.timeOff = timeOff;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int setEmployeeID() {
        Random rand = new Random();
        int num = rand.nextInt(10000);
        System.out.println("Your employee ID is " + num);
        return num;
    }

    public int getBiWeeklyGross() {
        return biWeeklyGross;
    }

    public void setBiWeeklyGross(int biWeeklyGross) {
        this.biWeeklyGross = biWeeklyGross;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String inputEmployeeName() {
        String firstName;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        while (!validateString(firstName)) {
            System.out.print("Please enter valid name: ");
            firstName = scanner.next();
        }
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        while (!validateString(lastName)) {
            System.out.print("Please enter valid name: ");
            lastName = scanner.next();
        }
        System.out.println("Welcome to " + COMPANY_NAME + ", " + firstName + " " + lastName + ".");
        return employeeFullName = firstName + lastName;
    }

   /*
         You need to implement the logic of this method as such:
            It should calculate Employee bonus based on salary and performance.
            It should return the total yearly bonus.
                Example: 10% of salary for best performance, 8% of salary for average performance and so on.
                You can set arbitrary number for performance, so you probably need to send 2 arguments.
         *
         */

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

    @Override
    public String assignDepartment(String dept) {
        return null;
    }

    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary(int year, int biWeeklyGross) {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */

    public int calculateEmployeePension() {
        int total = 0;
        int numOfYears;
        numOfYears = calculateNumOfYearsWorked();
        if (getSalary() == 0) {
            System.out.println("Please configure the salary");
        }
        if (numOfYears >= 15) {
            total = getSalary() / 100 * 60;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 15 && numOfYears >= 10) {
            total = getSalary() / 100 * 50;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 10 && numOfYears >= 5) {
            total = getSalary() / 100 * 40;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 5) {
            total = getSalary() / 100 * 30;
            System.out.println("\nYour pension is $" + total);
        }

        return total;
    }
    public int calculateNumOfYearsWorked() {
        int dif = 0;
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter start year in format (example 2021): ");
            int year = scanner.nextInt();
            System.out.print("Enter start month in format (example 3): ");
            int month = scanner.nextInt();
            System.out.print("Enter start day in format (25): ");
            int day = scanner.nextInt();
            System.out.print("Enter end year in format (example 2021): ");
            int endYear = scanner.nextInt();
            System.out.print("Enter end month in format (5): ");
            int endMonth = scanner.nextInt();
            System.out.print("Enter end day in format (4): ");
            int endDay = scanner.nextInt();

            LocalDate startDate = LocalDate.of(year, month, day);
            LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);
            dif = findNumYearDifference(startDate, endDate);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dif;
    }

    public int findNumYearDifference(LocalDate startDate, LocalDate endDate) {
        int difference;

        Period diff = Period.between(startDate, endDate);
        System.out.print("Your have worked with the company ");
        difference = diff.getYears();
        System.out.printf("%d years", difference);
        return difference;
    }

    private static class DateConversion {

        public DateConversion(Months months) {

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
