import java.util.Scanner;
class A
{
 public void fun()
{
System.out.println("Base class A function");
}
}
class B extends A
{
public void fun1()
{
System.out.println("base class B function");
}
}
class C extends B
{
public void fun2()
{
System.out.println("drive class C function");
}
}
class prog
{
public static void main(String args[])
{
 C obj=new C();
obj.fun();
obj.fun1();
obj.fun2();
}
}
