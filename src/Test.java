
import org.json.JSONException;
import org.json.JSONObject;



class ISSParser
	{
	 JsonReader jReader = new JsonReader();
	 String sourceFile;
	 public JSONObject data;
	 public ISSParser(String aFile) {
		 jReader.readFromFile(aFile, "jsonFile"); 
		 try {
			data = new JSONObject(jReader.getReaderString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 

	}

@SuppressWarnings("unused")
public class Test {
	

	static JsonReader jReader = new JsonReader();

	public static void main(String[] args) throws JSONException  {
			
		ISSParser myThing = new ISSParser("C:\\Users\\ruach\\Desktop\\TestFiles\\");
		
		if (myThing.data.getString("message").equals("success")) {
			int timeStamp;
			timeStamp = myThing.data.getInt("timestamp");
			System.out.println("timestamp: " + timeStamp);
			JSONObject position = (JSONObject) myThing.data.get("iss_position");
			String latitude = position.getString("latitude");
			String longitude = position.getString("longitude");
			
			System.out.println("The ISS latitude is: " + latitude + ", and the longtitude is: " + longitude);
		}
		
		
		
		
		
		
		
		

		}
}
