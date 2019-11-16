import java.util.Scanner;

public class Secondlargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the 3 number");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 int i;
		 int x;
		if(a>=b&&a>c)
		{
			if(b>=c)
			{
				x=b;
			}
			else
			{
				x=c;
			}
		}
		else if(b>=a&&b>=c)
		{
			if(a>=c)
			{
				x=a;
			}
			else
			{
				x=c;
			}
		}
		else if(a>=b)
		{
			x=a;
		}
		else
		{
			x=b;
		}
		System.out.printf("%d is 2nd largest",x);
	}

}
