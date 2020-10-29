import java.util.Random;

public class EmployeeWageComputation {

    static int wagePerHour = 20, day = 1;
    static int fullDayHours = 8, halfDayHours = 4, totalWorkingHours = 0;

    public static void main(String[] args) {
        EmployeeWageComputation emp = new EmployeeWageComputation();
        emp.days();

        if (totalWorkingHours > 100) {
            totalWorkingHours = 100;
        }
        emp.totalWage();
    }

    public void totalWage() {
        int totalMonthlyWage = totalWorkingHours * wagePerHour;
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Wage : " + totalMonthlyWage);
    }

    public void days() {

        Random ran = new Random();
        int ran1 = ran.nextInt(3);

        if (ran1 == 0) {
            totalWorkingHours += fullDayHours;
        } else if (ran1 == 1) {
            totalWorkingHours += halfDayHours;
        }
        day += 1;
        if (day <= 20) {
            EmployeeWageComputation emp = new EmployeeWageComputation();
            emp.days();
        }
    }
}
