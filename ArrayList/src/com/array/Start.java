package com.array;

import java.util.ArrayList;

public class Start {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jordan");
		names.add("Jamie");
		names.add("Hannah");
		names.add("Sarah");
		
//		for(i=0;i<names.size();i++) {
//			System.out.println(names.get(i));
//		}
//		

		for(String data:names) {
			System.out.println(data);
		}
		
		
		
		for(String data:names) {
			if(data.equals("Hannah")) {
				System.out.println("Hannah is in this arraylist!");
			}
		}
		
	}
}
