import java.util.Scanner;

public class Insertingelementinarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int c[]=new int[n];
		int i;
		
		for(i=0;i<n;i++)
		{
			c[i]=s.nextInt();
		}
		System.out.println("enter the position wants to be inserted");
        int p=s.nextInt();
		System.out.println("enter the elements wants to be inserted");
         int a=s.nextInt();
		for(i=0;i<p-1;i++)
		{ 
			System.out.println(c[i]);
			
			
		}
		System.out.println(a);
         for(i=p-1;i<n;i++)
 		{ 
 			System.out.println(c[i]);
 			
 			
 		}
	}

}
