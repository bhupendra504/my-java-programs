interface A
{
public void fun();
}
class B implements A
{
public void fun()
{
System.out.println("Inteface Method is override.... ");
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