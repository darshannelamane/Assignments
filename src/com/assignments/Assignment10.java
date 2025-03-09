package com.assignments;

public class Assignment10 {

	public static void main(String[] args) {
		
		//simple 
		
		int [] stock= {5,8,6,7,15,31,1};
		
		int maxProfit=0;
		int buyDay = 0;
		int sellDay=0;
		
		for(int i=0; i<stock.length-1; i++)
		{
			for(int j=i+1; j<stock.length; j++)
			{
				int profit= stock[j]-stock[i];
				
				if(profit>maxProfit)
				{
					profit=maxProfit;
					buyDay= i+1;
					sellDay=j+1;
				}
			}
			
		}	 
		
		 if(maxProfit>0) {
			 
			 System.out.println("Buy day is "+ buyDay);
			 System.out.println("sell day is "+ sellDay);
			 System.out.println("maximum profit is "+maxProfit);
		 }
			 else
			 {
				 System.out.println("Don't buy there is no profit in any day");
			 }
		
			
	}

}
