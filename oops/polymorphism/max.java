import java.util.Scanner;
class max
{
 public void max(int a,int b)
{
if(a>b)
{
System.out.println("maximum value :"+a);
}
else
{
System.out.println("maximum value :"+b);
}
}
public void max(int a,int b,int c)
{
if(a>b && a>c)
{
System.out.println("maximum value :"+a);
}
else if(b>a && b>c)
{
System.out.println("maximum value :"+b);
}
else
{
System.out.println("maximum value :"+c);
}
}
public void max(int Arr[])
{
 int maximum=Arr[0];
 for(int i=1;i<Arr.length;i++)
{
  if(Arr[i]>maximum){
  maximum=Arr[i];
}
}

System.out.println("maximum value is "+maximum);
}
}
class prog
{
public static void main(String args[])
{
  int Arr[]=new int[5];
  Arr[0]=1;
  Arr[1]=11;
  Arr[2]=9;
  Arr[3]=7;
  Arr[4]=10;
  max obj=new max();
  obj.max(5,19);
  obj.max(12,76,90);
  obj.max(Arr);
}
}
