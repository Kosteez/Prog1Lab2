import java.util.Scanner;
public class CH3Q51 {
	public static void main (String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a domain name: ");

	String domain = scan.nextLine();

	System.out.print("www." + domain + ".com");

	}
}