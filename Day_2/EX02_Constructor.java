/*

2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments

 */

package Day_2;

public class EX02_Constructor
{
	EX02_Constructor()
	{
		System.out.println("Constructor");
	}
	EX02_Constructor(int a)
	{
		System.out.println("Constructor with 1 argument a: "+a);
	}
	EX02_Constructor(int x, int y)
	{
		System.out.println("Constructor with 2 argument x: "+x+" and y: " +y);
	}
	
	public static void main(String args[])
	{
		EX02_Constructor m1= new EX02_Constructor();
		EX02_Constructor m2= new EX02_Constructor(78);
		EX02_Constructor m3= new EX02_Constructor(12,30);
	}
}

