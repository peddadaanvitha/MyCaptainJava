import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the range:");
		int n=s.nextInt();
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++)
		{
		    int c=a+b;
		    System.out.print(" "+c);
		    a=b;
		    b=c;
		}
	}
}
