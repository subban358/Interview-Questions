public class Nqueen
{
    static boolean isSafe(int board[][],int i,int j,int n)
    {
        // Column wise 
        for(int row=0;row<n;row++)
        {
            if(board[row][j]==1)
                return false;
        }
        int x=i;
        int y=j;
        
        //left diagonal
        while(x>=0 && y>=0)
        {
            if(board[x][y]==1)
                return false;
            
            x--;
            y--;
        }
        
        x=i;
        y=j;
        
        //Right diagonal
        while(x>=0 && y<n)
        {
            if(board[x][y]==1)
                return false;
            
            x--;
            y++;
        }
        
        return true;
    }
    static boolean solveNqueen(int board[][],int i,int n)
    {
        if (i==n)
        {
            for(int k=0;k<n;k++)
            {
                for(int l=0;l<n;l++)
                {
                    if(board[k][l] == 1)
                        System.out.print("Q  ");
                    else
                        System.out.print("_  ");
                }
                System.out.println();
            }
            return true;
        }
        for(int j=0;j<n;j++)
        {
            if(isSafe(board,i,j,n))
            {
                board[i][j]=1;
                
                boolean placedRight = solveNqueen(board,i+1,n);
                
                if (placedRight)
                {
                    return true;
                }
                
                // Backtrack
                board[i][j] = 0;
                
            }
        }
        return false;
        
    }
    public static void main(String[] args) 
    {
        int n=8;
        int [][] board = {
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                          {0,0,0,0,0,0,0,0},
                        };
                        
        solveNqueen(board,0,n);                 
    }
}
