 import java.util.Scanner;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
try
{
System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Enter the number");
b=sc.nextInt();
c=a/b;
System.out.println("Result  :"+c);
}
catch(ArithmeticException e)
{
System.out.println("Exception :"+e);
}
System.out.println("Rest of the code .....");
}
}
