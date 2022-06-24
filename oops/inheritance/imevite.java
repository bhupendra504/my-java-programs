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
System.out.println("Drive class B function");
}
}
class prog
{
public static void main(String args[])
{
B obj=new B();
obj.fun();
}
}