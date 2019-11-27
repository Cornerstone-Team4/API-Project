package neows;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


import requester.*;
import saver.JsonParser;
import saver.JsonReader;

@SuppressWarnings("unused")
public class Neo_Manager {
	
	JSONObject jObject = new JSONObject();
	Neo_Manager neo_Manager; 
	JsonReader jReader = new JsonReader();
	JsonRequester jRequester = new JsonRequester();
	JsonSaver jSaver = new JsonSaver();
	JsonParser jParser = new JsonParser();
	String requestString;
	
	
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
	  jParser.getParsedData();
	  JSONObject links;
	  
	  System.out.println(rawString);
	  jObject = jParser.getParsedData();
	  links = (JSONObject) jObject.get("links");
	  
//	  JSONObject near_earth_objects = (JSONObject) links.get("near_earth_objects");
	  JSONArray near_earth_objects = (JSONArray) jObject.get("near_earth_objects");
	  JSONObject neoOJsonObject;
	  JSONObject feet = (JSONObject) jObject.get("feet");
	  System.out.println(feet);
	 
	  JSONObject estimated_diameter = (JSONObject) near_earth_objects.get(0);
	  /*
	   * The kilometers is not working, something's off with getting the JSONArray value 
	   */
	  JSONObject kilometers = (JSONObject) estimated_diameter.get("kilometers");
	  
	  System.out.println(estimated_diameter.toString());
				
	
		
	}
	
	
}
