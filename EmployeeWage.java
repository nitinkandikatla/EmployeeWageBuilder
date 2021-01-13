public class EmployeeWage {
	
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		
		private final String company;
		private final int EMP_RATE_PER_HR;
		private final int NUM_WORKING_DAYS;
		private final int MAX_WORKING_HRS;
		private int totalEmpWage;
		
		public EmployeeWage(String company,int EMP_RATE_PER_HR,int NUM_WORKING_DAYS,int MAX_WORKING_HRS) {
			
		    this.company=company;
			this.EMP_RATE_PER_HR=EMP_RATE_PER_HR;
			this.NUM_WORKING_DAYS=NUM_WORKING_DAYS;
			this.MAX_WORKING_HRS=MAX_WORKING_HRS;
		}
		public void computeEmpWage() {
			
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
			totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
			
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Total Emp Wage for Company "+company+" is "+totalEmpWage;
		}
		public static void main(String[] args) {
			
				EmployeeWage dMart=new EmployeeWage("Dmart",20,20,100);
				EmployeeWage reliance=new EmployeeWage("Reliance",15,18,50);
				dMart.computeEmpWage();
				reliance.computeEmpWage();
				System.out.println(dMart);
				System.out.println(reliance);
		}
	
}
