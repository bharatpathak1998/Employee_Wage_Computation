package UC4;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        final int FullTime=1;
        final int PartTime=2;
        int wagePerHour=20;
        int workingHrs=0;

        Random random = new Random();
        int empCheck = random.nextInt(3);

        switch(empCheck){
            case FullTime:
                System.out.println("Employee is present Full Time");
                workingHrs=8;
                break;
            case PartTime:
                System.out.println("Employee is present Part Time");
                workingHrs=4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int empWage = workingHrs * wagePerHour;
        System.out.println("Employee Wage = "+empWage);
    }
}
