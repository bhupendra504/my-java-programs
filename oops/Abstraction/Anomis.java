abstract class A
{
public abstract void fun();
}
class prog
{
public static void main(String args[])
{
A obj=new A()
{
public void fun()
{
System.out.println("Abstract Method override...");
}
};
obj.fun();
}
}