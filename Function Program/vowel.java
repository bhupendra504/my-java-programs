import java.util.Scanner;
class prog
{
void vowels(String str)
{
char ch;
for(int j=0;j<str.length();j++)
{
  ch=str.charAt(j);
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
{
System.out.println(ch);
}
}
}
public static void main(String args[])
{
  prog obj=new prog();
  String s;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string: ");
  s=sc.nextLine();
  System.out.println("vowel in a string are:");
  obj.vowels(s);
}
}

              












