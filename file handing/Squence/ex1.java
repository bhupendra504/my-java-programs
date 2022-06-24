import java.io.FileInputStream;
import java.io.SequenceInputStream;
class prog
{
public static void main(String args[])throws Exception
{
FileInputStream fin1=new FileInputStream("Abc.txt");
FileInputStream fin2=new FileInputStream("Abc1.txt");
SequenceInputStream sin=new SequenceInputStream(fin1,fin2);
try
{
int i=0;
while((i=sin.read())!=-1)
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
fin1.close();
fin2.close();
sin.close();
}
}
}
