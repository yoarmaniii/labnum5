import java.util.Random;
import java.util.Scanner;
public class labnum5 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println( "Would you like to roll the dice? Yes/No");
		String input = userInput.nextLine();
		String choice = "yes";
		Random rand = new Random();

		while (choice.equalsIgnoreCase("yes")) {
			int  n = rand.nextInt(6)+1;
			int  n2 = rand.nextInt(6)+1;

			System.out.println(n);
			System.out.println(n2);
			System.out.println("roll again? Yes/No");
			choice = userInput.nextLine();
		}
	}

}
