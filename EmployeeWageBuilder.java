package UC5;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int FullTime=1;
    public static final int PartTime=2;
    public static final int wagePerHour=20;
    public static final int NumOfWorkingDays=20;

    public static void main(String[] args) {

        int workingHrs, empWage, totalEmpWage=0;

        for(int day=1; day<=NumOfWorkingDays; day++){
            System.out.println("\nDay: "+day);

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
                    workingHrs=0;
            }
            empWage = workingHrs * wagePerHour;
            totalEmpWage +=empWage;
            System.out.println("Employee Wage = "+empWage);
        }
        System.out.println("\nTotal Employee Wage = "+totalEmpWage);
    }
}
