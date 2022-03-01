package string;

public class SwappingTwoNumbers 
{
	public static void main(String[] args) 
	{
		int a =10;
		int b = 20;
		
		//without swapping 
		
		a = a + b; //a=30 & b=20
		
		b = a - b; //a=30 & b=10
		
		a = a - b; //a=20 & b=10
		
		System.out.println("a:"+a+", b:"+b);
		
		/*int temp = a;
		a = b;
		b = temp;
		
		System.out.println("a:"+a+", b:"+b);*/
	}
}