import java.util.Scanner;
public class Years {
	    public static void main(String[] Strings)
	    {
	        double min = 60 * 24 * 365;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Input the number of minutes: ");
	        double min1 = s.nextDouble();
	        long years = (long) (min1 / min);
	        int days = (int) (min1 / 60 / 24) % 365;
	        System.out.println((int) min1 + " minutes is approximately " + years + " years and " + days + " days");
	    }
}
