/*

3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?

 */


package Day_2;

class Emp
{
	private static int cnt=16;
	
	public static int getCnt()
	{
		return cnt;
	}
}

public class EX03_Static_Member
{
	public static void main(String args[])
	{
		Emp e1=new Emp();
		System.out.println(e1.getCnt());
	}
}
