import java.util.Scanner;
import java.util.InputMismatchException;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,res;
try
{
System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Enter the number");
b=sc.nextInt();
res=a/b;
System.out.println("Result :"+res);
}
catch(ArithmeticException e)
{
System.out.println("Exception :"+e);
}
catch(InputMismatchException e)
{
System.out.println("Exception :"+e);
}
System.out.println("Rest of the code.....");
}
}