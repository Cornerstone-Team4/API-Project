//package requester;
//
//import java.awt.image.BufferedImage;
//import java.io.*;
//
//import javax.imageio.ImageIO;
//
//public class JsonSaver {
//
//	String filePath;
//	String fileName;
//	String fileExtension;
//	File file;
//	FileWriter aWriter;
//	
//	public void createOutput(String filePath, String fileName, String fileExtension) {
//		this.filePath = filePath;
//		this.fileName = fileName;
//		this.fileExtension = fileExtension;
//		createOutput();
//	}
//	
//	public void createOutput(String filePath, String fileName) {
//		this.filePath = filePath;
//		this.fileName = fileName;
//		this.fileExtension = ".json";
//		createOutput();
//	}
//	
//	public void createOutput(String fileName) {
//		this.filePath = "./db/";
//		this.fileName = fileName;
//		this.fileExtension = ".json";
//		createOutput();
//	}
//	
//
//	private void createOutput() {
//
//		file = new File(filePath+fileName+fileExtension);
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void writeToFile(String inputString) {
//		try {
//			aWriter = new FileWriter(filePath+fileName+fileExtension);
//			aWriter.write(String.format(inputString));
//			aWriter.write(System.lineSeparator());
//			aWriter.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public void writeToImage(BufferedImage inputImage) {
//		try {
//			ImageIO.write(inputImage, "jpg", file);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//}
