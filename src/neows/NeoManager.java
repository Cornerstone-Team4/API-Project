package neows;

import java.util.ArrayList;
import java.util.Random;

public class NeoManager {
	
	private ArrayList<Neo> neoList = new ArrayList<Neo>();
	private int arraySize = 10;
	

	public ArrayList<Neo> getArrayList(){
		return neoList;
	}
	
	public void initialize(int size) {
		this.arraySize = size;
		initialize();
	}
	
	public void initialize() {
		for (int i = 0; i < arraySize; i++) {
			neoList.add(new Neo());
			Neo neo = neoList.get(neoList.size()-1);
			//parse shit ================================================
			neo.setID(i);
			if (i%2==0) {
				neo.setHazardous(true);
			}else {
				neo.setHazardous(false);
			}
			Random r = new Random();
			neo.setMnDiameter(r.nextInt(5-1)+1);
			neo.setMxDiameter(neo.getMnDiameter()+r.nextInt(5-1)+1);
			neo.setMissDistance(r.nextInt(50-30)+30);
			//parse shit end ============================================
		}
	}
	
	public void sortByID() {
		
	}
	
	
	
}
 