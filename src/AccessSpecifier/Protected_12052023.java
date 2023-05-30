package AccessSpecifier;

public class Protected_12052023 
{
	int a;
	int b;
	
    protected Protected_12052023() 
	{
		a=80;
		b=20;
		
	}
	
	
	protected void add()
	{
		
		System.out.println(b+a+b);
		
	}
	
	protected void multi()
	{
		System.out.println(b*a*a);
		
	}
	
	public static void main(String[] args) 
	{
		Protected_12052023 p=new Protected_12052023();
		
		p.add();
		p.multi();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
