import java.util.Scanner;
public class CH3Q50 {
	public static void main(String[] args) {

	Scanner scan = new Scanner(Sysytem.in);
	System.out.print("Enter two different words ");

	String twowords = scan.nextLine();
	String firstWord = twoWords.substring(0,twoWords.indexOf(' '));
	String secondWord = twoWords.substring(twoWords.indexOf(' ') + 1);

	double count1 = charCount(firstWord);
	double count2 = charCount(secondWord);
		if count1 = count2 {
			System.out.print("You must enter words that a different number of characters. ");
		}

		if count1 > count2 {
			System.out.print(count1);
		}

		if count2 > count1{
			System.out.print(count2);
		}


	}
}
