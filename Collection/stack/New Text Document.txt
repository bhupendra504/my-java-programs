import java.util.*;
class prog
{
public static void main(String args[])
{
Stack<String>data=new Stack<String>();
data.push("Amar");
data.push("Samar");
data.push("Rahul");
data.push("Rohit");
for(String name:data)
{
System.out.println("Name :"+name);
}
data.pop();
System.out.println("-------------");
for(String name:data)
{
System.out.println("Name :"+name);
}
System.out.println("peek Method :"+data.peek());
}
}