import java.io.*;
class prog
{
public static void main(String args[])throws Exception
{
InputStreamReader ins=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
int id;
String name,city;
System.out.println("Enter the id");
id=Integer.parseInt(br.readLine());
System.out.println("Enter the name");
name=br.readLine();
System.out.println("Enter the city");
city=br.readLine();
System.out.println("----------------");
System.out.println("Id :"+id+"\tName :"+name+"\tCity :"+city);
}
}

