package swing;

import javax.swing.JPanel;

public class NeoWSOb {
	static NeoWsJ myob = new NeoWsJ();
	static String hazard = myob.getHazardous();
	static String mxDiameter = myob.getMxDiameter();
	static String mnDiameter = myob.getMnDiameter();
	static String start = myob.getStartDate();
	static String end = myob.getEndDate();
	static double intMxDimter = Double.parseDouble(mxDiameter);

	String NeoWsOb() {
		// TODO Auto-generated method stub
		String ob;
		if (intMxDimter <= 0.01) {
			ob = "images/volkswagen-158463_640.png";
			
		}else if(intMxDimter > 0.01){
			ob = "images/airplane-161163_640.png";
		}else {
			ob = "images/marvel.png";
		}
		return ob;
		
	}
	
	public static void main(String[] arg) {
		System.out.println(intMxDimter);
		
	}
}
