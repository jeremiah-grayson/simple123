package org.cap.demo;

public class Calculations 
{
	int a=11;
	int b=12;
	int c=a+b;
	int d=a-b;
	public void add()
	{
		System.out.println(c);
	}
	public void sub()
	{
		System.out.println(d);
	}
	public static void main(String args[])
	{
		Calculations cl=new Calculations();
		cl.add();
		//new branch is created.
		Calculations cc=new Calculations();
		cc.sub();
		//sub is added.
	}
}
