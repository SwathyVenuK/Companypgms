import java.util.Scanner;

public class Hypo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the base of the Triangle");
		int b=s.nextInt();
		System.out.println("Enter the height of the Triangle");
		int h=s.nextInt();
		double p=(b*b)+(h*h);
		double hyp=Math.sqrt(p);
		System.out.printf("%d is the hypotenuse",(int)hyp);
	}

}
