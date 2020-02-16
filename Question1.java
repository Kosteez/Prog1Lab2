import java.util.Scanner;
import java.text.DecimalFormat;

		public class Question1 {
			 private static DecimalFormat df2 = new DecimalFormat("#.##");
		public static void main(String[] args) {

			Scanner	scan = new Scanner(System.in);

			System.out.println("How many kilometers will be travelled? ");
			double kilometers = scan.nextDouble();

			System.out.println("What is the average distance the vehicle runs with 1 liter of gas? ");
			double distance	= scan.nextDouble();

			final double price = 1.16;
			double amount = (kilometers/distance)*price;

			System.out.println("The cost of the trip will be " + df2.format(amount));
		}
}
