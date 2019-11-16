import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radious");
		double r=s.nextDouble();
		double c=2*3.14*r;
		System.out.printf("%.2f is the circumference",c);
	}

}
