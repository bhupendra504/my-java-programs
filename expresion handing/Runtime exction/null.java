import java.util.Scanner;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name=null;
try
{
System.out.println("Length :"+name.length());
}
catch (NullPointerException e)
{
System.out.println("Exception :"+e);
}
System.out.println("Rest of code.....");
}
}