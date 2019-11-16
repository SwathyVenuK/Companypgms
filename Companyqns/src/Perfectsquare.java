import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		double sqrt=Math.sqrt(n);
		double sum=sqrt*sqrt;
		if(a==sum)
		{
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("not perfect square");
		}
	}

}
