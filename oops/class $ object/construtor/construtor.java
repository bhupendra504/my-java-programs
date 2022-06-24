import java.util.Scanner;
class A
{
int a; String name;
A()
{
a=0; name=null;
}
void show()
{
System.out.println(a+"  "+name);
}
}
class construtor
{
public static void main(String args[])
{
 A obj=new A();
 obj.show();
}
}
