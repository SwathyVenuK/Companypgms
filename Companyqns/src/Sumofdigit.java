import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int sum=0;
		int su;
		while(n!=0)
		{
			 su=n%10;
			sum=sum+su;
			n=n/10;
		}
		System.out.printf("%d is the sum",sum);
	}

}
