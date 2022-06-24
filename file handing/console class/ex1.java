import java.io.*;
class prog
{
public static void main(String args[]) throws Exception
{
Console c=System.console();
String userid;
System.out.println("Enter the user id");
userid=c.readLine();
System.out.println("Enter the password");
char ch[]=c.readPassword();
System.out.println("------------------");
System.out.println("user id :"+userid);
String pass=String.valueOf(ch);
System.out.println("Password  :"+pass);
}
}