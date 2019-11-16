import java.util.Scanner;

public class Smallestnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
int a[]=new int[n];
	int i,j;
	int temp;
	int min=0;
	for(i=0;i<n;i++)
		
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
		if(a[i]<a[i+1])
		{
			min=a[i];
		}	
		
	}
	min++;
	System.out.println(min);
	}
	
}