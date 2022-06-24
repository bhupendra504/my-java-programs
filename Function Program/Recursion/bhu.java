import java.util.Scanner;
class prog
{
  public static void fun(int n,int f)
{
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("factorial is:"+f);
}
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a Number to check factorial");
int n,f=1;
n=sc.nextInt();
prog.fun(n,f);
}
}