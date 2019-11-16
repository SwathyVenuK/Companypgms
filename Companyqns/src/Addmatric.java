import java.util.Scanner;

public class Addmatric {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers od elements in row");
		int m=s.nextInt();
		System.out.println("Enter the numbers od elements in row");
		int n=s.nextInt();
		
		int a[][]=new int[m][n];
		
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		int i,j = 0;
		int sum=0;
		System.out.println("\nEnter the 1st matrix"); 
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				
			
			a[i][j]=s.nextInt();
		
		}
		}
		System.out.println("Enter the 2nd matrix"); 
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
					
			b[i][j]=s.nextInt();
		}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+" ");  
		}
			System.out.println();
	}
		
		
	}
}

