package com.capgemini.Oops;

class Mobile
{
	private String name;
	private int cost;
	private String color;
	private int id;
	
	public Mobile(String a, int b, String c, int d)
	{
		this.name=a;
		this.cost=b;
		this.color=c;
		this.id=d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile s=new Mobile("Apple iphone", 40000, "White", 1);
		System.out.println(s.getName());
		System.out.println(s.getCost());
		System.out.println(s.getColor());
		System.out.println(s.getId());
	}

}
