package Test;

import org.json.JSONException;
import apod.ApodManager;

public class Main {

	
	static ApodManager apodManager = new ApodManager();
	
	public static void main(String[] args) throws JSONException  {
		apodManager.apodRequest();		
		
	}	
}
