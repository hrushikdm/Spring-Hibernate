package com.springcore_using_constructor_injection;

import java.util.*;

public class Person {
	private String name1;
	private int personId;
	private List <String> list;
	
	public Person(String name1, int personId ,List<String> list)
	{
		this.name1=name1;
		this.personId=personId;
		this.list=list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name1 +": "+this.personId + ":"+this.list;
	}
	

}
