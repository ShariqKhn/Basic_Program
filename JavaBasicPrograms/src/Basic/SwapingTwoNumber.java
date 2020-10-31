package Basic;

public class SwapingTwoNumber 
{
	public static void main(String[] args) 
	{
		int a=80,b=30;
		
		
		System.out.println("Value of a and b without swapping " + a+" "+b);
		
	/*	//swapping third  using varaible
		
		int x=a;   //80
		
		a=b;    //30
	    b=x;    //80
        
        System.out.println("Value pf a and b after swapping " + a +" " +b); */
		
		// swapping without using third varaible
		
	/*	a=a+b;   //80+30=110
		b=a-b;   //110-30=80
		a=a-b;   //110-80=30
		
		System.out.println("Value of a and b after swapping" +a +" "+b);
		*/
		
		a=a*b;  // 80*30=2400
		b=a/b;  //2400/30= 80
		a=a/b;  //2400/80=30
		
		System.out.println("Value of a and b after swapping" +a +" "+b);
		
		
		
		
		
		
		
		
		
	}

}
