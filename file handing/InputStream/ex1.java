import java.io.*;
class prog
{
public static void main(String args[]) throws Exception
{
FileInputStream fin=new FileInputStream("Abc.txt");
DataInputStream din=new DataInputStream(fin);
try
{
double a=din.readDouble();
int b=din.readInt();
boolean c=din.readBoolean();
char d=din.readChar();
System.out.println("Double  :"+a);
System.out.println("Int  :"+b);
System.out.println("Boolean  :"+c);
System.out.println("Char :"+d);
}
catch(Exception e)
{
System.out.println("Exception  :"+e);
}
finally
{
din.close();
fin.close();
}
}
}