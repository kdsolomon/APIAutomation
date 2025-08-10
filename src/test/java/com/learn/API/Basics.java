package com.learn.API;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.PayLoad;
import files.ReUsableMethods;

public class Basics {

	public static void main(String[] args) {
		
		//given all imputs
		// when submit API, resource,http method


		RestAssured.baseURI="https://rahulshettyacademy.com/";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(PayLoad.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("server", "Apache/2.4.52 (Ubuntu)").extract().asString();
		
		//Add place then update with new add, get place add to validate if new add is updated
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String placeID=js.getString("place_id");
		System.out.println("place id is "+placeID);
		
		//Update place
		String newAdd="Summer Walk Africaaaaa";
		given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\""+newAdd+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		//GetPlace
		
	String getResponse=	given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeID)
		.when().put("maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract().asString();
	
	JsonPath js1=ReUsableMethods.rawToJson(getResponse);
	String actulAdd=js1.get("address");
	System.out.println("Actual address is "+actulAdd);
	Assert.assertEquals(actulAdd, newAdd);

}}
