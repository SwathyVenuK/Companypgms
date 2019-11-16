import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=n;
		int sum=0;
		int i;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(a==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println(" Not a perfect number");
		}
	}

}
