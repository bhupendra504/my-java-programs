class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
}
class Test
{
public void validate(int age) throws MyException
{
if(age<18)
{
throw new MyException("Invalid Age");
}
else
{
System.out.println("Welcome user");
}
}
}
class prog
{
public static void main(String ags[])
{
Test obj=new Test();
try
{
obj.validate(12);
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}
