package Test;
import org.json.JSONException;

import neows.Neo_Parser;

@SuppressWarnings("unused")
public class Main {

	
	static Neo_Parser neo_Manager = new Neo_Parser();
	
	public static void main (String[] args) throws JSONException {
		
	neo_Manager.request();
	neo_Manager.parse();	
		
	}	
}
