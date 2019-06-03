
/*Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.*/

import java.util.*;
class Daily4
{
	
	int run(int a[])
	{
		int l=a.length,c=0;
		int temp=0,s=0,s1=0;
		Arrays.sort(a);

		
		for (int j=1; j<l-1; j++) 
		{       
	      	if (a[j+1] != a[j]+1) 
	      	{
	       		 s=a[j]+1; 
	       		 break;
	      	}
	    	else 
	    		s=a[l-1]+1;
        }
        return s;
	
	}

	public static void main(String[] args)
	{
		int a[]={1,2,0};
		System.out.print(new Daily4().run(a));
		
	}
}
