import java.io.File;

import org.json.JSONObject;

public class jsonFile{
	
	
	public static void main(String[] args) {
		File aFile = new File("C:\\Users\\ruach\\Desktop\\Programming\\API-Project\\jsonFile.json");
		try {
			JSONObject jsonObject = new JSONObject(aFile);
			System.out.println(jsonObject.get("date"));
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		
		
	}
}