class A
{
 public void fun()
{
System.out.println("Base class A function");
}
}
class B extends A
{
public void fun()
{
super.fun();
System.out.println("base class B function");
}
}
class C extends B
{
public void fun()
{
super.fun();
System.out.println("drive class C function");
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