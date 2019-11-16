import java.util.Scanner;

public class Casechange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
		if(c>=65&&c<=90)
		{
			 System.out.println(Character.toLowerCase(c));
		}
		else if(c>=97&&c<=122)
		{
			  System.out.println(Character.toUpperCase(c));
		}
	}

}
