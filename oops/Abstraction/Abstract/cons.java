abstract class A
{
A()
{
System.out.println("Constructor of class A");
}
public abstract void fun();
}
class B extends A
{
B()
{
System.out.println("Constructor of class B");
}
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