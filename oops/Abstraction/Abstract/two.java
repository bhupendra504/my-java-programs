abstract class A
{
A()
{
System.out.println("Constructor of class A");
}
public abstract void fun();
}
 abstract class B extends A
{
B()
{
System.out.println("Constructor of class B");
}
public void fun()
{
System.out.println("Abstract Method override");
}
public abstract void fun1();
}
class C extends B
{
public void fun1()
{
System.out.println("Another Abstract method override");
}
}
class prog
{
public static void main(String args[])
{
C obj=new C();
obj.fun();
obj.fun1();
}
}