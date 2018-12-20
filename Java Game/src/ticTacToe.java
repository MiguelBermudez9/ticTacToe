import java.util.Scanner;
public class ticTacToe
	{
		
		public static void main(String[] args)
			{
				//greetings();
				display();
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
		public static void display()
		{
			System.out.println("    A     B     C");
			System.out.println(" |     |     |     |   ");
			System.out.println(" |     |     |     |   1");
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" |     |     |     |   2");
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" |     |     |     |   3");
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
		}

	}
