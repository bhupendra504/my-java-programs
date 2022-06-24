import java.io.*;
import java.util.Scanner;
class prog
{
public static void main(String args[])throws Exception
{
FileOutputStream fout=new FileOutputStream("Abc.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
Scanner sc=new Scanner(System.in);
try
{
String msg;
System.out.println("Enter the message");
msg=sc.nextLine();
byte b[]=msg.getBytes();
bout.write(b);
System.out.println("Data write....");
}
catch(Exception e)
{
}
finally
{
bout.close();
fout.close();
}
}
}