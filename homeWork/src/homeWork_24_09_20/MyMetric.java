package homeWork_24_09_20;

public class MyMetric {
	private double mile;
	private double km;
	public MyMetric(double mile, double km) {
		this.mile = mile;
		this.km = km;
	}
	public double getMile() {
		return mile;
	}
	public void setMile(double mile) {
		this.mile = mile;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "MyMetric [mile=" + mile + ", km=" + km + "]";
	}
	
	public void kiloToMile()
	{
		mile = km/1.60934;
	}
	
	public void mileTokilo()
	{
		km = mile * 1.60934;
	}
	
}
	
