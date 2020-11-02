import java.util.Random;
import java.util.Scanner;


public class EmployeeWageComputation {

    static int day = 1,totalWorkingHours = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        int companyCount = 1;
        while (true){
            System.out.println("----------------------------------------------");
            System.out.println("Employee Wage Computation for Company "+companyCount);
            System.out.println("----------------------------------------------");

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Wage Per Hour : ");
            int wageperhour = input.nextInt();

            System.out.println("Enter Full Day Hours : ");
            int fulldayhour = input.nextInt();

            System.out.println("Enter Half Day Hours : ");
            int halfdayhour = input.nextInt();

            System.out.println("Enter Maximum Number of Days Employee can Work In a Month : ");
            int maxdays = input.nextInt();

            System.out.println("Enter Maximum Working Hours Employee can Work In a Month : ");
            int totalworkinghour = input.nextInt();

            EmployeeWageComputation emp = new EmployeeWageComputation();
            System.out.println("----------------------------------------------");
	    emp.days(fulldayhour,halfdayhour,maxdays);

            if (totalWorkingHours > totalworkinghour) {
                totalWorkingHours = totalworkinghour;
            }
            emp.totalWage(wageperhour);
	    System.out.println("----------------------------------------------");

            System.out.println("Do You Want count for one more Company?");
            System.out.println("Press y for yes");
            System.out.println("Press n for no");
            Scanner scanner = new Scanner(System.in);
            String confirm = scanner.nextLine();
            if(confirm.equals("y") || confirm.equals("yes")){
                companyCount+=1;
                continue;
            }else if (confirm.equals("n") || confirm.equals("no")){
                System.out.println("******END******");
                break;
            }

        }
    }

    public void totalWage(int wagePerHour) {
        int totalMonthlyWage = totalWorkingHours * wagePerHour;
        System.out.println("Employee worked " + totalWorkingHours + " Hours in a Month");
        System.out.println("Employee Wage : " + totalMonthlyWage);
    }

    public void days(int fullDayHours, int halfDayHours, int d) {

        Random ran = new Random();
        int ran1 = ran.nextInt(3);

        if (ran1 == 0) {
            totalWorkingHours += fullDayHours;
        } else if (ran1 == 1) {
            totalWorkingHours += halfDayHours;
        }
        day += 1;
        if (day <= d) {
            EmployeeWageComputation emp = new EmployeeWageComputation();
            emp.days(fullDayHours, halfDayHours, d);
        }
    }
}
