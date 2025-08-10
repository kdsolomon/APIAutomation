package com.learn.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	@Test
	public void sumOfCourses() {
		
		JsonPath js=new JsonPath(PayLoad.CoursePrice());
		int sum=0;
		int courseCount=js.getInt("courses.size()");
		for(int i=0;i<courseCount;i++) {
			int coursePrice = js.getInt("courses["+i+"].price");
			int courseCopies = js.getInt("courses["+i+"].copies");
			int amount=coursePrice*courseCopies;
			System.out.println(amount);
			sum=sum+amount;
		}
		System.out.println(sum);
		int totalAmount1=js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, totalAmount1);
	}
	

}
