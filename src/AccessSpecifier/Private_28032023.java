package AccessSpecifier;

public class Private_28032023
{ 
	//Access specifier is used to represent the scope the member of class(variable,constructor,method)

	//Private specifier scope remains within the class
	//variable declarartion
	private int num;
	
	private Private_28032023()  //variable initialization
	{
       num=10;	
	}
	
	public void Add()
	{
	System.out.println(num+num);	
	}
	
	public static void main(String[] args) 
	{
		Private_28032023 p=new Private_28032023();
		p.Add();
		System.out.println(p.num);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
