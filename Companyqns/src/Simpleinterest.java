import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the priciple amount");
		float p=s.nextFloat();
		System.out.println("Number of years");
		int n=s.nextInt();
		System.out.println("Rate of interest");
		float r=s.nextFloat();
		double sm=(p*n*r)/100;
		System.out.printf("%.2f is the simple interest",sm);
	}

}
