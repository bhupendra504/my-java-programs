import java.io.FileOutputStream;
class prog
{
public static void main(String args[])throws Exception
{
FileOutputStream fout=new FileOutputStream("Abc.txt");
try
{
String msg="Hello by Algorithm Tnp";
byte b[]=msg.getBytes();
fout.write(b);
System.out.println("Data write succefully.....");
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
finally
{
fout.close();
}
}
}