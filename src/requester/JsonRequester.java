package requester;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.ImageIO;

public class JsonRequester {

	private URL url;
	private HttpURLConnection connection;
	private StringBuilder urlResponseBuilder;
	private String outputRequestString;
	private BufferedImage outputRequestImage;

	public void makeImageRequest(String inputURL) {
		urlResponseBuilder = new StringBuilder();
		try {
			URL url = new URL(inputURL);
		    outputRequestImage = ImageIO.read(url);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

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

	public BufferedImage getOutputRequestImage() {
		return outputRequestImage;
	}

}



