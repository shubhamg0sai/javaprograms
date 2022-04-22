import java.util.Scanner;
class table{
public static void main(String[] args)
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.format("%d x %d=%d\n",n,i,n*i);
}
}
}
