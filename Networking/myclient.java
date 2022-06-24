import java.io.*;
import java.net.*;
class myclient
{
public static void main(String args[])throws Exception
{
try
{
Socket s=new Socket("localhost",6666);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
dout.writeUTF("Hello server");
dout.flush();
s.close();
}
catch(Exception e)
{

}
}
}

