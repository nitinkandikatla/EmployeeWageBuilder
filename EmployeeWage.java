package employeeWage;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CompanyEmpWage {

	
		public static final int IS_PART_TIME=1;
		public static final int IS_FULL_TIME=2;
		
		public String company;
		public int EMP_RATE_PER_HR;
		public int NUM_WORKING_DAYS;
		public int MAX_WORKING_HRS;
		public int totalEmpWage;
		
		public CompanyEmpWage() {
			
		}
		
		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public int getEMP_RATE_PER_HR() {
			return EMP_RATE_PER_HR;
		}

		public void setEMP_RATE_PER_HR(int eMP_RATE_PER_HR) {
			EMP_RATE_PER_HR = eMP_RATE_PER_HR;
		}

		public int getNUM_WORKING_DAYS() {
			return NUM_WORKING_DAYS;
		}

		public void setNUM_WORKING_DAYS(int nUM_WORKING_DAYS) {
			NUM_WORKING_DAYS = nUM_WORKING_DAYS;
		}

		public int getMAX_WORKING_HRS() {
			return MAX_WORKING_HRS;
		}

		public void setMAX_WORKING_HRS(int mAX_WORKING_HRS) {
			MAX_WORKING_HRS = mAX_WORKING_HRS;
		}

		public int getTotalEmpWage() {
			return totalEmpWage;
		}

		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage = totalEmpWage;
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
				System.out.println("Day:" +totalWorkingDays + " Emp hrs:" + empHrs + " Daily wage: " + empHrs*EMP_RATE_PER_HR + " total wage :" + totalEmpHrs*EMP_RATE_PER_HR);
				
			}
			System.out.println("Total EmpHrs:-" +totalEmpHrs);
			totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
			setTotalEmpWage(totalEmpWage);
			//return totalEmpWage;
		}

		@Override
		public String toString() {
			return "Company Details [company=" + company + ", EMP_RATE_PER_HR=" + EMP_RATE_PER_HR + ", NUM_WORKING_DAYS="
					+ NUM_WORKING_DAYS + ", MAX_WORKING_HRS=" + MAX_WORKING_HRS + ", totalEmpWage=" + totalEmpWage
					+ "]";
		}
		
		

}
public class EmployeeWage {
	
		public static void main(String[] args) {
			
			//ArrayList<CompanyEmpWage> company=new ArrayList<>();
			HashMap<String, CompanyEmpWage> companyToEmpWageMap=new HashMap<>();
			System.out.println("Enter how companys to add");
			Scanner sc =new Scanner(System.in);
			int companyCount=sc.nextInt();
			CompanyEmpWage c[]=new CompanyEmpWage[companyCount];
			for(int i=0;i<companyCount;i++) {
				
				Scanner s =new Scanner(System.in);
				c[i]=new CompanyEmpWage();
				System.out.println("Enter company name:");
				c[i].company=s.nextLine();
				System.out.println("Enter rate per hr");
				c[i].EMP_RATE_PER_HR=s.nextInt();
				System.out.println("number of working days:");
				c[i].NUM_WORKING_DAYS=s.nextInt();
				System.out.println("Enter max hrs");
				c[i].MAX_WORKING_HRS=s.nextInt();
				//company.add(c[i]);
				c[i].computeEmpWage();
				companyToEmpWageMap.put(c[i].company, c[i]);
				System.out.println("Company name: " + c[i].company);
			}
			System.out.println("list of companys :- ");	
			  for (Map.Entry<String, CompanyEmpWage> me : companyToEmpWageMap.entrySet()) {
				  System.out.println( me.getKey() ); 
			  }
			 
			
			}
}