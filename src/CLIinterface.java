import java.io.File;

import org.json.JSONException;
import org.json.JSONObject;

public class CLIinterface {
	public static void main(String[] args) throws JSONException {
			
		File aFile = new File("C:\\Users\\ruach\\Desktop\\Programming\\API-Project\\jsonFile.json");
				JSONObject jsonObject = new JSONObject(aFile);
				
				jsonObject.get("Date");
				
	}
}
