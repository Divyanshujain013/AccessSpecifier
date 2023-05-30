package AccessSpecifier;

public class Protected_11042023 
{
	protected int a;
	protected int b;
	
	protected Protected_11042023()
	{
		a=40;
		b=80;
		
		
		}
	
	protected void M1()
	{
	System.out.println(a*b+b*a*b);	
	}
	
	public void M2()
	{
	System.out.println(a+b);	
	}
	
	public static void main(String[] args) 
	{
		
		Protected_11042023 p=new Protected_11042023();
		p.M1();
		System.out.println(p.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
