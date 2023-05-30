package AccessSpecifier;

public class Private_24042023 
{
	//If we declare any member of class as private then scope of that member remains within the class.
	
	
	private int num;
	
	private Private_24042023()
	{
	   num=50;
	
	
	}
	
	
	public void Add() 
	{
	System.out.println(num+num);	
	}
	
	
	
	public static void main(String[] args) 
	{
		Private_24042023 p=new Private_24042023();
		p.Add();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
