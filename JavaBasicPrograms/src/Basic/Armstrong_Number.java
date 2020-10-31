package Basic;

import java.util.Scanner;

public class Armstrong_Number 
{
	
	public static void main(String[] args) 
	{
		int r, sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		
		int num=sc.nextInt();
		
		int temp=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Its an Amstrong Number");
		}
		else
		{
			System.out.println("Its not an Amstrong number");
		}
		
		
		sc.close();
		
		
		
		
	}

}
