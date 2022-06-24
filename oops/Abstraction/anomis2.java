interface c
{
public void fun();
}
class prog
{
public static void main(String args[])
{
A obj=new A()
{
public void fun()
{
System.out.println("interface override...");
}
};
obj.fun();
}
}
