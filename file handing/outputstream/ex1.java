import java.io.*;
class prog
{
public static void main(String args[]) throws Exception
{
FileOutputStream fout=new FileOutputStream("Abc.txt");
DataOutputStream dout=new DataOutputStream(fout);
try
{
dout.writeDouble(1.1);
dout.writeInt(55);
dout.writeBoolean(true);
dout.writeChar('4');
System.out.println("Data write Succesfully.....");
}
catch(Exception e)
{
System.out.println("Exception  :"+e);
}
finally
{
dout.close();
}
}
}