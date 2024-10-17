package homeWork_24_09_19;

public class SumOfInteger {
	int num1,num2,num3;

	public SumOfInteger() {
	}
	public SumOfInteger(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	@Override
	public String toString() {
		return "Sum [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	
	public int sum(int num1,int num2)
	{
		return num1 +num2;
	}
	public int sum(int num1,int num2,int num3)
	{
		return num1 +num2+num3;
	}
	
}
