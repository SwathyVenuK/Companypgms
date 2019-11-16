import java.util.Scanner;

public class Charactervowelorconsonant {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char a=s.next().charAt(0);
		if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.print("vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
	}

}
