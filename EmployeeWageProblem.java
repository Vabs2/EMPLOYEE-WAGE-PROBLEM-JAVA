public class EmployeeWageProblem
{
	public static void main ( String args[] )
	{
		int checkNumber=(int)(Math.floor(Math.random()*10)%3);
		int salary=0, IS_PRESENT=1,WAGE_PER_HOUR=20,FULL_DAY_HOUR=8;
		final int IS_FULLTIME=1, IS_PARTTIME=2;
		int empHours=0;
		if ( checkNumber == IS_PRESENT )
		{
         System.out.println("Employee Is Present..!");
			salary=(WAGE_PER_HOUR*FULL_DAY_HOUR);
			System.out.println("Employee Salary = "+salary);
		}
		else
		{
			System.out.println("Employee Is Absent..!");
	      System.out.println("Employee Salary = "+salary);
		}

		/*if ( checkNumber == IS_FULLTIME )
		{
			System.out.println("Employee Is Full Time..!");
			empHours=8;
		}
		else
		if ( checkNumber == IS_PARTTIME )
      {
         System.out.println("Employee Is Part Time..!");
         empHours=4;
      }
		else
		{
			System.out.println("Employee Is Absent..");
			empHours=0;
		}
		salary=empHours*WAGE_PER_HOUR;
		System.out.println("Salary of Employee is.."+salary);*/

		switch (checkNumber)
   	 	{
   	 	case IS_FULLTIME:
   	        	System.out.println("Employee Is Full Time..!");
   	        	empHours=8;
   	        	break;
   	   	case IS_PARTTIME:
  	        	System.out.println("Employee Is Part Time..!");
 	        	empHours=4;
 	        	break;
 	   	default:
 	        	System.out.println("Employee Is Absent..");
 	        	empHours=0;
 	        	break;
 	 	}
      		salary=empHours*WAGE_PER_HOUR;
      		System.out.println("Salary of Employee is.."+salary);

	}
}
