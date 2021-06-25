import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please insert any number");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
		    if(n%i==0)
		        count++;
		}
		if(count==2)
		    System.out.println(n+ " is prime number");
		else
		    System.out.println(n+ " is not prime number");
	}
}
