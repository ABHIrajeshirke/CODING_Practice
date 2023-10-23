/*
create a class "Shape" with 2 attributes, "width" and "height". 
Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.
*/

package Day_2;

import java.lang.*;
import java.util.*;

class shape
{
	private int height ;
	private int width;
	public void setWidth(int w)
	{
		width= w;
	}
	public void setHeight(int h)
	{
		height= h;
	}
	public void getWidth()
	{
		System.out.println("The width is "+width);
	}
	public void getHeight()
	{
		System.out.println("The height is "+height);
	}
	public void getArea()
	{
		int area= height*width;
		System.out.println("Area : "+area);
	}
}

public class EX01_Getter_Setter
{
	public static void main(String args[])
	{
		shape s1= new shape();
		s1.setWidth(10);
		s1.setHeight(100);
		s1.getWidth();
		s1.getHeight();
		s1.getArea();
	}
}
