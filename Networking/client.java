import java.io.*;
import java.net.*;
class myclient
{
public static void main(String args[]) throws Exception
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str="",str1="";
while(!str.equals("stop"))
{
str1=br.readLine();
dout.writeUTF(str1);
dout.flush();

str=(String)dis.readUTF();
System.out.println("Server Say : "+str);
}
dis.close();
s.close();
}
catch(Exception e)
{


}
}
}