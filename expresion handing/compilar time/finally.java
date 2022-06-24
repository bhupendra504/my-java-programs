import java.util.Scanner;
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
System.out.println("Result  :"+res);
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
finally
{
System.out.println("Always Executed.....");
}
}
}