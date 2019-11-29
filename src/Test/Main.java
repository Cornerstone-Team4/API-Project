
package Test;

import org.json.JSONException;
import apod.ApodManager;

<<<<<<< HEAD
public class Main {

	
	static ApodManager apodManager = new ApodManager();
	
	public static void main(String[] args) throws JSONException  {
		apodManager.apodRequest();		
		
=======
import neows.Neo_Parser;

@SuppressWarnings("unused")
public class Main {

	
	static Neo_Parser neo_Manager = new Neo_Parser();
	
	public static void main (String[] args) throws JSONException {
		
	neo_Manager.request();
	neo_Manager.parse();	
		neo_Manager.function();
>>>>>>> e1f3f27c9053d525f1d4c7273b7cd0b23e72f9c8
	}	
}
