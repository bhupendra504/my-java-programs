class A
{
private int a=10;
private void fun()
{
System.out.println("Hello Everyone");
}
}
class B extends A
{
public void fun1()
{
System.out.println("value of A :"+a);
fun();
}
}
class prog
{
public static void main(String args[])
{
B obj=new B();
System.out.println("Inside the class function");
obj.fun1();
}
}
