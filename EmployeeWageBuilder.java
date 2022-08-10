package UC1;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        int IS_PRESENT=1;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if(empCheck==IS_PRESENT) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
