package Test;
import requester.*;


import saver.*;

import java.awt.image.BufferedImage;
import org.json.JSONException;
import org.json.JSONObject;

import neows.Neo_Manager;

@SuppressWarnings("unused")
public class Main {

	
	static Neo_Manager neo_Manager = new Neo_Manager();
	
	public static void main (String[] args) throws JSONException {
		
	neo_Manager.request();
	neo_Manager.parse();	
		
	}	
}
