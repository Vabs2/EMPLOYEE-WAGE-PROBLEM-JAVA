public class EmployeeWageProblem
{
	public static void main ( String args[] )
	{
		int checkNumber=(int)(Math.floor(Math.random()*10)%2);
		int salary=0, IS_PRESENT=1,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8;
		final int IS_FULLTIME=1, IS_PARTTIME=2, NOOFDAYS=20,MAX_DAYS=20, MAX_HOURS=100;
		int empHours=0, totalEmpHours=0, noOfDays=0;
		if ( checkNumber == IS_PRESENT )
		{
         System.out.println("Employee Is Present..!");
			salary=(WAGE_PER_HOUR*FULL_DAY_HOUR);
			System.out.println("Employee Salary = "+salary);
		}

		int totalSalary=0;
		while ( totalEmpHours < MAX_HOURS && noOfDays < MAX_DAYS )
      		{
		int checkNumbers=(int)(Math.floor(Math.random()*10)%3);

		noOfDays=noOfDays+1;

		switch (checkNumbers)
   	 	{
   	 	case IS_FULLTIME:
                	System.out.println("--------------------------------------------------------------");
   	        	System.out.println("Employee Is Full Time..!");
   	        	empHours=8;
   	        	break;
   	   	case IS_PARTTIME:
                        System.out.println("--------------------------------------------------------------");
			System.out.println("Employee Is Part Time..!");
 	        	empHours=4;
 	        	break;
 	   	default:
	                System.out.println("--------------------------------------------------------------");
 	        	System.out.println("Employee Is Absent..");
 	        	empHours=0;
 	        	break;
 	 	}

      		salary=empHours*WAGE_PER_HOUR;
		totalEmpHours=totalEmpHours+empHours;
		totalSalary=totalSalary+salary;
		System.out.println("Salary of Employee on "+noOfDays+ "th Day is.."+salary);
		}
		System.out.println("--------------------------------------------------------------");
		System.out.println("Total Employee Hours for Month is :"+ totalEmpHours);
                System.out.println("--------------------------------------------------------------");
		System.out.println("ToTal Salary of Employee is.." + totalSalary);
                System.out.println("--------------------------------------------------------------");
	}
}
