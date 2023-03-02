package week2.day1;

public class EmployeeDetails {
	

		
		public void printEmpName(String empName,int empId) {
			System.out.println("EmployeeName="+empName);
			System.out.println("EmpId="+empId);
		}
		public void getEmpAddress(String empAddress) {
			System.out.println("Emp Address="+empAddress);
		}

		public void printEmpSalary(double empSalary) {
			System.out.println("Emp Salary="+empSalary);
		}
		public void empMobileNumber(long mobNum) {
			System.out.println("Emp Mobile Number="+mobNum);
		}
		
		public static void main(String[] args) {
			EmployeeDetails empDetail=new EmployeeDetails(); 
			empDetail.printEmpName("thooy", 12345);
			empDetail.getEmpAddress("tiruppur");
			empDetail.empMobileNumber(8515624562l);
			empDetail.printEmpSalary(45665.99);
			
			
		}
		
	
	}
	


