import java.util.Scanner;
class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
}
class Test
{
public void validate(int age)throws MyException
{
if(age<18)
{
System.out.println("Invaid Age");
}
else
{
System.out.println("Welcome user");
}
}
}
class prog
{
public static void main(String args[])
{
Test obj=new Test();
try
{
obj.validate(15);
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
finally
{
System.out.println("Always Executed....");
}
}
}