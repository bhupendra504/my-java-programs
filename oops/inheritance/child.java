class A 
{
A(String msg)
{
System.out.println("Message :"+msg);
}
}
class B extends A
{
B(String m)
{
super(m);
}
}
class prog 
{
public static void main(String args[])
{
B obj=new B("Hello Everyone");
}
}