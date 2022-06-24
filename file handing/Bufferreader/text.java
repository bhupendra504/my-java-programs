import java.io.FileWriter;
class prog
{
public static void main(String args[])throws Exception
{
FileWriter fw=new FileWriter("Abc.txt");
try
{
String msg="Hello by Algorithm Tnp";
fw.write(msg);
System.out.println("Data write....");
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
fw.close();
}
}
}