import java.util.Scanner;
class prog
{
public static void greter(int a,int b,int c)
{
 if(a>b && a>c)
		{
			System.out.println(a+" is greter");
		}
		else if(b>c)
		{
			System.out.println(b+" is greter");
		}
                else
                {
                   System.out.println(c+" is greter");
}
}
              public static void main(String args[])
              {
               prog obj=new prog();
               obj.greter(12,4,5);
}
}












