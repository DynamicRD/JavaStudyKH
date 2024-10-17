package kr.co.khedu_base;

public class Derived extends Base {
	private int dNo;

	public Derived() {
		super();
		System.out.println("자식 생성");
	}

	public Derived(int base,int dNo) {
		super(base);
		this.dNo = dNo;
	}

	public int getdNo() {
		return dNo;
	}

	public void setdNo(int dNo) {
		this.dNo = dNo;
	}

	@Override
	public String toString() {
		return "Derived [dNo=" + dNo + "]";
	}
	
	@Override
	public void print()
	{
		System.out.println("자식 프린트");
	}
	
}
