
/*
printing of the series-> 1, 2, 1, 3, 2, 5, 3, 7, 5, 11, 8, 13, 13, 17, …
This series is a mixture of 2 series – all the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order.

Write a program to find the Nth term in this series.

The value N is a Positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than the value of Nth term, no other characters/strings or message should be written to STDOUT.

For example, when N = 14, the 14th term in the series is 17. So only the value 17 should be printed to STDOUT.
*/

import java.util.Scanner;

public class TCS
{
    static int fib(int n)
    {
        if(n==0||n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);

    }
    static int prime(int m)
    {
        int c=0,s=0,flag=0;
        for (int i = 2; i <= 1000; i++)
        {
            flag=0;
                for (int j = 2; j < i / 2; j++)
                {
                    if (i % j == 0)
                    {
                        flag = 1;
                        break;
                    }

                }
                if(flag==0 && c<m+1)
                {
                    s=i;
                    c++;
                }

            }
        return s;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int k = sc.nextInt();
        if(k%2!=0)
            System.out.printf("The %dth number of the series is: %d",k,fib((k+1)/2));
        else
            System.out.printf("The %dth number of the series is: %d",k,prime(k/2));

    }
}
