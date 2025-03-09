package com.assignments;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assign4ColectionArray {

	public static void main(String[] args) {
		
		List<String> popCountry= new LinkedList<String>();
		  // Storing the top populated countries in Linked list since Order may change in future thats why linked list.
		      popCountry.add("INDIA");
		      popCountry.add("CHINA");
		      popCountry.add("United states");
		      popCountry.add("INONESIA");
		      popCountry.add("PAKISTAN");
		      System.out.println("World 2nd populated country "+popCountry.get(1));
		      
		   Set<String> topVisitedPlace= new LinkedHashSet<String>();
		// 
		              topVisitedPlace.add("Eiffel Tower");
		              topVisitedPlace.add("Great Wall of China");
		              topVisitedPlace.add("New York");
		              topVisitedPlace.add("Colosseum");
		              topVisitedPlace.add("London");
		              topVisitedPlace.add("Acropolis of Athens");
		              topVisitedPlace.add("Dubai");
		              topVisitedPlace.add("Louvre Museum");
		              System.out.println("The size is "+topVisitedPlace.size());
		              
		     Map<String,Integer> usTopPopCities= new LinkedHashMap<String,Integer>();
		     // Storing top 5 countries based on population in TreeMap because in future population may changes so Tree map will Alywas store the value in Assending order
		               usTopPopCities.put("New York City",67518761);
		               usTopPopCities.put("Los Angeles",7217812);
		               usTopPopCities.put("Chicago",721781);
		               usTopPopCities.put("Houston,",721781);
		               usTopPopCities.put("Phoenix",721781);
		               System.out.println("Top 5 populated cities in US are "+ usTopPopCities);
		               
		               int [] numbers= {1,22,33,43,5,6,7,8,9,10};
		               
		               System.out.println("sum of third and fifth value "+numbers[2]+numbers[4]);
		               /* or */
		               
		               int thirAndFith= numbers[2]+numbers[4];
		               System.out.println(thirAndFith);

              List<String> topCollectionMovie= new LinkedList<String>();
               topCollectionMovie.add("Baahubali 2");
               topCollectionMovie.add("Pushpa: The Rule - Part 2");
               topCollectionMovie.add("RRR");	              
		      System.out.println("Top Second Collection movie is "+topCollectionMovie.get(1));         
		                
	}
	

}
