import java.util.Scanner;

public class Powerofagivennumber {

	public static void main(String[] args) {
		// The power of a given number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println("Enter the exponent");
		int e=s.nextInt();
		int i;int sum=1;
		for(i=1;i<=e;i++)
		{
			sum=sum*n;
		}
		System.out.printf("%d power %d is %d",n,e,sum);
	}

}
