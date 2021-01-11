public class EmployeeWage {
	
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		public static final int EMP_RATE_PER_HR=20;
		public static final int NUM_WORKING_DAYS=20;
		public static final int MAX_WORKING_HRS=100;
		
		public static int computeEmpWage(String company,int EMP_RATE_PER_HR,int NUM_WORKING_DAYS,int MAX_WORKING_HRS) {
			int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
			
			while(totalEmpHrs<=MAX_WORKING_HRS && totalWorkingDays<NUM_WORKING_DAYS) {
				totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case IS_PART_TIME: 
				empHrs=4;
				break;
			case IS_FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day:" +totalWorkingDays + " Emp hrs:" + empHrs);
			}
			int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
			System.out.println("Emp total Wage for company :" + company + " is :" + totalEmpWage);
			return totalEmpWage;
		}
		
		public static void main(String[] args) {
				computeEmpWage("Dmart",20,20,100);
				computeEmpWage("Reliace",15,20,50);
		}
	
}
