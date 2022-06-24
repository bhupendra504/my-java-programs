import java.util.*;
class Prog
{
 public static void main(String args[])
{
List<Integer>data=new ArrayList<Integer>();
data.add(25);
data.add(30);
data.add(39);
data.add(50);
for(int n:data)
{
System.out.println("Item->"+n);
}
data.add(1,30);
System.out.println("--------------------Insert  Elelment-----------");
for(int n:data)
{
System.out.println("Item ->"+n);
}

}
}