package kr.co.khedu.flyable;

public interface Flyable {
	//공동 멤버변수, 공동 멤버상수
	public static final int flyNumber=0;
	public static final double PI=3.141592;
	
	public abstract void fly();
	
	//공동 멤버 함수
	public static void printFlyable()
	{
		System.out.println("flyNumber = "+flyNumber+", PI ="+PI);
	}
}
