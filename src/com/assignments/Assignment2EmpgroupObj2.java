package com.assignments;

public class Assignment2EmpgroupObj2 {

	public static void main(String[] args) {
		//Creating instance of Assignment2EmpdetailsObj2 class
		
		Assignment2EmpdetailsObj2 obj1= new Assignment2EmpdetailsObj2();
		
		// Creating an String array to stroe Empployee names
		String [] emplyoyesName= {obj1.emplyename1, obj1.emplyename2, obj1.emplyename3};
		
		//Creating int array to store Emp id
		int[] empid= {obj1.empid1, obj1.empid2, obj1.empid3};
		
		//Printing employee names
		System.out.println(emplyoyesName[0]+" "+emplyoyesName[1]+" "+emplyoyesName[2]);
		
		//Printing employee ID
		System.out.println(empid[0]+" "+empid[1]+" "+empid[2]);
	}

}
