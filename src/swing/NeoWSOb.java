package swing;

import javax.swing.JPanel;

public class NeoWSOb {
	static CallJasonNeoWsJ myob = new CallJasonNeoWsJ();
	static String hazard = myob.getHazardous();
	static String mxDiameter = myob.getMxDiameter();
	static String mnDiameter = myob.getMnDiameter();
	static String start = myob.getStartDate();
	static String end = myob.getEndDate();
	static double intMxDimter = Double.parseDouble(mxDiameter);
	
	int eDiameter = 12742; //km
	int catLength = 25; //cm 
	
	//Earth : NEO = 1,274,200:1
	//


	String NeoWsOb() {
		// TODO Auto-generated method stub
		String ob = null;
		if (intMxDimter <= 0.01) {
			ob = "images/images/squirrel.jpg";
			
			
		}else if(intMxDimter > 0.01){
			ob = "images/golf.jpg";
			
		}
		return ob; 	
	}
	String NeoWsObSize() {
		// TODO Auto-generated method stub
		String obSize = null; 
		if (intMxDimter <= 0.01) {	
			obSize = "0.01";
			
		}else if(intMxDimter > 0.01){
			obSize = "0.10";
			
		}
		
		return obSize;
		
	}
	
	//public static void main(String[] arg) {
//		int size = 
//		System.out.println(intMxDimter);
		
	//}
}
