package kr.co.khedu;

public class Sphere {
	//변수(9가지)
	private int radius;
	private String color;
	public static final double PI = 3.141592;//메소드 영역
	
	//생성자함수-멤버변수에 디폴트값말고 초기값을 대입하고싶을때
	public Sphere(int radius,String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public Sphere(int radius)
	{
		this.radius = radius;
		this.color = "흰색";
	}
	
	public Sphere()
	{
	}
	//함수(멤버변수 값을 주고 값을 요청하는 기능)
	
	//함수(일,동작,기능)
	// (보고서 변수9가지) 동작이름(입력값변수 9가지){일의 내용;}

	public double SphereVolume()
	{
		//구의 부피 계산식
		//r*r*r*4/3
		double volume = 4.0/3.0*Sphere.PI*Math.pow(radius, 3.0);
		//결과값 리턴
		return volume;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String color() {
		String color = this.color();
		return color; 
	}
}
