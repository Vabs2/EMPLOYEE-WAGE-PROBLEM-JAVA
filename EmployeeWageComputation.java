import java.util.Random;

class CompanyEmployeeWage{
    public final String company;
    public final int wagePerHour;
    public final int workingDays;
    public final int maxMonthHours;
    public int totalMonthlyWage;

    public CompanyEmployeeWage(String company, int wagePerHour, int workingDays, int maxMonthHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.maxMonthHours = maxMonthHours;
    }
    public void setTotalMonthlyWage(int totalMonthlyWage){
        this.totalMonthlyWage=totalMonthlyWage;
    }
    @Override
    public String toString(){
        return "Total employee Wage for " + company + " is : "+ totalMonthlyWage;
    }
}
class EmployeeWageBuilderArray{

    private int numOfCompany=0;
    private CompanyEmployeeWage[] EmployeeWageBuilderArray;

    public EmployeeWageBuilderArray() {
        EmployeeWageBuilderArray = new CompanyEmployeeWage[5];
    }
    void addEmployeeWageBuilder(String company, int wagePerhour, int workingDays, int maxMonthHours){
        EmployeeWageBuilderArray[numOfCompany] = new CompanyEmployeeWage(company, wagePerhour, workingDays,maxMonthHours);
        numOfCompany++;
    }
    void totalWage(){
        for (int i=0; i<numOfCompany; i++){
            EmployeeWageBuilderArray[i].setTotalMonthlyWage(this.totalWage(EmployeeWageBuilderArray[i]));
            System.out.println(EmployeeWageBuilderArray[i]);
        }
    }
    private int totalWage(CompanyEmployeeWage companyEmployeeWage) {

        int totalMonthlyWage=0,totalWorkingHours=0, fullDayHours=8, halfDayHours=4;
        for (int i=0; i<companyEmployeeWage.workingDays; i++) {

            Random ran = new Random();
            int ran1 = ran.nextInt(3);


            if (ran1 == 0) {
                totalWorkingHours += fullDayHours;
            } else if (ran1 == 1) {
                totalWorkingHours += halfDayHours;
            } else {
                totalWorkingHours += 0;
            }

            if (totalWorkingHours > companyEmployeeWage.maxMonthHours) {
                totalWorkingHours = companyEmployeeWage.maxMonthHours;
                break;
            }
        }

        return totalMonthlyWage=totalWorkingHours * companyEmployeeWage.wagePerHour;
    }
}

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        System.out.println("====================================");
        EmployeeWageBuilderArray employeeWageBuilderArray = new EmployeeWageBuilderArray();
        employeeWageBuilderArray.addEmployeeWageBuilder("First Company",20,20,100);
        employeeWageBuilderArray.addEmployeeWageBuilder("Second Company", 25,25, 120);
        employeeWageBuilderArray.totalWage();
    }
}
