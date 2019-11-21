package com.daniel.app;

import com.requester.app.*;;

public class CLIinterface {
	
	String receivedJson;
	JsonSaver jsonSaver = new JsonSaver();
	JsonRequester jsonRequester = new JsonRequester();
	
	
	public static void main(String[] args) {
		CLIinterface cli = new CLIinterface();
		cli.download("http://api.open-notify.org/iss-now.json", "issJson");
		cli.download("https://api.nasa.gov/insight_weather/?api_key=DEMO_KEY&feedtype=json&ver=1.0", "insightJson");
		
	}
	
	public void download(String url, String file) {
		jsonRequester.makeRequest(url);
		receivedJson = jsonRequester.getOutputRequestString();
		jsonSaver = new JsonSaver();
		jsonSaver.createOutput(file);
		jsonSaver.writeToFile(receivedJson);
	}
}
