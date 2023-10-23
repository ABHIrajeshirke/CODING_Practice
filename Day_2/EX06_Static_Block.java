/*

6) define static initializers in the above A,B and C classes 
and check the order of their execution.
 
 */

package Day_2;

import java.util.Scanner;

class A1
{
	static
	{
		System.out.println("in A");
	}
	private int num;
	A1(int num)
	{
		System.out.println("in A constructo");
		this.num=num;
	}
	public int getNum() 
	{
		return num;
	}
}

class B1
{
	static
	{
		System.out.println("in B");
	}
	private int num;
	B1(int num)
	{
		System.out.println("in B constuctor");
		this.num=num;
	}
	public int getNum() 
	{
		return num;
	}
}

class C1
{
	static
	{
		System.out.println("in C");
	}
	private int num;
	C1(int num)
	{
		System.out.println("in C constuctor");
		this.num=num;
	}
	public int getNum() 
	{
		return num;
	}
}
public class EX06_Static_Block
{
	static
	{
		System.out.println("in Demo ");
	}
	public static void main(String []args)
	{
		A1 a1=new A1(10);
		B1 b1=new B1(20);
		C1 c1=new C1(30);
	}
}
