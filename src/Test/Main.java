package Test;
import requester.*;

import saver.*;

import java.awt.image.BufferedImage;
import org.json.JSONException;
import org.json.JSONObject;


public class Main {

	
	static JsonReader jReader = new JsonReader();
	static JsonRequester jRequester = new JsonRequester();
	static JsonSaver jSaver = new JsonSaver();
	static JsonParser jParser = new JsonParser();
	static JSONObject jsonData;
	static String requestString;
	static BufferedImage requestImage;
	
	public static void main(String[] args) throws JSONException  {
		//Get APOD response			
		jRequester.makeRequest("https://api.nasa.gov/planetary/apod?api_key=Hvhsssfu66mY3kGSEQbbxYsRJ5TZerntwuWlGKph");
		requestString = jRequester.getOutputRequestString();
		jSaver.createOutput("apod");
		jSaver.writeToFile(requestString);
		jParser.parseFromString(requestString);
		jsonData = jParser.getParsedData();
		//Get hdurl and date
		String date;
		date = jsonData.getString("date");
		System.out.println("date: " + date);
		String hdurl;
		hdurl = jsonData.getString("hdurl");
		System.out.println("hdurl: "+hdurl);
		String title;
		title = jsonData.getString("title");
		System.out.println("title: "+title);
		String copyright;
		copyright = jsonData.getString("copyright");
		System.out.println("copyright: "+copyright);
		
		
		//Get image
		jRequester.makeImageRequest(hdurl);
		requestImage = jRequester.getOutputRequestImage();
		jSaver.createOutput("./db/img/",title,".jpg");
		jSaver.writeToImage(requestImage);
		
		jRequester.makeImageRequest("https://apod.nasa.gov/apod/image/1911/BeanConrad_Apollo12_950.jpg");
		requestImage = jRequester.getOutputRequestImage();
		jSaver.createOutput("./db/img/","Apollo 12: Self Portrait",".jpg");
		jSaver.writeToImage(requestImage);
		
		
	}	
}
