import java.util.Scanner;

public class Prifactor {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int m=n;
		int i,j;
		int f;
	int sum=0;
		System.out.println("prime factores are");
		for(i=2;i<=n;i++)
		{
			f=0;
		
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
				
			}
			if(f==0)
			{
				if(m%j==0)
				{
					
				
			
				System.out.println(i);
			}
			}
	}

	}
}
