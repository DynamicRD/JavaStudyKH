package homework_id_Set;

import java.util.Objects;

public class IDClass implements Comparable<IDClass> {
	private String ID;
	private int password;
	private String siteName;
	//--------------------
	public IDClass(String ID, int password, String siteName) {
		this.ID = ID;
		this.password = password;
		this.siteName = siteName;
	}
	//--------------------
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	//---------------------
	@Override
	public String toString() {
		return "ID=" + ID + ", password=" + password + ", siteName=" + siteName;
	}
	//-----------------------
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof IDClass))
		{
			return false;
		}
		IDClass id = (IDClass)obj;
		return ID.equals(id.ID);
	}
	@Override
	public int compareTo(IDClass o) {
		return ID.compareTo(o.ID);
	}
	
}
