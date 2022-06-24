import java.io.*;
import java.net.*;
class myserver
{
public static void main(String args[]) throws Exception
{
try
{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="",str1="";
while(!str.equals("stop"))
{
str=(String)dis.readUTF();
System.out.println("Client Say : "+str);
str1=br.readLine();
dout.writeUTF(str1);
dout.flush();
}
dis.close();
s.close();
ss.close();
}
catch(Exception e)
{
System.out.println("Exception : "+e);
}
}
}