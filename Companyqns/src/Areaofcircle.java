import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radious");
		int r=s.nextInt();
		double area=3.14*r*r;
		System.out.printf("Area of circle is %.2f ",area);
	}

}
