import java.io.FileInputStream;
class prog
{
public static void main(String args[])throws Exception
{
FileInputStream fin=new FileInputStream("Abc.txt");
try
{
int i=0;
while((i=fin.read())!=-1)
{
System.out.println((char)i);
}
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
finally
{
fin.close();
}
}
}