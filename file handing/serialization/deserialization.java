import java.io.*;
class prog
{
public static void main(String args[])throws Exception
{
FileInputStream fin=new FileInputStream ("Abc.txt");
ObjectInputStream oin=new ObjectInputStream (fin);
try
{
Student st=(Student)oin.readObject();
System.out.println("Id :"+st.id+"\tName :"+st.name+"\tCity :"+st.city);
}
catch(Exception e)
{

}
finally
{
oin.close();
fin.close();
}
}
}
