package AccessSpecifier;

public class Public 
{
	//If we declare any member of class as public then scope of that member remain throughout the project
	
	public int num;
	
	public Public() 
	{
	num=80;
	}
	
	public void Multiply()
	{
	System.out.println(num*num*num*num);	
	}
	
	
	public static void main(String[] args) 
	{
		Public e=new Public();
		e.Multiply();
		System.out.println(e.num);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
