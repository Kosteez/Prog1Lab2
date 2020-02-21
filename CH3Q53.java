import java.util.Random;
import java.lang.Math;

public class CH3Q53 {
	public static void main(String[] args) {

		Random rand = new Random();
		int randomInt1 = rand.nextInt(100);
		int randomInt2 = rand.nextInt(100);

		System.out.println("First number: " + randomInt1);
		System.out.println("Second number: " + randomInt2);

		if (randomInt1 < randomInt2)
			System.out.println(randomInt1);

		if (randomInt2 < randomInt1)
			System.out.print(randomInt2);

	}
}
