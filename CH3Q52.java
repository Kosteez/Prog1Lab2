import java.util.Scanner;
public class CH3Q52 {
	public static void main (String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any word: ");
	String word = scan.nextLine();

	System.out.println("The upper case word is: " + word.toUpperCase());

	System.out.println("The lower case word is: " + word.toLowerCase());

	System.out.println("The original word is: " + word);

	}
}
