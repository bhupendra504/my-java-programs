import java.util.Scanner;
class prog
{
  public static void fun (int n)
{
  if(n>=1)
 {
  System.out.println("bupendra");
  n--;
  fun(n);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number");
n=sc.nextInt();
prog.fun(n);
}
}

