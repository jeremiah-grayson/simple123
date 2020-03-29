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
	public void sub()
	{
		System.out.println("sub");
		//sub
	}
	public static void main(String args[])
	{
		Calculations cl=new Calculations();
		cl.add();
		//new branch is created.
		System.out.println("WELCOME");
	}
}
