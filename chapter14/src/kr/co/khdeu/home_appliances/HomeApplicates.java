package kr.co.khdeu.home_appliances;

import java.util.Objects;

public class HomeApplicates implements Comparable<HomeApplicates>{
	private String name;
	private int price;
	
	public HomeApplicates() {
		this(null,0);
	}
	public HomeApplicates(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HomeApplicates [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof HomeApplicates))
		return false;
		
		HomeApplicates ha = (HomeApplicates)obj;
		return name.equals(ha.name);
	}
	@Override
	public int compareTo(HomeApplicates o) {
		return name.compareTo(o.name);
	}
	
	
	
}
