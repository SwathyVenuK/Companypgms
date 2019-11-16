import java.util.Scanner;

public class Temperatureincentigradeandconverttofahrenheit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter temperature in Celsius: ");
	        float C = s.nextFloat();
	        float F = C * (9f / 5) + 32;
	        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");

	}

}
