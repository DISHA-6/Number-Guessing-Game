import java.util.Scanner;
public class NumberGuessing{
	public static void
	guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int K = 5;
		int i, guess;
		int score=100;
		String choice = "yes";
		while(choice.equals("yes"))
		{
			System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");

		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations! You guessed the number.");
				System.out.println("Score : "+score);
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println("Opps!! Wrong Guess! The number is greater than " + guess);
				score--;
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println("Opps!! Wrong Guess! The number is less than " + guess);
				score--;
			}
		}

		if (i == K) {
			System.out.println("You have exhausted all the trials.");

			System.out.println("The number was " + number);
			System.out.println("Want to play again(Yes/No)?");
			String ch = sc.next();
			choice = ch;
		}
   }
		}
        
	public static void main(String[] args)
	{
		guessingNumberGame();
	}
}
