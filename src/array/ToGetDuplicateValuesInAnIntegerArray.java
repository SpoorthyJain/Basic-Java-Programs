package array;

import java.util.LinkedHashSet;

public class ToGetDuplicateValuesInAnIntegerArray 
{
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 2, 4, 1,};
		
		//Step 1: Create a set
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		//Step 2: Add all the elements of an array to the set
		for(int i=0; i<array.length; i++)
		{
			set.add(array[i]);
		}
		
		//Step 3: Compare the element of the set with the element of an array
		for(Integer n : set)
		{
			int count = 0;
			for(int i=0; i<array.length; i++)
			{
				if(n==array[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(n+" ");
			}
		}
	}
}