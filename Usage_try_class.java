

import java.util.Scanner;

public class Usage_try_class {
public static void main(String[] args)
{
int num1,num2;
char s1;
Scanner sc = new Scanner (System.in);

do {

try
{
System.out.println(" enter the first number");
num1=sc.nextInt();
System.out.println("enter the second number");
num2= sc.nextInt();
float ans=num1/num2;
System.out.println("result"+ans);

}
catch(ArithmeticException e )
{
System.out.println("division by 0 is not possible");

}

System.out.println("do you want to continue");
s1= sc.next().charAt(0);
}
while(s1=='y'||s1=='Y');
sc.close();
}
}