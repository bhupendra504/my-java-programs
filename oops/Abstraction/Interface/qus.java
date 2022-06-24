interface interfaceimple
{
public void fun();
}
abstract class A implements interfaceimple
{
public void fun()
{
System.out.println("Interface Method is override");
}
public abstract void fun1();
}
class B extends A
{
public void fun1()
{
System.out.println("Abstruct Method is override");
}
}
class prog
{
public static void main(String args[])
{
B obj=new B();
obj.fun();
obj.fun1();
}
}