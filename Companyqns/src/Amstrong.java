import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
int n=s.nextInt();
int a=n;
int b=n;
int count=0;
double sum=0;
int r;
while(n!=0)
{
n=n/10;
count++;
}
while(b!=0)
{
	r=b%10;
	sum=sum+Math.pow(r,count);
b=b/10;

}
if(sum==a)
{
	System.out.println("amstrong");
}
else
{
	System.out.println(" not amstrong");
}

}
}
