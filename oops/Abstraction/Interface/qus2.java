import java.util.Scanner;
interface A
{
public void fun();
}
interface B extends A
{
public void fun();
}
class C implements B
{
public void fun()
{
System.out.println("Interface Method overradi");
}
}
class prog
{
public static void main(String args[])
{
C obj=new C();
obj.fun();
}
}