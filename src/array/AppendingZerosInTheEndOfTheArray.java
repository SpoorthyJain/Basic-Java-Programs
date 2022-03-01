package array;

public class AppendingZerosInTheEndOfTheArray
{
	public static void main(String[] args) 
	{
		int[] array1 = {1, 2, 0, 0, 4, 0, 3};
		int[] array2 = new int[array1.length];
		
		int m=0;
		int n = array1.length-1;
		
		for(int i=0; i<array1.length; i++)
		{
			if(array1[i]==0)
			{
				array2[n] = array1[i];
				n--;
			}
			else
			{
				array2[m] = array1[i];
				m++;
			}
		}
		for(int i=0; i<array2.length; i++)
		{
			System.out.print(array2[i]+" ");
		}
	}
}