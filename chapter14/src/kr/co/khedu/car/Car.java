package kr.co.khedu.car;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Comparable<Car>,Serializable{
	private int no;
	private String name;
	private String color;
	private int price;
	//=====================
	public Car(int no, String name, String color, int price) {
		super();
		this.no = no;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Car() {
		this(0,null,null,0);
	}
	//======================
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//=======================
	@Override
	public String toString() {
		return "Car [no=" + no + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	//=======================
	@Override
	public int hashCode() {
		return no;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
		Car car = (Car)obj;
		return no == car.no;
	}
	@Override
	public int compareTo(Car o) {
		return no - o.no;
	}
}
