import java.io.FileReader;
class prog
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("Abc.txt");
try
{
String msg="Hello by Algorithm Tnp";
int i=0;
while((i=fr.read())!=-1)
{
System.out.print((char)i);
}
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
fr.close();
}
}
}