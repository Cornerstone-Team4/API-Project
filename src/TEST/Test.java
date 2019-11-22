package TEST;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONObject;



public class Test {

	
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			File aFile = new File("C:\\Users\\ruach\\Desktop\\TestFiles\\jsonFile.json");
			
			File newFile = new File("C:\\Users\\ruach\\Desktop\\TestFiles\\newFile.txt");
			
			FileReader aReader = new FileReader(aFile);	
			
			FileWriter aWriter = new FileWriter(newFile);
			
			JSONObject jObject = new JSONObject(aFile);
			
			
			
			
			
			
			if (aReader != null) {
				
				if (aWriter != null) {
					
					byte char_Checker;
					String temp = "";
					
					while ((char_Checker = (byte) aReader.read()) != -1) {
						char checkerToChar =(char) char_Checker;
						temp = temp + checkerToChar;
						
						
						if (checkerToChar == '\n') {
							System.out.println(temp);
							aWriter.write(temp);
							temp = "";
						}
						
						
					}aWriter.close();
					aReader.close();
					
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		
	}
}
