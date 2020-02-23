package javaCollcetions;

import java.util.ArrayList;
import java.util.List;

public class ExampleList { 
	
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Arvind");
		list.add("Sharen");
		list.add("Sujata");
		list.add("Sujata");
		System.out.println(list.get(3));
//		list.forEach(li -> System.out.println(li));

//		for(String obj : list) {
//			
//			if(obj.equals("Anil")) {
//				System.out.println("Found");
//				break;
//			}else {
//			System.out.println(obj);
//		}}
		
	}

}
