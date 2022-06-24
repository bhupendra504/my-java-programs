import java.io.*;
import java.net.*;
class myserver
{
public static void main(String args[])throws Exception
{
try
{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("Client say :"+str);
ss.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}