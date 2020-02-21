import java.util.Scanner;
import java.text.DecimalFormat;

public class Question4 {
private static DecimalFormat df2 = new DecimalFormat("#");
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the temperature in Celsius in the past 3 days. Press enter after each one. ");
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double c = scan.nextDouble();
	double average = (a+b+c)/3;

	System.out.println("The average temperature in the past 3 days was " + df2.format(average) + " Celsius.");
	}
}