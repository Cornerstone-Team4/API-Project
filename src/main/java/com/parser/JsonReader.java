package com.parser;

import java.io.*;

public class JsonReader {

	private FileReader aReader;
	private String filePath;
	private String fileName;
	private String fileExtension;
	private String readerString;

	public void readFromFile(String fileName) {
		this.filePath = "./db/";
		this.fileName = fileName;
		this.fileExtension = ".json";
		readFromFile();
	}
	
	public void readFromFile(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
		this.fileExtension = ".json";
		readFromFile();
	}
	
	public void readFromFile(String filePath, String fileName, String fileExtension) {
		this.filePath = filePath;
		this.fileName = fileName;
		this.fileExtension = fileExtension;
		readFromFile();
	}
	
	public void readFromFile() {
		try {
			aReader = new FileReader(filePath+fileName+fileExtension);
			System.out.println(aReader);
			String auxString = "";
			int auxChar = 0;
			while((auxChar = aReader.read()) > 0) {
			auxString += (char)auxChar;
			}
			readerString = auxString;
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getReaderString() {
		return readerString;
	}
	
}
