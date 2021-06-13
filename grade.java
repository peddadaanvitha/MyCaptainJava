import java.util.*;
public class GradeCal {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		double p=s.nextDouble();
		if(p>0&&p<40)
			p=41;
		switch((int)p/10) 
             {
		case 9: 
                            System.out.println("O");
		            break;
		case 8:
			    System.out.println("A");
			    break;
		case 7: 
			    System.out.println("B");
			    break;
		case 6: 
			    System.out.println("C");
		      	    break;
		case 5:
			    System.out.println("D");
		            break;
		case 4:
			    System.out.println("F");
		            break;
		default:
			    System.out.println("Invalid input");
			    break;
		}
	}
}
