import java.util.Scanner;
abstract class A
{
public abstract void fun();
}
class B extends A
{
public void fun()
{
System.out.println("Abstract Method override");
}
}
class prog
{
public static void main(String args[])
{
A obj=new B();
obj.fun();
}
}