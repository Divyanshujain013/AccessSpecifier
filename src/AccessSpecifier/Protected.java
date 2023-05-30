package AccessSpecifier;

public class Protected 
{
	//If we declare any member of class as protected then scope of that member 
	//remains within the package but by using inheritance we can transfer 
	//the data from one package to another
	
	protected int num1;
	protected int num2;
	
	protected Protected()
	{
		num1=40;
		num2=10;
		}
	
	protected void Add()
	{
	System.out.println(num1+num2+num2+num1);	
	}
	
	public static void main(String[] args) 
	{
		
		Protected pp=new Protected();
		pp.Add();
		System.out.println(pp.num1);
		System.out.println(pp.num2);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
