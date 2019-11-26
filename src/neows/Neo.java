package neows;

public class Neo {
	
	private String startDate; 
	private String endDate;
	private boolean hazardous; 
	private int mnDiameter; //meters
	private int mxDiameter; //meters
	private int aproxVolume; //meters^3
	private int estimatedMass; //kilos
	
	
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
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public boolean getHazardous() {
		return hazardous;
	}
	public int getAproxVolume() {
		aproxVolume = (int) ((4/3)*Math.PI*mnDiameter*mnDiameter*mxDiameter);
		return aproxVolume;
	}
	public int getEstimatedMass() {
		estimatedMass = (int) ((4/3)*Math.PI*mnDiameter*mnDiameter*mxDiameter)*1000;
		return estimatedMass;
	}
	
	
	
}
