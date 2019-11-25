package com.ISS.Test;

import com.ISS.requester.JsonRequester;

import com.ISS.requester.JsonSaver;
import com.ISS.API.JsonReader;

public class CLIinterface {
	
	String receivedJson;
	JsonSaver jsonSaver = new JsonSaver();
	JsonRequester jsonRequester = new JsonRequester();
	JsonReader jsonReader = new JsonReader();
	
	public static void main(String[] args) {
		CLIinterface cli = new CLIinterface();
		cli.downloadJson("http://api.open-notify.org/iss-now.json", "issJson");
		cli.downloadJson("https://api.nasa.gov/planetary/apod?api_key=XHt1KQMu5Ebrnkibv2retQ43ki05GESJdhToXsZh", "insightJson");
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
