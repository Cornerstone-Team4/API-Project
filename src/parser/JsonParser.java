package parser;

import java.io.*;

public class JsonParser {

	private String inputString;
	private String imgString;
	private String nameString;
	
	public void parseFromString(String input) {
		inputString = input;
		imgString = "img test";
		nameString = "name test";
	}

	public String getImgString() {
		return imgString;
	}

	public String getNameString() {
		return nameString;
	}
	
}
