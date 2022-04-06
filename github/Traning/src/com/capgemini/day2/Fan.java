package com.capgemini.day2;

public class Fan {

		// TODO Auto-generated method stub
		String name;
		int id;
		String colour;
		double size;
		
		Fan(String r, int s, String t, double u)
		{
			this.name=r;
			this.id=s;
			this.colour=t;
			this.size=u;
		}
		
		public static void main(String [] args)
		{
			Fan v= new Fan("Boosty", 10, "White", 1);
			System.out.println(v.name);
			System.out.println(v.id);
			System.out.println(v.colour);
			System.out.println(v.size);
			
		}
	

}
