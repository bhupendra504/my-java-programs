import java.io.*;
class Student implements Serializable
{
int id;
String name,city;
Student(int id,String name,String city)
{
this.id=id;
this.name=name;
this.city=city;
}
}
class prog
{
public static void main(String args[]) throws Exception
{
FileOutputStream fout=new FileOutputStream("Abc.txt");
ObjectOutputStream obj=new ObjectOutputStream(fout);
Student st=new Student(101,"Amar pal","Bhopal");
try
{
obj.writeObject(st);
System.out.println("Serialization process Done....");
}
catch(Exception e)
{
System.out.println("Excetion  :"+e);
}
finally
{
obj.close();
fout.close();
}
}
}
