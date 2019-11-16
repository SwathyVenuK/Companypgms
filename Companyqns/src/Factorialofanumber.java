import java.util.Scanner;

public class Factorialofanumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int fact=1;
		int i;
		if(n==0)
		{
			System.out.println("1 is the factorial");
		}
		else
		{
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
System.out.printf("%d is the factorial of %d",fact,n);
	}
	}
}
