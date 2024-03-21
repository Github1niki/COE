import java.util.*;
public class Main1
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);		
	    System.out.println("enter 1st number:");
	    int a=sc.nextInt();
	    System.out.println("enter 2nd number:");
	    int b=sc.nextInt();
	    System.out.println("enter 3rd number:");
	    int c=sc.nextInt();
	    System.out.println("enter 4th number:");
	    int d=sc.nextInt();
	    int sum=a+b+c+d;
	    System.out.println("Sum of numbers is:"+sum);
	    System.out.println("Average of given numbers is:"+sum/4);
	    
	}
}
