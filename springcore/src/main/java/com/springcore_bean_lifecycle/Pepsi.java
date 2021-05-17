package com.springcore_bean_lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

	private  double price;
	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		//same as init method
		System.out.println("Taking pepsi : init()");
	}

	public void destroy() throws Exception {
		//same as destroy
		System.out.println("Going to put bottle back to shop after : Destroy()");
		
	}
	
}
