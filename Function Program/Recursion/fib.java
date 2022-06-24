import java.util.Scanner;
class prog
{
  public static void fibo(int n,int f1,int f2,int f3)
{
if(n>=1)
{
f3=f1+f2;
System.out.println(f3);
f1=f2;
f2=f3;
fibo(--n,f1,f2,f3);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int range,f1=0,f2=1;
System.out.println("Enter the range");
range=sc.nextInt();
range=range-2;
System.out.println("-----------------");
System.out.println(f1);
System.out.println(f2);
prog.fibo(range,f1,f2,0);
}
}

