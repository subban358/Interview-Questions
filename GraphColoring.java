public class GraphColoring
{
    static boolean isSafe(int g[][],int k,int c,int x[],int n)
    {
        for (int i=0;i<n;i++)
        {
            if(g[k][i] == 1 && c == x[i])
            {
                return false;
            }
        }
        return true;
        
    }
    static void graphColor(int g[][],int k,int m,int x[],int n)
    {
        for(int c=1;c<=m;c++)
        {
            if(isSafe(g,k,c,x,n))
            {
                x[k]=c;
                
                if(k+1<n)
                    graphColor(g,k+1,m,x,n);
                else
                {
                    for(int h=0;h<n;h++)
                        System.out.printf("%d ", x[h]);
                    return;    
                }    
            }
        }
    }
	public static void main(String[] args)
	{
	    int m=3,n=4;
		int g[][] = {
		                {1,1,0,1},
		                {1,1,1,1},
		                {0,1,1,1},
		                {1,1,1,1}
		            };
	    int x[] = {0,0,0,0};	            
	    graphColor(g,0,m,x,n);	            
	}
}
