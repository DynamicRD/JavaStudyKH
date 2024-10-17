package homeWork_24_09_19;

public class SumDoubleInt {
	int numInt1,numInt2;
	double numDouble1,numDouble2;
	public SumDoubleInt() {
	}
	public SumDoubleInt(int numInt1, int numInt2, double numDouble1, double numDouble2) {
		this.numInt1 = numInt1;
		this.numInt2 = numInt2;
		this.numDouble1 = numDouble1;
		this.numDouble2 = numDouble2;
	}
	public int getNumInt1() {
		return numInt1;
	}
	public void setNumInt1(int numInt1) {
		this.numInt1 = numInt1;
	}
	public int getNumInt2() {
		return numInt2;
	}
	public void setNumInt2(int numInt2) {
		this.numInt2 = numInt2;
	}
	public double getNumDouble1() {
		return numDouble1;
	}
	public void setNumDouble1(double numDouble1) {
		this.numDouble1 = numDouble1;
	}
	public double getNumDouble2() {
		return numDouble2;
	}
	public void setNumDouble2(double numDouble2) {
		this.numDouble2 = numDouble2;
	}
	@Override
	public String toString() {
		return "SumDoubleInt [numInt1=" + numInt1 + ", numInt2=" + numInt2 + ", numDouble1=" + numDouble1
				+ ", numDouble2=" + numDouble2 + "]";
	}
	
	public int sum(int numInt1,int numInt2)
	{
		return numInt1+numInt2;
	}
	public double sum(double numDouble1,double numDouble2)
	{
		return numDouble1+numDouble2;
	}

	
}
