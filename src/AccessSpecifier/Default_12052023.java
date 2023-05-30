package AccessSpecifier;

public class Default_12052023 
{
	int a;
	int b;
	
	 Default_12052023() 
	{
		a=40;
		b=80;
		
	}
	
	void Add()
	{
		System.out.println(a+b+b+a);
		
	}
	
	void Sub()
	{
		System.out.println(b-a-b-a);
		
	}
	
	public static void main(String[] args) 
	{
		Default_12052023 d=new Default_12052023();
		
		d.Add();
		d.Sub();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
