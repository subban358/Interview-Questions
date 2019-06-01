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
