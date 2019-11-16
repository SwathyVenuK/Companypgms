import java.util.Scanner;

public class Fibanoccireverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		
		int c[]=new int[n];
		int a=0;
		int b=1;
		c[0]=0;
		c[1]=1;
		int i,j;
		for(i=2;i<n;i++)
		{
		c[i]=a+b;
		a=b;
		b=c[i];
		}
		for(j=n-1;j>=0;j--)
		{
		System.out.printf("%d ", c[j]);
		}
	}}


