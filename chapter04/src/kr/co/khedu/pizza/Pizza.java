package kr.co.khedu.pizza;

public class Pizza {
	private int size;
	private String name;
	private int price;
	
	
	public Pizza() {}
	public Pizza(int size,String name,int price)
	{
		this.size = size;
		this.name = name;
		this.price = price;
	}
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
	
	public boolean getDelivery(String address)
	{
		if(address.equals("") || address == null) {
			return false;
		}
		return true;
	
	}
	
	public boolean DiscountRate() 
	{
		boolean flag = true;
		if(price >= 20000 && price <30000) 
		{
			price = (int)(price*0.8);
		} else if(price >= 30000 && price <40000) 
		{
			price = (int)(price*0.7);
		} else if(price >= 40000) 
		{
			price = (int)(price*0.6);	
		} else
		{
			flag = false;
		}
		
		return flag;	
		
	}
	
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
