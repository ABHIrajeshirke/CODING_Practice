package Day_2;

import java.util.Scanner;

class A
{
	private int num;
	private static int cnt=0;
	public static int getCnt() 
	{
		return cnt;
	}
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
}

class B
{
	private int num;
	private static int cnt=10;
	
	public static int getCnt() 
	{
		return cnt;
	}
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
}

class C
{
	private int num;
	private static int cnt=100;
	public static int getCnt() 
	{
		return cnt;
	}
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
}

public class EX05_Static_NonStatic_Member
{
	public static void main(String []args)
	{
		A a1=new A();
		B b1=new B();
		C c1=new C();
		
		a1.setNum(5);
		b1.setNum(25);
		c1.setNum(125);
		
		System.out.println(a1.getNum()+"\t"+A.getCnt());
		System.out.println(b1.getNum()+"\t"+B.getCnt());
		System.out.println(c1.getNum()+"\t"+C.getCnt());
	}
}