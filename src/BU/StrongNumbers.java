package BU;

import java.util.Scanner;

public class StrongNumbers 
{
	public static void main(String[] args) 
	{
		//145   1!+4!+5!=145
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
				
		int temp=num;
		int sum=0;
				
		while(num!=0) 
		{
		int digit=num%10;
					
		int fact=factorial(digit);
		sum=sum+fact;
		num=num/10;
		}

		if(sum==temp) 
		{
			System.out.println("Given Number is Strong Number");
		}
		else 
		{
			System.out.println("Not a Strong Number");
		}
	}

	public static int factorial(int num) 
	{			
		int product=1;
		for(int i=1; i<=num; i++) 
		{
			product=product*i;	  
		}
		return product;
	}
}