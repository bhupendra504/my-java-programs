import java.util.Scanner;
class A
{
int x,y;
A(int a,int b)
{
x=a; y=b;
}
void show()
{
System.out.println(x+"  "+y);
}
}
class B
{
public static void main(String args[])
{
A obj=new A(100,200);
obj.show();
}
}