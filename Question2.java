import java.util.Scanner;
import java.text.DecimalFormat;

//Calling two decimal formattings.
	public class Question2 {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static DecimalFormat df3 = new DecimalFormat("#");
	public static void main(String[] args) {

//Importing a scanner.	
	Scanner scan = new Scanner(System.in);

	System.out.println("How much do you weigh in pounds? ");
	double lbs = scan.nextDouble();

	System.out.println("How tall are you in feet? (#.#) ");
	double feet = scan.nextDouble();

//Writing the required formulas.
	final double kg = lbs/2.205;
	final double meters = feet/3.281;
	double BMI = (kg/(meters*meters));

	System.out.println("You weigh " + df2.format(kg) + " kilograms.");
	System.out.println("You are " + df2.format(meters) + " meters tall.");
	System.out.println("Your BMI (Body Mass Index) is " + df3.format(BMI));

	}
	}