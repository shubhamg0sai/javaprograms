import java.util.Scanner;
public class pos_or_nec{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n =sc.nextInt();
if(n>=0)
System.out.println("no. is positive");
else
System.out.println("number is negative");
}
}
