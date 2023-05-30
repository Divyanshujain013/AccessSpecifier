package AccessSpecifier;

public class Default 
{
	//If we declare any member of class as default then scope of that member remains within the package
	//variable declaration
	int num1;
	int num2;
	
	Default()
	{
		num1=20;
		num2=40;
	}
	
	 void Multiplication()
	 {
		System.out.println(num1*num2*num2);
	}
	
	public static void main(String[] args) 
	{
		Default d=new Default();
		d.Multiplication();
		System.out.println(d.num1);
		System.out.println(d.num2);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
