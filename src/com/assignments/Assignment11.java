package com.assignments;

public class Assignment11 {

	
	int result=1;
	public int power(int x,int n)
	{
	 	
		for(int i=0; i<n; i++)
		{
			result=result*x;
		}
		
		return result; 
	}
	
	
	public static void main(String[] args) {
	
		Assignment11 obj= new Assignment11();
		 
		  int res= obj.power(10,1);
		  System.out.println(res);
	}

}
