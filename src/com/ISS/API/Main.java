package com.ISS.API;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	
	static JsonReader jReader = new JsonReader();

	public static void main(String[] args) throws JSONException  {
			
		ISS_Parser parser = new ISS_Parser("C:\\Users\\ruach\\Desktop\\TestFiles\\");
		
		if (parser.data.getString("message").equals("success")) {
			int timeStamp;
			timeStamp = parser.data.getInt("timestamp");
			System.out.println("timestamp: " + timeStamp);
			JSONObject position = (JSONObject) parser.data.get("iss_position");
			String latitude = position.getString("latitude");
			String longitude = position.getString("longitude");
			
			System.out.println("The ISS latitude is: " + latitude + ", and the longtitude is: " + longitude);
		}
	}	
}
