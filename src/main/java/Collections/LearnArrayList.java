package Collections;

import java.util.ArrayList;

public class LearnArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Solomon");
		name.add("Sameer");
		name.add(1, "Test");
		
		System.out.println(name);
		
		ArrayList<String> newList=new ArrayList<String>();
		newList.add("Learn");
		newList.add("Testttt");
		 name.addAll(newList);
		System.out.println(name);
		
		System.out.println(name.get(0));
		name.clear();
		
		System.out.println(name);
	}
	
	

}
