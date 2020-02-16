import java.util.Scanner;
	
	public class Question3 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter any ammount of seconds: ");
	
	int seconds = scan.nextInt(); 
	int sec = seconds % 60;
	int hr = seconds / 60;
	int min = hr % 60;
	hr = hr / 60;

	System.out.print(min + ":" + sec);
	System.out.print("\n");
	
	}
}