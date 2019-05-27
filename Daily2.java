class Daily2
{
	public static void main(String[] args)
   {
   		int a[]={1,2,3,4,5};
   		int i,j,k,m=0;
   		int b[]=new int[10];
   		 b[0]=1;
    	k=a.length;
    	for(i=0;i<=k-1;i++)
       {
	        for(j=0;j<=k-1;)
	        {
	            if(i==j)
	            {
	                b[m]=b[m]*1;
	                j++;
	            }
	            else
	            {
	                b[m]=b[m]*a[j++];
	            }
        }
       		 b[++m]=1;

    	}

    	for(int s=0;s<=k-1;s++)
    		System.out.printf("%d ",b[s]);

		
	}
   	
}
