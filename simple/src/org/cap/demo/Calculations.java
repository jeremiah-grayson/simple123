package org.cap.demo;

public class Calculations 
{
	int a=11;
	int b=12;
	int c=a+b;
	public void add()
	{
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Calculations cl=new Calculations();
		cl.add();
	}
}
