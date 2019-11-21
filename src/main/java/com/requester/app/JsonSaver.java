package com.requester.app;

import java.io.*;

public class JsonSaver {

	String filePath;
	String fileName;
	File file;
	FileWriter aWriter;
	
	public JsonSaver(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
	}
	
	public JsonSaver(String filePath) {
		this.filePath = filePath;
		this.fileName = "outputJson.json";
	}
	
	public JsonSaver() {
		this.filePath = "./db/";
		this.fileName = "outputJson.json";
	}
	
	public void createOutput() {
		file = new File(filePath+fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeToFile(String inputString) {
		try {
			aWriter = new FileWriter(filePath+fileName);
			for (char c : inputString.toCharArray()) {
				aWriter.write(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
