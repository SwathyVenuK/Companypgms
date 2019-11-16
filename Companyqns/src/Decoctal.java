import java.util.Scanner;

public class Decoctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int dec=s.nextInt();
		String oct="";
		if(dec==0)
		{
			System.out.println("octal number is 0");
			
		}
		else
		{
			while(dec!=0)
			{
				int a=dec%8;
				oct=a+oct;
				dec=dec/8;
			}
			System.out.println("octal number is "+oct);
		}

	}

}
