import java.util.Scanner;

public class Vowelconsonantupeercase {

	public static void main(String[] args) {
		// Vowels, Consonants, Uppercase
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char a=s.next().charAt(0);
		
			
		 if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.print("vowel");
		}
		else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.print("vowel and uppercase");
		}
		else if(a>=65&&a<=90)
		{
			System.out.print("uppercase");
		}
		else
		{
			System.out.print("consonant");
			
		}
}
}