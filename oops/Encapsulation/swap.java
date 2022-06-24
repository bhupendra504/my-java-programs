class swap
{
private int a,b;
swap()
{
a=0;
b=0;
}
public void setA(int a)
{
this.a=a;
}
public void setB(int b)
{
this.b=b;
}
public int getA()
{
return a;
}
public int getB()
{
return b;
}
}
class prog
{
public static void main(String args[])
{
swap sp=new swap();
sp.setA(10); //Set value of A
sp.setB(30); // Set Value of B

System.out.println("values Before  swapping");
System.out.println("--------------");
System.out.println("value A  : "+sp.getA()); //Get value of A
System.out.println("value B  : "+sp.getB());// Get value of B
int num1=sp.getA(); //set Value of num1
int num2=sp.getB(); //set value of num2
num1=num1+num2; // swapping done 
num2=num1-num2;
num1=num1-num2;
sp.setA(num1); //again set value of A
sp.setB(num2); // again set value of B

System.out.println("values after swapping");
System.out.println("--------------");
System.out.println("value A  : "+sp.getA());
System.out.println("value B  : "+sp.getB());
}
}
