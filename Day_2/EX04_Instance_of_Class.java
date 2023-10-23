package Day_2;

class DemoOb
{
	private int id;
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
}
public class EX04_Instance_of_Class
{
	public static void main(String []args)
	{
		DemoOb ob1=new DemoOb(); 
		ob1.setId(12); 
		System.out.println(ob1.getId()); 
		
		DemoOb ob2=ob1; 
		
		System.out.println(ob2.getId()); 
		ob2.setId(45);
		System.out.println(ob2.getId()); 
		
		ob1=new DemoOb(); 
		ob1.setId(10);
		System.out.println(ob1.getId()); 
	}
}
