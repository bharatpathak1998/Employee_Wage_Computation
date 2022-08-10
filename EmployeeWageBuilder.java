package UC2;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_PRESENT=1;
        int wagePerHour=20;
        int workingHrs=8;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if(empCheck==IS_PRESENT) {
            int empWage = workingHrs * wagePerHour;
            System.out.println("Employee is present");
            System.out.println("Employee Wage = "+empWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
}
