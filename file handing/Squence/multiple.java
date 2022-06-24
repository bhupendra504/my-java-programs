import java.io.*;
import java.util.*;
class prog
{
public static void main(String args[])throws Exception
{
 FileInputStream f1=new FileInputStream("Abc.txt");
FileInputStream f2=new FileInputStream("Abc1.txt");
FileInputStream f3=new FileInputStream("data.txt");
FileInputStream f4=new FileInputStream("d.txt");
Vector v=new Vector();
try
{
v.add(f1);
v.add(f2);
v.add(f3);
v.add(f4);
Enumeration e=v.element();
SequenceInputStream sin=new SequenceInputStream(e);
int i=0;
while((i=sin.read())!=-1)
{
System.out.println((char)i);
}
}
catch(Exception e1)
{
}
finally
{
//sin.close();
}
}
}