/*
There should be a given sequence of encoded messages like = 3A2B1C2A
so the output will be decoded for = AAABBCAA

the encoding part is available on the miscellaneous section of the reposetory
*/
import java.util.Scanner;
public class Run_length_decoding
{
    static void decoding(char a3[], int length)
    {
        char a1[] = new char[length];
        int a2[] = new int[length];

        int g=0;
        int f=0;
        for(int i=0;i<length;i++)
        {
            if(i%2==0)
            {
                a2[g]=Integer.parseInt(String.valueOf(a3[i]));
                g++;
            }
            else
            {
                a1[f]=a3[i];
                f++;
            }
        }
        System.out.print("The Decoded message is: ");
        for(int k=0;k<a1.length;k++)
        {
            for(int s=0;s<a2[k];s++)
                System.out.printf("%c",a1[k]);
        }
       /* for(char d : a1)
            System.out.print(d);
        for(int h : a2)
            System.out.print(h);*/
    }

    public static void main(String[] args)
    {
        System.out.print("The Input Format\nFirst should be a number " +
                "\nThen it should be a letter.");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the encoded Message: ");
        String st = sc.nextLine();
        int length= st.length();
        char a3[] = st.toCharArray();

        try
        {
            if(length%2!=0)
                throw new MyException("Must be even length input");
            else
                decoding(a3,length);

        }
        catch (MyException e)
        {
            System.out.print(e);
        }

    }
}
class MyException extends Exception
{
    MyException(String s)
    {super(s);}
}
