package homework_id_Map;

public class Youtube extends IDClass {
	private String video;
	//--------------------
	public Youtube(String iD, int password, String siteName, String video) {
		super(iD, password, siteName);
		this.video = video;
	}
	//---------------------
	public String getVideo() {
		return video;
	}
	public void setCafe(String video) {
		this.video = video;
	}
	//----------------------
	@Override
	public String toString() {
		return "ID=" + getID() + ", Password=" + getPassword()
				+ ", SiteName=" + getSiteName() + " videoName="+video;
	}
	
}
