package neows;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import requester.*;
import saver.JsonParser;
import saver.JsonReader;

@SuppressWarnings("unused")
public class Neo_Parser {

	JSONObject jObject = new JSONObject();
	JsonReader jReader = new JsonReader();
	JsonRequester jRequester = new JsonRequester();
	JsonSaver jSaver = new JsonSaver();
	JsonParser jParser = new JsonParser();
	String requestString;
	ArrayList<JSONObject> jsonObjects_AL = new ArrayList<JSONObject>();

	public void request() {

		jRequester.makeRequest("https://api.nasa.gov/neo/rest/v1/neo/browse?api_key=Hvhsssfu66mY3kGSEQbbxYsRJ5TZerntwuWlGKph");
		requestString = jRequester.getOutputRequestString();
		jSaver.createOutput("NeoW");
		jSaver.writeToFile(requestString);
	}
	
	
	
	public void parse() throws JSONException {
		
		jReader.readFromFile("NeoW");
		String rawString = jReader.getReaderString();
		jParser.parseFromString(rawString);
		JSONObject parsedData = jParser.getParsedData();
		
		JSONArray neoArray = parsedData.getJSONArray("near_earth_objects");
		
		for (int i = 0; i < neoArray.length(); i++ ) {
			jsonObjects_AL.add((JSONObject) neoArray.get(i));
//			System.out.println("The key is: " + neoArray.get(i) + " an the index is: " + i);
		}
		
		for (int i = 0; i < jsonObjects_AL.size(); i++) {
			
			
			System.out.println("");
		}
		
		keyValue(jsonObjects_AL.size(), neoArray);
		
	}
	
	void keyValue ( int size , JSONArray aJsonObject) throws JSONException {
		int keys = size;
		int values = size;
		JSONObject jsonObject = null;
		for (int i = 0; i < size; i ++ ) {
			
			 jsonObject = (JSONObject) aJsonObject.get(i);
			
		}
		System.out.println(jsonObject);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
//	public void parse() throws JSONException {
//
//		jReader.readFromFile("NeoW");
//		String rawString = jReader.getReaderString();
//		jParser.parseFromString(rawString);
//		jParser.getParsedData();
//		JSONObject links;
//
////	  System.out.println(rawString);
//		jObject = jParser.getParsedData();
//		links = (JSONObject) jObject.get("links");
//
////	  JSONObject near_earth_objects = (JSONObject) links.get("near_earth_objects");
//		JSONArray near_earth_objects = (JSONArray) jObject.get("near_earth_objects");
//		JSONObject neoOJsonObject;
////	  JSONObject feet = (JSONObject) jObject.get("feet");
////	  System.out.println(feet);
//
//		JSONObject estimated_diameter = (JSONObject) near_earth_objects.get(0);
////	  System.out.println(near_earth_objects.get(0));
//		JSONObject aLinksJsonObject = (JSONObject) estimated_diameter.get("estimated_diameter");
////	  System.out.println(aLinksJsonObject);
//
//		JSONObject kilometers = (JSONObject) aLinksJsonObject.get("kilometers");
////	  System.out.println(kilometers);
//
//		//double estimated_diameter_max = kilometers.getDouble("estimated_diameter_max");
////	  System.out.println(estimated_diameter_max);
//
//		//System.out.println(findKey("links", jParser.getParsedData(),0));
//		//System.out.println(findKey("page", jParser.getParsedData(),0));
//		//System.out.println(findKey("near_earth_objects", jParser.getParsedData(),0));
//		
//		 System.out.println(findKey("next", jParser.getParsedData(),0));
//		/*
//		 * The kilometers is not working, something's off with getting the JSONArray
//		 * value
//		 */
////	  JSONObject kilometers = (JSONObject) estimated_diameter.get("kilometers");
//
////	  System.out.println(estimated_diameter.toString());
//		
//	}
//
//
//
//	
//	
//	@SuppressWarnings({ "static-access", "finally" })
//	public Object findKey(String aKey, JSONObject aRoot, int level) {
//
//		System.out.println("Entering FindKey " + aKey + " in " + aRoot);
//
//		Object aResult = null;
//		Object tempJsonObject = null;
//		Object tempArray = null;
//		try {
//			System.out.println("Entering try catch");
//            System.out.println(level);
//			tempJsonObject =  aRoot.get(aKey);
//			if (tempJsonObject instanceof JSONArray) {
//				
//			}
//			System.out.println(tempJsonObject);
//			aResult = tempJsonObject;
//			return aResult;
//			
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Entering Exception");
//			//System.out.println(e);
//			if (aRoot.length() > 0) {
//
//			System.out.println("\tRoot more than 0");
//				
//			
////				System.out.println(tempJsonArray.getString(0));
//				for (int i = 0; i < aRoot.names().length(); i++) {
//					System.out.println("Beginning Loop");
////					System.out.println(i);
////					System.out.println(tempJsonArray.getString(i));
//					aRoot.getNames(aRoot);
//					aResult = findKey(aKey,null, level+level);
//					System.out.println(aResult);
////					if (aResult != null) {
//////						System.out.println("broke");
////						
////						break;
////					}
//				}
//				System.out.println("Loop Done");
//			}
//
//			e.printStackTrace();
//		} finally {
//
//			return aResult;
//		}

//		if(aRoot.keys().hasNext() == true ) {
//			
//			System.out.println(aRoot.keys().next());
//			System.out.println(aRoot.keys().next());
//			System.out.println(aRoot.length());
//			System.out.println(aRoot.names());
//			
//			System.out.println("True");
//		}
//		else {
//			
//			System.out.println("False");
//			return null;
//		}

//		JSONObject tempJsonObject = null;
//		try {
//			tempJsonObject = (JSONObject) aRoot.get(aKey);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			
//			
//			
//		}

//		return null;

//	}

















//ArrayList<JSONObject> jsonObjects = new ArrayList<JSONObject>();
//public void function() throws JSONException {
//JSONObject jsonObject= new JSONObject(jParser.getParsedData());
//@SuppressWarnings("unchecked")
//Iterator<String> keys = jsonObject.keys();
//
//while(keys.hasNext()) {
//    String key = keys.next();
//    if (jsonObject.get(key) instanceof JSONObject) {
//            jsonObjects.add((JSONObject) jsonObject.get(key));
//    }
//}
//System.out.println(jsonObjects.size());
//}
