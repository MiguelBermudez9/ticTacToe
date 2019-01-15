import java.util.Scanner;

public class Game
	{
		static ticTacToe game = new ticTacToe();
		private static Scanner userInput;
		public static void main(String[] args)
			{
				greetings();
				game.display();
				move();
			

			}
		public static void greetings()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name ?");
				String name = userInput.nextLine();
				System.out.println("Hello,"  + name +  "!");
				System.out.println(" Let`s play Tic Tac Toe");
				String a = userInput.nextLine();
			}

		public static void move()
		{
			
		}

	}
