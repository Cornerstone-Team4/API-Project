package com.requester.app;

import java.io.*;
import java.net.*;

public class JsonRequester {

	private URL url;
	private HttpURLConnection connection;
	private StringBuilder urlResponseBuilder;
	private String outputRequestString;
	
	public void makeRequest(String inputURL) {
		urlResponseBuilder = new StringBuilder();
		try {
			url = new URL(inputURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.getContent();

			InputStream in = new BufferedInputStream(connection.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = reader.readLine()) != null) {
				urlResponseBuilder.append(line);
			}
			outputRequestString = urlResponseBuilder.toString();
			System.out.println(outputRequestString);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}

	public String getOutputRequestString() {
		return outputRequestString;
	}
}
