package com.daniel.app;

import com.parser.JsonReader;
import com.requester.app.*;;

public class CLIinterface {
	
	String receivedJson;
	JsonSaver jsonSaver = new JsonSaver();
	JsonRequester jsonRequester = new JsonRequester();
	JsonReader jsonReader = new JsonReader();
	
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
	}
}
