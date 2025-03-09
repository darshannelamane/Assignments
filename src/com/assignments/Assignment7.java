package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment7 {
	 
	
	public static void main(String[] args) {
		int creditedCount=0;
		int debitedCount=0;
		int totalCredited=0;
		int totalDebited=0;
		int suspciousCredited=0;
		int noOfsuspciousinCredited=0;
        int suspciousdebited=0;
        int noOfsuspciousindebitedited=0;
        
		List <Integer> creditDebited= new ArrayList<Integer>();
		   
		         creditDebited.add(50000);
		         creditDebited.add(-2000);
		         creditDebited.add(3000);
		         creditDebited.add(-15000);
		         creditDebited.add(-200);
		         creditDebited.add(-300);
		         creditDebited.add(4000);
		         creditDebited.add(-3000);
		         creditDebited.add(79797);
		         creditDebited.add(-647);
		         creditDebited.add(-2);
		         creditDebited.add(-18888);
		        	 
		          for(int a=0; a<creditDebited.size(); a++)
		          {
		        	  
	                  if(creditDebited.get(a)>0)
	                  {
	                	  
	                	  creditedCount++;
	                	  totalCredited=totalCredited+creditDebited.get(a);
	                	   
	                	  if(creditDebited.get(a)>10000)
	                	  {
	                		 
	                		  System.out.println("suspecious ammount credited "+creditDebited.get(a));
	                		  noOfsuspciousinCredited++;
	                	  }
	                  }
	                  else if(creditDebited.get(a)<0)
	                  {
	                	   debitedCount++;
	                	    totalDebited=totalDebited+creditDebited.get(a);
	                 
	                	    if(creditDebited.get(a)<=-10000)
	                	    {
	                	    	
	                	       System.out.println("Supecious ammout is debited "+creditDebited.get(a));
	                	       noOfsuspciousindebitedited++;
	                	    }
	                  }
	                  
		          } 
		          
		          System.out.println("Total no of credited "+creditedCount);
		          System.out.println("Total no of debited "+debitedCount);
		          System.out.println("Total ammount credited "+totalCredited);
		          System.out.println("Total ammount debited "+totalDebited*-1);
		          
		          
		          System.out.println("Total no of suspecious credited amount "+noOfsuspciousinCredited);
		          System.out.println("Total no of suspecious debited amount "+noOfsuspciousindebitedited);
		         
		          
		          int totalAmmountinBank=totalCredited+(totalDebited);
		          
		          System.out.println("Total ammount remaining "+totalAmmountinBank);
		            
	     }
	
	}

