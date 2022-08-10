package UC3;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int FullTime=1;
        int PartTime=2;
        int wagePerHour=20;
        int workingHrs=0;

        Random random = new Random();
        int empCheck = random.nextInt(3);

        if(empCheck==FullTime) {
            workingHrs=8;
            System.out.println("Employee is Present Full Time");
        } else if (empCheck==PartTime) {
            workingHrs=4;
            System.out.println("Employee is Present Part Time");
        } else {
            System.out.println("Employee is Absent");
        }
        int empWage = workingHrs * wagePerHour;
        System.out.println("Employee Wage = "+empWage);
    }
}
