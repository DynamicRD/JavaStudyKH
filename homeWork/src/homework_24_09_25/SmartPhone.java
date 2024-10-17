package homework_24_09_25;

public class SmartPhone extends Phone {
	private String operatingSystemType;
	private double operatingSystemVersion;
	private int internalMemorySize;
	private boolean isCameraInstallation;
	private boolean isBluetoothSupport;
	
	
	
	public SmartPhone(String makingCompany, int price, String type, String operatingSystemType,
			double operatingSystemVersion, int internalMemorySize, boolean isCameraInstallation,
			boolean isBluetoothSupport) {
		super(makingCompany, price, type);
		this.operatingSystemType = operatingSystemType;
		this.operatingSystemVersion = operatingSystemVersion;
		this.internalMemorySize = internalMemorySize;
		this.isCameraInstallation = isCameraInstallation;
		this.isBluetoothSupport = isBluetoothSupport;
	}
	public String getOperatingSystemType() {
		return operatingSystemType;
	}
	public void setOperatingSystemType(String operatingSystemType) {
		this.operatingSystemType = operatingSystemType;
	}
	public double getOperatingSystemVersion() {
		return operatingSystemVersion;
	}
	public void setOperatingSystemVersion(double operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	public int getInternalMemorySize() {
		return internalMemorySize;
	}
	public void setInternalMemorySize(int internalMemorySize) {
		this.internalMemorySize = internalMemorySize;
	}
	public boolean isCameraInstallation() {
		return isCameraInstallation;
	}
	public void setCameraInstallation(boolean isCameraInstallation) {
		this.isCameraInstallation = isCameraInstallation;
	}
	public boolean isBluetoothSupport() {
		return isBluetoothSupport;
	}
	public void setBluetoothSupport(boolean isBluetoothSupport) {
		this.isBluetoothSupport = isBluetoothSupport;
	}
	
	@Override
	public String toString() {
		return "SmartPhone [operatingSystemType=" + operatingSystemType + ", operatingSystemVersion="
				+ operatingSystemVersion + ", internalMemorySize=" + internalMemorySize + ", isCameraInstallation="
				+ isCameraInstallation + ", isBluetoothSupport=" + isBluetoothSupport + ", getMakingCompany()="
				+ getMakingCompany() + ", getPrice()=" + getPrice() + ", getType()=" + getType() + "]";
	}
	
}
