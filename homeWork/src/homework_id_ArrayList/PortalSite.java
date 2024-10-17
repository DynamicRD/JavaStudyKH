package homework_id_ArrayList;

public class PortalSite extends IDClass {
	private String blog;
	//--------------------
	public PortalSite(String iD, int password, String siteName, String blog) {
		super(iD, password, siteName);
		this.blog = blog;
	}
	//---------------------
	public String getblog() {
		return blog;
	}
	public void setblog(String blog) {
		this.blog = blog;
	}
	//----------------------
	@Override
	public String toString() {
		return "ID=" + getID() + ", Password=" + getPassword()
				+ ", SiteName=" + getSiteName() + " blogName="+blog;
	}
	
}
