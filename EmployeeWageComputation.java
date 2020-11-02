import java.util.Random;

class EmployeeWageBuilder{
    private final String company;
    private final int wagePerHour;
    private final int workingDays;
    private final int maxMonthHours;
    private int totalMonthlyWage;

    EmployeeWageBuilder(String company, int wagePerHour, int workingDays, int maxMonthHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxMonthHours = maxMonthHours;

    }

    public void totalWage() {

        int totalWorkingHours=0, fullDayHours=8, halfDayHours=4;
        for (int i=0; i<workingDays; i++) {

            Random ran = new Random();
            int ran1 = ran.nextInt(3);

            if (ran1 == 0) {
                totalWorkingHours += fullDayHours;
            } else if (ran1 == 1) {
                totalWorkingHours += halfDayHours;
            } else {
                totalWorkingHours += 0;
            }

            if (totalWorkingHours > maxMonthHours) {
                totalWorkingHours = maxMonthHours;
                break;
            }
        }

        totalMonthlyWage=totalWorkingHours * wagePerHour;
    }
    @Override
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
}

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmployeeWageBuilder company1 = new EmployeeWageBuilder("First Company",20,20,100);
        company1.totalWage();
        System.out.println(company1);
        System.out.println("---------------------------------------");
        EmployeeWageBuilder company2 = new EmployeeWageBuilder("Second Company", 25,25, 120);
        company2.totalWage();
        System.out.println(company2);
    }
}
