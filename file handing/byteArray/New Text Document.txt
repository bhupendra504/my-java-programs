import java.io.*;
class prog
{
public static void main(String args[]) throws Exception
{
ByteArrayOutputStream byt=new ByteArrayOutputStream();
FileOutputStream f1=new FileOutputStream("A.txt");
FileOutputStream f2=new FileOutputStream("B.txt");
try
{
String msg="Hello everyone";
byte b[]=msg.getBytes();
byt.write(b);
byt.writeTo(f1);
byt.writeTo(f2);
System.out.println("Data write succesfully........");

}
catch(Exception e)
{
System.out.println("Exception  : "+e);
}
finally
{
byt.close();
f1.close();
f2.close();

}

}
}