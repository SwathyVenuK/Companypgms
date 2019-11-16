import java.util.Scanner;

public class Lengthofstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String a=s.next();
		int l=a.length();
		System.out.printf("%d is the length of the string",l);
	}

}
