import java.util.Scanner;

public class Greatestnum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the 3 number");
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 if(a>=b&&a>=c)
		 {
			 System.out.printf("%d is greater",a);
		 }
		 else if(b>=a&&b>=c)
		 {
			 System.out.printf("%d is greater",b);
		 }
		 else
		 {
			 System.out.printf("%d is greater",c);
			 
		 }

	}

}
