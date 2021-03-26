package design;

import java.time.Month;

public class TimeOff {

    private int numOfVacationDays;
    private int numOfSickDays;

    public TimeOff(){}

    public TimeOff(int numOfSickDays, int numOfVacationDays){
        this.numOfSickDays = numOfSickDays;
        this.numOfVacationDays = numOfVacationDays;
    }

    public int getNumOfVacationDays() {
        return numOfVacationDays;
    }

    public void setNumOfVacationDays(int numOfVacationDays) {
        this.numOfVacationDays = numOfVacationDays;
        System.out.println("You have " + numOfVacationDays + " vacation days.");
    }

    public int getNumOfSickDays() {
        return numOfSickDays;
    }

    public void setNumOfSickDays(int numOfSickDays) {
        this.numOfSickDays = numOfSickDays;
        System.out.println("You have " + numOfSickDays + " sick days.");
    }

    public void signIn() {
        System.out.println("It's 9 am. Coffee in a cup. Let's start this day.");
    }

    public void signOff() {
        System.out.println("It's 5 pm. The work day is over. Enjoy your evening.");
    }

    public String checkHolidays(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("The holidays in January are : New Year Day and Martin Luther King's Day.");
                break;
            case FEBRUARY:
                System.out.println("The holiday in February is : Presidents Day.");
                break;
            case MAY:
                System.out.println("The holiday in May is Memorial Day.");
                break;
            case JULY:
                System.out.println("The holiday in July is Independence Day.");
                break;
            case SEPTEMBER:
                System.out.println("The holiday in September is Labor Day.");
                break;
            case OCTOBER:
                System.out.println("The holiday in October is Columbus Day.");
                break;
            case NOVEMBER:
                System.out.println("The holidays in November are Thanksgiving and Veteran's Day. ");
                break;
            case DECEMBER:
                System.out.println("The holiday in December is Christmas Day.");
                break;
            default:
                System.out.println("The are no holidays in this month.");
        }
        return null;
    }

}
