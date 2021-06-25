import java.util.*;
public class Main
{
   public static int Fibo(int n)
   {    
        int a = 0, b = 1;
        if (n == 0)
            return a;
        if(n == 1 || n == 2)
		    return b;
        return Fibo(n-2) + Fibo(n-1);
   }    
    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the range:");
		int n=s.nextInt();
		for(int i = 0; i < n; i++)
			  System.out.print(Fibo(i) +" ");
	}
}
