package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment7Colec {

	public static void main(String[] args) {

		List<String> empName= new ArrayList<String> ();
		
		empName.add("Alice");
		empName.add("Bob");
		empName.add("Carlo");
		empName.add("David");
		empName.add("Green");
		
		List<Integer> salary= new ArrayList<Integer> ();
		  
		          salary.add(1212);
		          salary.add(1222);
		          salary.add(1112);
		          salary.add(1111);
		          salary.add(0000);
		          
		          Map<List,List> emDarshan= new LinkedHashMap<List,List>();
		          
		          emDarshan.put(salary,empName);
		          
		          System.out.println(emDarshan.get(0).get());
	}

}
