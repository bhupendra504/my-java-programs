import java.util.Scanner;
class NullPoint
{
 public void Divide(int a)
{
if(a%5==0)
{
throw new NullPointerException("Here is nullpoinyException");
}
else
{
System.out.println(a/5);
}
}
}
class prog
{
public static void main(String args[])
{
NullPoint obj=new NullPoint();
try
{
obj.Divide(15);
}
catch(Exception e)
{
System.out.println(e);
}
}
}

