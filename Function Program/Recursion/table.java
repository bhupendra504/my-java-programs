import java.util.Scanner;
class prog
{
  public static void fun (int n,int i)
{
if(i<=10)
{
  System.out.println(n+"x"+i+"="+(n*i));
  i++;
  fun(n,i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
prog.fun(n,1);
}
}


