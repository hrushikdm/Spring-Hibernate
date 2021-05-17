package com.springcore_bean_lifecycle;

public class Samosa {
	private  double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void hey(){
		
		System.out.println("Inside init method: hey how are you?");
	}
	public void bye()
	{
		System.out.println("Inside destroy method: bye bye i an going to die");
	}
	
  
}
