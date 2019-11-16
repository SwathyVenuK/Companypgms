import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the binary digit");
		String bin=s.next();
int dec=Integer.parseInt(bin,2);
System.out.println(dec);
	}

}
