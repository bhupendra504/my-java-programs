import java.io.*;
class prog
{
public static void main(String args[])throws Exception
{
FileInputStream fin=new FileInputStream("Abc.txt");
FileOutputStream fout=new FileOutputStream("New.txt");
try
{
int i=0;
while((i=fin.read())!=-1)
{
fout.write((char)i);
}
System.out.println("Data write successfallly");
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
finally
{
fin.close();
fout.close();
}
}
}
