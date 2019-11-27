package neows;

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
	  String links = null;
	  
	  System.out.println(rawString);
	  jObject = jParser.getParsedData();
	  
		 links = (String) jObject.get("links");
		 System.out.println(links);
				
	
		
	}
	
	
}
