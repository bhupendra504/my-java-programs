import java.util.Scanner;
class prog
{
public void validate(String...data)
{
if(data[0].equals("admin") && data[1].equals("admin123"))
{
System.out.println("Welcome user :"+data[0]);
}
else
{
System.out.println("Invaild Id and password");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
prog obj=new prog();
String name,pass;
System.out.println("Enter the user id");
name=sc.nextLine();
System.out.println("Enter the user password");
pass=sc.nextLine();
obj.validate(name,pass);
}
}

              












