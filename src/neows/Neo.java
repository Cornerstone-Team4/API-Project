package neows;

public class Neo {
	
	private int ID;
	private String startDate; 
	private String endDate;
	private boolean hazardous; 
	private int mnDiameter; //kilometer
	private int mxDiameter; //kilometer
	private int missDistance; //kilometers
	private int aproxVolume; //kilometers^3
	private int estimatedMass; //tons
	
	//Getters and Setters
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean getHazardous() {
		return hazardous;
	}
	public void setHazardous(boolean hazardous) {
		this.hazardous = hazardous;
	}
	public int getMnDiameter() {
		return mnDiameter;
	}
	public void setMnDiameter(int mnDiameter) {
		this.mnDiameter = mnDiameter;
	}
	public int getMxDiameter() {
		return mxDiameter;
	}
	public void setMxDiameter(int mxDiameter) {
		this.mxDiameter = mxDiameter;
	}
	public int getMissDistance() {
		return missDistance;
	}
	public void setMissDistance(int missDistance) {
		this.missDistance = missDistance;
	}
	public int getEstimatedMass() {
		estimatedMass = (int) (2*Math.pow(10, 9));
		estimatedMass = estimatedMass * getAproxVolume();
		return estimatedMass;
	}
	public int getAproxVolume() {
		aproxVolume = (int) ((4/3)*Math.PI*mnDiameter*mnDiameter*mxDiameter);
		return aproxVolume;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getID() {
		return ID;
	}
	
	
	
	
	
}
