/*Evaluate a boolean expression represented as a string
Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Constraints – The length of the string will be odd. It will always be a valid string.
Example, 1AA0 will not be given as an input.

Input : 1A0B1
Output : 1
1 AND 0 OR 1 = 1

Input : 1C1B1B0A0
Output : 0
*/

import java.util.Scanner;
public class BitWise 
{
	public static void main(String args[])
	{
		char arr[]=new char[100];
		int c=0;
		Scanner sc = new Scanner(System.in);

			System.out.print("\na-> AND\nb-> OR \nc-> XOR \nOnly binary (0 or 1) are accepted\n\nThe Input String must be of ODD Length\n");
			System.out.print("\n\nEnter your expression: ");
			String a = sc.nextLine();

			for(int i=0;i<a.length();i++)
				arr[i]=a.charAt(i);
			try
		{
			for(int j=0;j<a.length();j++)
			{
				if(!(arr[j]=='A'||arr[j]=='B'||arr[j]=='C'||arr[j]=='1'||arr[j]=='0'))
					throw new NewException("Enter According to the valid protocol!!");

			}
			try
			{
				if(a.length()%2==0)
					throw new NewException("Enter According to the valid protocol!!");

			for(int k=0;k<a.length();k++)
			{
				if(arr[k]=='A')
				{
					if(arr[k-1]=='1'&& arr[k+1]=='1')
						arr[k+1]='1';
					else if(arr[k-1]=='0'&& arr[k+1]=='0')
						arr[k+1]='0';
					else
						arr[k+1]='0';
				}
				if(arr[k]=='B')
				{
					if(arr[k-1]=='0'&& arr[k+1]=='0')
						arr[k+1]='0';
					else
						arr[k+1]='1';
				}
				if(arr[k]=='C')
				{
					if(arr[k-1]=='0'&& arr[k+1]=='0'||arr[k-1]=='1'&& arr[k+1]=='1')
						arr[k+1]='0';
					else
						arr[k+1]='1';
				}
			}
			System.out.printf("Your answer is: %c",arr[a.length()-1]);

			}

			catch(NewException e)
			{
			System.out.println(e);
			}
		}

		catch(NewException e)
		{
			System.out.println(e);
		}

	}
}

class NewException extends Exception
{
	NewException(String s)
	{
		super(s);
	}
}
