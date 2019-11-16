import java.util.Scanner;

public class Stringtransformation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String a=s.next();
		System.out.println("enter the element wants to replace");
		String r=s.next();
		
		int l=a.length();
		int i;
		for(i=0;i<l;i++)
		{
		a=a.replaceAll(r, "*");
		}
		System.out.println(a);
		
		
	}

}
