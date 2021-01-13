class CompanyEmpWage {

	
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		
		private final String company;
		private final int EMP_RATE_PER_HR;
		private final int NUM_WORKING_DAYS;
		private final int MAX_WORKING_HRS;
		private int totalEmpWage;
		
		public CompanyEmpWage(String company,int EMP_RATE_PER_HR,int NUM_WORKING_DAYS,int MAX_WORKING_HRS) {
			
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
			return "Total Emp Wage for Company "+company+" is "+totalEmpWage;
		}
}
public class EmployeeWage {
		public static void main(String[] args) {
			    
				CompanyEmpWage c[]=new CompanyEmpWage[3];
				c[0]=new CompanyEmpWage("Dmart",20,20,100);
				c[1]=new CompanyEmpWage("Reliance",15,18,50);
				c[2]=new CompanyEmpWage("Tesla",25,25,120);
				for(int i=0;i<c.length;i++)
	    		{
	        		c[i].computeEmpWage();
	        		System.out.println(c[i]);
			    }
		}
	
}
