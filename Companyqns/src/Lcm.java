import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=s.nextInt();
		System.out.println("enter 2nd number");
		int b=s.nextInt();
		int max=(a>b)?a:b;
		int i;
		int lcm=0;
	while(a!=0)
		{
			if(max%a==0&&max%b==0)
			{
				lcm=max;
				break;
			}
			max++;
		}
System.out.println("LCM="+lcm);
	}

}
