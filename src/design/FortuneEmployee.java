package design;

import java.time.Month;

public class FortuneEmployee {

    /**
     * FortuneEmployee class has a main method where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes
     * <p>
     * Demonstrate as many methods as possible to use with proper business work flow.
     * Try to think like a Software Architect/Developer.
     * This application should provide basic employee information services
     * </p>
     * <p>
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     * </p>
     **/
    public static void main(String[] args) {

        TimeOff timeOff = new TimeOff(10, 14);
        Email email = new Email(4);
        PC pc = new PC("DELL", 564, true, 123456, email);
        SmartPhone smartPhone = new SmartPhone("Apple", 64, 987654);
        EmployeeInfo employee = new EmployeeInfo(timeOff, pc, smartPhone);

        employee.inputEmployeeName();
        employee.setEmployeeID();
        employee.assignDepartment("IT");
        employee.pc.getEmail().assignEmailAddress(employee.employeeFullName);
        employee.setBiWeeklyGross(5645);
        employee.calculateSalary(2021, employee.getBiWeeklyGross());
        employee.calculateEmployeeBonus("Best", employee.getSalary());
        employee.calculateEmployeePension();
        employee.benefitLayout();
        employee.timeOff.setNumOfSickDays(10);
        employee.timeOff.setNumOfVacationDays(14);
        employee.timeOff.checkHolidays(Month.MARCH);
        employee.timeOff.checkHolidays(Month.DECEMBER);
        employee.timeOff.signIn();
        employee.pc.email.sendEmail();
        employee.pc.createReport();
        employee.smartPhone.dialIntoConference();
        employee.pc.submitTimeSheet();
        employee.timeOff.signOff();

    }

}
