package com.assignments;

public class Assignment2Array {
	
   public static void main(String[] args) {
	   
	   // Array of 2d Array 
	   //
	   String[][][] studentsDetails= {
			   // using 3d dimension array storing sem 1 data
			   {
				   {"Sem 1", "Maths","54"},
				   {"Sem 1", "physics","66"},
				   {"Sem 1", "Chemistry","65"},
				   {"Sem 1", "Computerscience","88"},
				   {"Sem 1", "Engineering","88"}
			   },
			   
			   // using 3d dimension array storing sem 2 data
			   {
				   {"Sem 2", "RTH","94"},
				   {"Sem 2", "phys","66"},
				   {"Sem 2", "CSS","95"},
				   {"Sem 2", "NIS","91"},
				   {"Sem 2", "SDS","98"}
			   },
			   {
				   {"Sem 3", "Maths","76"},
				   {"Sem 3", "physics","88"},
				   {"Sem 3", "Chemistry","76"},
				   {"Sem 3", "Compute","87"},
				   {"Sem 3", "SSD","88"}
				   
			   },
			   {
				   {"Sem 4", "CSS","96"},
				   {"Sem 4", "SOM","97"},
				   {"Sem 4", "MT","96"},
				   {"Sem 4", "MOC","87"},
				   {"Sem 4", "SiS","98"}
			   },
			   {
				   {"Sem 5", "SS","6"},
				   {"Sem 5", "OM","7"},
				   {"Sem 5", "T","6"},
				   {"Sem 5", "OC","7"},
				   {"Sem 5", "SS","8"}
			   }
	   };
	      //printing 1st sem with subject name and marks for 4th subject
          System.out.println("Sem of"+" "+studentsDetails[0][3][0]+" "+studentsDetails[0][3][1]+" "+studentsDetails[0][3][2]);
          
	     //printing 2st sem with subject name and marks for 5th subject
          System.out.println("Sem of"+" "+studentsDetails[1][4][0]+studentsDetails[1][4][1]+" "+studentsDetails[1][4][2]);
          
        //printing 3rd sem with subject name and marks for 3rd subject
          System.err.println("Sem of"+" "+studentsDetails[2][2][0]+" "+studentsDetails[2][2][1]+" "+studentsDetails[2][2][2]);

        //printing 4th sem with subject name and marks for 5th subject
          System.out.println(studentsDetails[3][4][0]+" "+studentsDetails[3][4][1]+" "+studentsDetails[3][4][2]);
          
        //printing 5th sem with subject name and marks for 3th subject
          System.out.println("Sem of"+" "+studentsDetails[4][2][0]+" "+studentsDetails[4][2][1]+" "+studentsDetails[4][2][2]);
          
          //printing 5th sem with subject name and marks for 2th subject
          System.out.println("Sem of"+" "+studentsDetails[4][1][0]+" "+studentsDetails[4][1][1]+" "+studentsDetails[4][1][2]);
          System.out.println(studentsDetails.length);
          
          System.out.println(studentsDetails[1][2][0]+" "+studentsDetails[1][2][1]+" "+studentsDetails[1][2][2]);
          System.out.println(studentsDetails[0][0][0]+" "+studentsDetails[0][0][1]+" "+studentsDetails[0][0][2]);
   }
}
