package AccessSpecifier;

public class Protected_24042023 
{
	//if we declare any member of class as protected then scope of that member remains
	//within the package but by using inheritance we can transfer the data from 
	//one package to the another
	  
	protected int num;
	int num1;
	
    protected Protected_24042023()
	{
      num=70;
      num1=50;
		
		
	}
	
    public void Sub()
    {
	System.out.println(num-num1-num-num1);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
