import java.util.Arrays;
public class Daily1
{
    int res(int arr[], int b)
    {
        Arrays.sort(arr);
        int max=arr.length-1;
        int min=0;
        int flag =0;

        while(min!=max)
        {
            if(arr[min]+arr[max]>b)
              max--;
            else if(arr[min]+arr[max]<b)
                min++;
            else if(arr[min]+arr[max]==b)
            { flag=1; break;}
        }
        return flag;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,7,10};
        int bool=new Daily1().res(a,17);
        if(bool==1)
            System.out.println("true");
        else
            System.out.println("false");


    }
}
