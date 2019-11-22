package swing;

public class NeoWsJ {
/////// from NeoWs
		private String startDate = ""; 
		//Starting date for asteroid search : I couldn't figure out what key is for it
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		
		private String endDate = "";
		//Ending date for asteroid search:  I couldn't figure out what key is for it
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		
		private String mnDiameter = "";
		//near_earth_objects / nearestimated_diameter/ kilometers/ estimated_diameter_min : 0.0366906138
		public void setMnDiameter(String mnDiameter) {
			this.mnDiameter = mnDiameter;
		}
		
		private String mxDiameter = "";
		//near_earth_objects / nearestimated_diameter/ kilometers/ estimated_diameter_max : 0.0366906138
		public void setMxDiameter(String mxDiameter) {
			this.mxDiameter = mxDiameter;
		}
		
		private String hazardous = "";
		//feet / is_potentially_hazardous_asteroid : false
		public void setHazardous(String hazardous) {
			this.hazardous = hazardous;
		}
		
}
