package com.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

	public static void main(String[] args) {
		
    //Storing employee names in a Single array
        String [] empname= {"Alice","Smith","Davis","Brown","Green"};
        
        //Storing employee data's in an double array
        Double[] emp1data= {75000.00, 5.0, 4.2};
        Double[] emp2data= {68000.00, 3.0, 3.8};
        Double[] emp3data= {82000.00, 7.0, 4.2};
        Double[] emp4data= {90000.00, 10.0, 2.0};
        Double[] emp5data= {6000.00, 5.0, 4.2};
		
        //since we have stored emp name and emp data separate using map here we are storing each emp data's with respect to emp name
        // by using String and double data type since emp names are string and emp data's are double.
        Map <String,Double[]> empdatas= new  HashMap <String,Double[]>();
              
                     empdatas.put(empname[0], emp1data);
                     empdatas.put(empname[1], emp2data);
                     empdatas.put(empname[2], emp3data);
                     empdatas.put(empname[3], emp4data);
                     empdatas.put(empname[4], emp4data);
                     
// Declaring these local variable outside of the for loop since these variables or data's are needed in to calucalate Hike percentage
// if we declare inside for each loop we cannot use outside of the loop since its declared ouside of the loop we can utilise where ever its required                    
                     double variablePay;
                     int bonus;
                     int rewards=0;
                     
  // Creating Map since in the assignment they have asked calucalate every emp hike percentage and should store in map with emp name 
 // since when emp hike is calucalated we can use this map to store emp name and hike percentage dynamicaly thats why created outside loop
                     
                     Map <String,Double> hikePercentage= new  HashMap <String,Double>();
                     
  // used far each loop since we need to calucalate each and every emp Hike percentage so to itrate how many employes are there
  // directly using far each loop                   
                    for(String emp:empname)	 
                    	
                     {
                   // here by creating double array taking the data's for each and every employee seperately from map by adress.get(key value) since its map where which is having all the datas for each and every emloyee
                 // so taking each emp data seperately and storing in double eachEmployeData array
                   // so each data's of emp like salary, expereince, and rating can be stored in respetive varibale by using adress[eachEmployeData] and index value since we stored in array
                    	   Double[] eachEmployeData= empdatas.get(emp);
                    	   Double empSalary= eachEmployeData[0];
                    	   Double empExpereince= eachEmployeData[1];
                    	   Double empRating= eachEmployeData[2];
                    	   
                 // as per  the requirement writing the condition and variables which we have declared outside here we are using. 	   
                    	   if(empRating>=4)
                    	   {
                    		   variablePay=15;
                    		   bonus=1500;
                    	   }
                    	   
                    	   else if(empRating>=3)
                    	   {
                    		   variablePay=10;
                    		   bonus=1200;
                    	   }
                    	   else
                    	   {
                    		   variablePay=3;
                    		   bonus=300;	   
                    	   }
                    	   
                    	   if(empExpereince>=5)
                    	   {
                    		   rewards=5000;
                    	   }
                    	   
                    	   double hike= (empSalary*variablePay/100)+bonus+rewards;
                    	   
                    	   double hikepercentage= (hike/empSalary)*100;
                    	   
                    	   // storing emp name and hike percentage in map.
                    	   hikePercentage.put(emp, hikepercentage);
                     }
                     
                     System.out.println("Employes name and Hike Percentage");
                     System.out.println(hikePercentage);
	}

}
