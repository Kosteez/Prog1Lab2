import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name (last, first): ");

		String fullname = scan.nextLine();
		String last = fullname.substring(0,fullname.indexOf(','));
		String first = fullname.substring(fullname.indexOf(',') + 2);

		first = (first.substring(0,1)).toUpperCase() + first.substring(1);
		last = (last.substring(0,1)).toUpperCase() + last.substring(1);

		System.out.print("Formatted name: " + first + last);


	}
}
