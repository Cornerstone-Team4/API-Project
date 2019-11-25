package swing;

public class ApodJ {

///////from APOD or whatever pic API
		private String copyright = "";
		//copyright : "Vitalij Kopa"
		private String picDate;
		//date : "2019-11-22"
		private String pic = "images/sunrise-1756274_640.jpg";
		//url : "https://apod.nasa.gov/apod/image/1911/orion_kopa1024.jpg"		
		private String title;		
		//title : "Orion Rising"
		
		//==========================================================================
		//getters
		//==========================================================================
		public String getCopyright() {
			return copyright;
		}
		public String getPicDate() {
			return picDate;
		}
		public String getPic() {
			return pic;
		}		
		public String getTitle() {
			return title;
		}
		//==========================================================================
		//setters
		//==========================================================================
		public void setCopyright(String copyright) {
			this.copyright = copyright;
		}
		public void setPicDate(String picDate) {
			this.picDate = picDate;			
		}
		public void setPic(String pic) {
			this.pic = pic;			
		}
		public void setTitle(String title) {
			this.title = title;
		}
	



	

		
	


}
