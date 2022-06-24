 import java.util.*;
class prog
{
public static void main(String args[])
{
Vector<String> data=new Vector<String>();
data.add("Apple");
data.add("Mango");
data.add("Orange");
data.add("Grapes");
Iterator itr=data.iterator();
while(itr.hasNext())
{
System.out.println("Item :"+itr.next());
}
itr.remove();
System.out.println("--------------");
for(String d:data)
{
System.out.println("Item :"+d);
}
System.out.println("Vector size  :"+data.size());
if(data.contains("Orange"))
{
System.out.println("Orange is present at index :"+data.indexOf("Orange"));
}
}
}

