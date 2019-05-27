import java.util.Arrays;
public class Max_Occur
{
    void run(int a[])
    {
        int j=0;
        int b[]=new int[10];
        Arrays.sort(a);
        for(int i=0;i<a.length-1;)
        {
            if(a[j]==a[i+1])
            {
                b[j]++;
                i++;
            }
            else
            {
                j=j+(b[j]+1);
                i=i+(b[j]+1);
            }
        }
        int max=b[0],l=1;
        for(int m=1;m<b.length-1;m++)
        {
            if(b[m]>max){
                max=b[m];
                l=m+1;
            }
        }

        System.out.println("Max occur "+a[l]);
        //for(int k:b)
        //    System.out.println(k);

    }
    public static void main(String args[])
    {
        int a[]={2,3,3,2,9,8,3,9,8,8,8};
        new Max_Occur().run(a);
    }
}
