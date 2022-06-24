import java.util.Scanner;
class Test
{
public void validate(int age)
{
if(age<18)
{
throw new ArithmeticException("Invalid Age");
}
else
{
System.out.println("Welcome User");
}
}
}
class prog
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
Test obj=new Test();
try
{
System.out.println("Enter the Age");
age=sc.nextInt();
obj.validate(age);
}
catch(Exception e)
{
System.out.println(e);
}
}
}


