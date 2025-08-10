package com.learn.API;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {
		
	JsonPath js=new JsonPath(PayLoad.CoursePrice());
		
	int courseCount=	js.getInt("courses.size()");
	System.out.println(courseCount);
	
	//Print Purchase amount
	int totalAmount=js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmount);
	
	//Print title of first title
	
	String title=js.get("courses[0].title");
	System.out.println(title);
	
	//print all course titles and their respective prices
	for(int i=0;i<courseCount;i++) {
	String courseTitle = js.getString("courses["+i+"].title"); // JsonPath has getString
	int coursePrice = js.getInt("courses["+i+"].price");
	System.out.println(courseTitle);
	System.out.println(coursePrice);
	
	//print purchase amount
	int totalAmount1=js.getInt("dashboard.purchaseAmount");
	System.out.println(totalAmount1);
	}
	
	for(int i=0;i<courseCount;i++) {
	String courseTitle = js.getString("courses["+i+"].title");
	if(courseTitle.equalsIgnoreCase("RPA")) {
		int copies=js.getInt("courses["+i+"].copies");
		System.out.println(copies);
		break;
	}
	}
	
	//veify sum of all courses
	
	
		
	}

}
