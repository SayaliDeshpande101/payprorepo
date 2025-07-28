package com.module2;

import com.module1.Company;

public class CompanyImpl implements CompanyInterface {
	
	@Override
	public void viewDetails(Company c) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("---------------------------------Employee_Details--------------------------------");
		System.out.println();
		System.out.println("Employee ID            : "+c.getEid());
		System.out.println("Employee name          : "+c.getEname());
		System.out.println("Department             : "+c.getEdept());
		System.out.println("Working days           : "+c.getWk_days());
		
	}

	@Override
	public void calculateSalary(Company cp) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------------Salary_Details--------------------------------");
		float salary=20000;
		
		System.out.println();
		System.out.println("Basic salary           : "+salary);
		System.out.println();
		System.out.println("Home allowance         : "+cp.getHm_all());
		System.out.println("Travelling allowance   : "+cp.getTr_all());
		
		System.out.println();
		
		float new_salary=(salary)+cp.getHm_all()+cp.getTr_all();
		System.out.println("GROSS SALARY           : "+new_salary);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("PF                     : "+cp.getPf());
		System.out.println("TAX                    : "+cp.getTax());
		System.out.println();
		
		float total=cp.getPf()+cp.getTax();
		System.out.println("TOTAL DEDUCTION	       : "+total);
		float total_salary=new_salary-(total);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Total In-hand Salary  : "+total_salary);
		
	}

	
}
