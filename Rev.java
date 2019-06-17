/*
How to reverse a String taking it as a command line argument

Suppose we take => ABC and the output will be => CBA
*/

class Rev
{
public static void main(String[] args) 
{
String s=args[0];
char a[] = new char[100];
System.out.println(s);
int e=s.length()-1;

for(int i=0;i<s.length();i++)
{
a[i]=s.charAt(e);
e--;
}
System.out.println(a);

}
}
