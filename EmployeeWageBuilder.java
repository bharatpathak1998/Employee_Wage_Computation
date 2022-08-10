package UC6;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int FullTime=1;
    public static final int PartTime=2;
    public static final int wagePerHour=20;
    public static final int NumOfWorkingDays=20;
    public static final int MaxWorkingHrs=100;

    public static void main(String[] args) {

        int workingHrs, empWage, totalWorkingHrs=0, totalWorkingDays=0;
        while(totalWorkingHrs<=MaxWorkingHrs && totalWorkingDays<NumOfWorkingDays) {
            totalWorkingDays++;
            System.out.println("\nDay: "+totalWorkingDays);

            Random random = new Random();
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case FullTime:
                    System.out.println("Employee is present Full Time");
                    workingHrs = 8;
                    break;
                case PartTime:
                    System.out.println("Employee is present Part Time");
                    workingHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    workingHrs = 0;
            }
            totalWorkingHrs += workingHrs;
            System.out.println("Employee working hours = " + workingHrs);

            empWage = workingHrs * wagePerHour;
            System.out.println("Employee Wage = "+empWage);
        }
        int totalEmpWage = totalWorkingHrs * wagePerHour;
        System.out.println("\nTotal Employee Wage = "+totalEmpWage);
    }
}
