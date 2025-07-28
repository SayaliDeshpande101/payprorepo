package com.module3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.module1.Company;
import com.module2.CompanyImpl;

public class Main1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		 System.out.println("-------------------------------------------------------------------------------");
	        System.out.println("                          TECHNO SOLUTIONS PVT. LTD.                          ");
	        System.out.println("                         123 KarveNagar, Pune, India                    ");
	        System.out.println("-------------------------------------------------------------------------------");

		System.out.println();
		System.out.println("------------------------------Add_Employee_Details-----------------------------");
		System.out.println();
		System.out.print("Enter empolyee ID            : ");
		int eid=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Name          : ");
		String ename=sc.nextLine();
		System.out.print("Department            	     : ");
		String edept=sc.nextLine();
		System.out.print("Enter working days           : ");
		int wk_days=sc.nextInt();
		System.out.print("Enter Home allowance         : ");
		float hm_all=sc.nextFloat();
		System.out.print("Enter travlling allowance    : ");
		float tr_all=sc.nextFloat();
		System.out.print("Enter PF                     : ");
		float pf=sc.nextFloat();
		System.out.print("Enter tax amount             : ");
		float tax=sc.nextFloat();
		
		Company c = new Company();
		c.setEid(eid);
		c.setEname(ename);
		c.setEdept(edept);
		c.setWk_days(wk_days);
		
		Company cp = new Company();
		cp.setHm_all(hm_all);
		cp.setTr_all(tr_all);
		cp.setPf(pf);
		cp.setTax(tax);
		
		CompanyImpl imp = new CompanyImpl();
		imp.viewDetails(c);
		
		CompanyImpl imp2 = new CompanyImpl();
		imp2.calculateSalary(cp);
		
		
	}
}
