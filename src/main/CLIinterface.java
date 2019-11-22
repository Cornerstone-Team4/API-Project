package main;

import parser.JsonParser;
import parser.JsonReader;
import requester.JsonRequester;
import requester.JsonSaver;

public class CLIinterface {
	
	String receivedJson;
	JsonSaver jsonSaver = new JsonSaver();
	JsonRequester jsonRequester = new JsonRequester();
	JsonReader jsonReader = new JsonReader();
	JsonParser jsonParser = new JsonParser();
	
	public static void main(String[] args) {
		CLIinterface cli = new CLIinterface();
		cli.downloadJson("http://api.open-notify.org/iss-now.json", "issJson");
		cli.downloadJson("https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0", "insightJson");
		cli.parseJson("issJson");
	}
	
	public void downloadJson(String url, String file) {
		jsonRequester.makeRequest(url);
		receivedJson = jsonRequester.getOutputRequestString();
		jsonSaver.createOutput(file);
		jsonSaver.writeToFile(receivedJson);
	}
	public void parseJson(String file) {
		jsonReader.readFromFile(file);
		receivedJson = jsonReader.getReaderString();
		System.out.println(receivedJson);
		jsonParser.parseFromString(receivedJson);
		jsonParser.getImgString();
		jsonParser.getNameString();
	}
}