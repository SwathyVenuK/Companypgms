import java.util.Scanner;

public class Arclength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radious");
	int	r=s.nextInt();
	System.out.println("Enter the angle value");
	float a=s.nextFloat();
	double sc=(2*3.14*r)*a/360;
	System.out.printf("%.2f is the arc length",sc);

	}

}
