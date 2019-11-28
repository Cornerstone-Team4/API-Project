package apod;

import java.awt.image.BufferedImage;

import org.json.JSONException;
import org.json.JSONObject;

import requester.JsonRequester;
import requester.JsonSaver;
import saver.JsonParser;
import saver.JsonReader;

public class ApodManager {
	//Get APOD response		
	private JsonReader jReader = new JsonReader();
	private JsonRequester jRequester = new JsonRequester();
	private JsonSaver jSaver = new JsonSaver();
	private JsonParser jParser = new JsonParser();
	private JSONObject jsonData;
	private String requestString;
	private BufferedImage requestImage;
	private String date;
	private String hdurl;
	private String title;
	private String copyright;
	
	public void apodRequest() throws JSONException {
			jRequester.makeRequest("https://api.nasa.gov/planetary/apod?api_key=Hvhsssfu66mY3kGSEQbbxYsRJ5TZerntwuWlGKph");
			requestString = jRequester.getOutputRequestString();
			jSaver.createOutput("apod");
			jSaver.writeToFile(requestString);
			jParser.parseFromString(requestString);
			jsonData = jParser.getParsedData();
			System.out.println("Json downloaded sucessfuly");
			
			//Get hdurl and date
			date = jsonData.getString("date");
			hdurl = jsonData.getString("hdurl");
			title = jsonData.getString("title");
			copyright = jsonData.getString("copyright");
			System.out.println("Json parsed sucessfuly");

			//Get image
			System.out.println("Started image download");
			jRequester.makeImageRequest(hdurl);
			requestImage = jRequester.getOutputRequestImage();
			jSaver.createOutput("./db/img/",title,".jpg");
			jSaver.writeToImage(requestImage);
			
			System.out.println("Image downloaded sucessfuly");
	}
	
	public BufferedImage getRequestImage() {
		return requestImage;
	}

	public String getApodDate() {
		return date;
	}

	public String getApodHdurl() {
		return hdurl;
	}

	public String getApodTitle() {
		return title;
	}

	public String getApodCopyright() {
		return copyright;
	}


}
