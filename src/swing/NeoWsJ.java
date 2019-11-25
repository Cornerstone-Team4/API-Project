package swing;

public class NeoWsJ {
/////// from NeoWs
		private String startDate; 
		//Starting date for asteroid search : I couldn't figure out what key is for it
		
		private String endDate;
		//Ending date for asteroid search:  I couldn't figure out what key is for it
				
		private String mnDiameter;
		//near_earth_objects / nearestimated_diameter/ kilometers/ estimated_diameter_min : 0.0366906138
				
		private String mxDiameter;
		//near_earth_objects / nearestimated_diameter/ kilometers/ estimated_diameter_max : 0.0366906138
				
		private String hazardous;
		//feet / is_potentially_hazardous_asteroid : false
		
		//==========================================================================
		//getters
		//==========================================================================
		public String getStartDate() {
			return startDate;
		}		
		public String getEndDate() {
			return endDate;
		}
		public String getMnDiameter() {
			return mnDiameter;
		}
		public String getMxDiameter() {
			return mxDiameter;
		}
		public String getHazardous() {
			return hazardous;
		}
		
		//==========================================================================
		//setters
		//==========================================================================
		
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public void setMnDiameter(String mnDiameter) {
			this.mnDiameter = mnDiameter;
		}
		public void setMxDiameter(String mxDiameter) {
			this.mxDiameter = mxDiameter;
		}
		public void setHazardous(String hazardous) {
			this.hazardous = hazardous;
		}
		
}
