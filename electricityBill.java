import java.util.Scanner;
public class electricityBill{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int unit=0;
double bill=0;
System.out.println("enter unit");
unit=sc.nextInt();
if(unit>100){
bill=(1.20*unit);
}
else if(unit>200){
bill=((100*1.20)+(unit-100*2));
}
else if(unit>300){
bill=(100*1.20)+(unit-100*2)+(unit-200*3);
}
else{
System.out.println("invalid unit");
}
System.out.println("electricity bill is "+bill);


}}

