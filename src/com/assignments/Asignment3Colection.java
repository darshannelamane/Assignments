package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Asignment3Colection {

	public static void main(String[] args) {

       // Storing 1st Employee Details in Row1
		
		Map<String,String> emp1DetailsRow1= new HashMap<String,String>();
		
			     emp1DetailsRow1.put ("EmpID1", "1231");
			     emp1DetailsRow1.put ("1st Emp Name", "Alice Green");
			     emp1DetailsRow1.put ("1st Emp age", "33");
			     emp1DetailsRow1.put ("1st Emp Gender", "Male");
			     emp1DetailsRow1.put ("1st Emp Name", "1231");
			     emp1DetailsRow1.put ("1st Emp Department", "Software engineer");
			     emp1DetailsRow1.put ("1st Emp Salary", "70,0000");
			     emp1DetailsRow1.put ("1st Emp Emailadress", "alice@gmail.com");
			     emp1DetailsRow1.put ("1st employe number","9009009392");
			     
                System.out.println(emp1DetailsRow1.get("1st employe number"));
		
			     Map<String,String> emp2etailsRow2= new HashMap<String,String>();
			     emp2etailsRow2.put("2nd emp id", "9999");
			     emp2etailsRow2.put("2nd emp name", "Bob Jhnonson");
			     emp2etailsRow2.put("2nd emp Age", "22");
			     emp2etailsRow2.put("2nd emp Gender", "Male");
			     emp2etailsRow2.put("2nd emp Department", "Marketing manager");
			     emp2etailsRow2.put("3rd emp Salaru", "222222");
			     emp2etailsRow2.put("2nd emp Mail adress", "bob@gmail.com");
			     emp2etailsRow2.put("2nd emp number", "9989971971");
		
		              System.out.println(emp2etailsRow2.get("2nd emp Age"));
		              System.out.println(emp2etailsRow2);
		
		
			Map<String,String> emp3DetailsRow3= new HashMap<String,String>();
		     emp3DetailsRow3.put("3rd emp id", "98387");
		     emp3DetailsRow3.put("3rd emp name", " Jhnonson");
		     emp3DetailsRow3.put("3rd emp Age", "56");
		     emp3DetailsRow3.put("3rd emp Gender", "female");
		     emp3DetailsRow3.put("3rd emp Department", "manager");
		     emp3DetailsRow3.put("2d emp Salaru", "990282");
		     emp3DetailsRow3.put("3rd emp Mail adress", "Jhnonson@gmail.com");
		     emp3DetailsRow3.put("3rd emp number", "998971");
		     
		    List <Map<String,String>> dataOfEmp= new ArrayList <Map<String,String>>();
		     dataOfEmp.add(emp1DetailsRow1);
		     dataOfEmp.add(emp2etailsRow2);
		     dataOfEmp.add(emp3DetailsRow3);
		     
		     System.out.println(dataOfEmp.get(2).get("3rd emp Mail adress"));

		 }
}