package array;

public class SortArrayInAssendingOrder 
{
	public static void main(String[] args) 
	{
		int [] array1 = {2 , 1 , 4 , 3 , 7 , 5};
		for(int i=0; i<array1.length; i++) 
		{
			for(int j=i+1; j<array1.length; j++)
			{
				if(array1[i] > array1[j])
				{
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
			System.out.print(array1[i]+ " ");
		}
	}
}