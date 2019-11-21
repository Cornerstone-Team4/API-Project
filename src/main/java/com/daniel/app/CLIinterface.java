package com.daniel.app;

import com.requester.app.*;;

public class CLIinterface {
	
	static String receivedJson;
	
	public static void main(String[] args) {
		JsonRequester jsonRequester = new JsonRequester();
		jsonRequester.makeRequest("http://api.open-notify.org/iss-now.json");
		receivedJson = jsonRequester.getOutputRequestString();
		JsonSaver jsonSaver = new JsonSaver();
		jsonSaver.createOutput();
		jsonSaver.writeToFile(receivedJson);
	}
}
