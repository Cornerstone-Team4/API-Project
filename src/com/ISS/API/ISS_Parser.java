package com.ISS.API;

import org.json.JSONException;
import org.json.JSONObject;
import com.ISS.API.JsonReader;


public class ISS_Parser {
	
	
	
	JsonReader jReader = new JsonReader();
	 String sourceFile;
	 public JSONObject data;
	 public ISS_Parser(String aFile) {
		 jReader.readFromFile(aFile, "jsonFile"); 
		 try {
			data = new JSONObject(jReader.getReaderString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
}
