 import java.util.Scanner;
class Prog{
public static int Fact(int num){

if(num==0){
return 1;
}
else{
return num*Fact(num-1);
}
}
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number to check factorial");
int num=scan.nextInt();

int fact=Prog.Fact(num);
System.out.println("Factorial of " +num + " is : " +fact);

}
}