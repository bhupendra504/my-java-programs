class shape
{
void draw()
{
System.out.println("Hello everyone");
}
}
class square extends shape
{
void draw()
{
System.out.println("Square shape");
}
}
class prog
{
public static void main(String args[])
{
shape obj=new square();
obj.draw();
}
}
