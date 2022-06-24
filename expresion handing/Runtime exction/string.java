import java.util.Scanner;
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name="Apple";
try
{
char ch=name.charAt(34);
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("Exception :"+e);
}
System.out.println("Rest of the code.....");
}
}