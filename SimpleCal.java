import java.util.Scanner;
public class SimpleCal{
 static int addition(int x,int y){
 return x+y;
}
static int subtraction(int x,int y){
 return x-y;
}
static int division(int x,int y){
 return x/y;
}
static int multiplication(int x,int y){

 return x*y;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int num1=sc.nextInt();
System.out.println("enter the second number");
int num2=sc.nextInt();

System.out.println("operation to perform");
System.out.println("0.EXIT \n1.ADDITION \n2.SUBTRACTION \n.3DIVISION \n4.MULTIPLICATION\n\n");

int ch=sc.nextInt();
switch(ch){
      case 1:
      System.out.println("ADD-"+addition(num1,num2));
      break;
    
      case 2:
      System.out.println("subtraction"+subtraction(num1,num2));
      break;
   	  
	  case 3:
      System.out.println("division"+division(num1,num2));
      break;

      case 4:
      System.out.println("multiply"+multiplication(num1,num2));
      break;
	 
     default:
     System.out.println("invalid input");   
      break;
}

}
}
