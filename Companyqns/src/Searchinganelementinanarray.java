import java.util.Scanner;

public class Searchinganelementinanarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		int flag = 0;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter element wants to be search");
		int b=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==b)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.printf("%d is present in the position %d",b,i-1);
		}
		else
		{
			System.out.printf("not present");
		}
	}

}
