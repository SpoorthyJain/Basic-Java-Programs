package array;

public class MaximumElementInAnArray 
{
	public static void main(String[] args) 
	{
		int [] array1 = {2 , 1 , 4 , 3 , 7 , 5};
		for(int i=0; i<array1.length; i++) 
		{
			for(int j=i+1; j<array1.length; j++)
			{
				if(array1[i] > array1[j]) //if(array1[i] < array1[j])----->for descending order
				{
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
			System.out.print(array1[i]+ " ");
			System.out.println();		
		}
		int maxValue = array1[array1.length-1];//array1[0]----->if array is in descending order
		System.out.println("Maximum number in the array is: "+maxValue);
	}
}