import java.util.Scanner;

public class Nthfibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int i;
		int c=0;
		for(i=2;i<n;i++)
		{
		c=a+b;
		a=b;
		b=c;
	
		}
		System.out.println(c);
	}

}
