import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		int i;
		int co=0;
		for(i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				co++;
			}
		
		}
		if(co==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		

	}

}
