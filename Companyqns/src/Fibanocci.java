import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int i;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<n;i++)
		{
		int	c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
		
	}

}
