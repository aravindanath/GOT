package javaCollcetions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleSet { 
	
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Arvind");
		set.add("Sharen");
		set.add("Sujata");
		set.add("Praveena");
		set.add("Sujata");
//		System.out.println(set);
		for(String obj : set) {
			System.out.println(obj);
		}}
		
	}


