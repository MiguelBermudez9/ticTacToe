import java.util.Scanner;
public class ticTacToe
	{
		private static char currentPlayer;
		static char [][] board;
		private static Scanner userInput;
		public static void main(String[] args)
			{
				currentPlayer = 'X';
				board = new char[3][3];
				greetings();
				fillBoard();
				display();
				startGame();
				
				
				
			}
		
		public static void fillBoard()
		{
			for (int i = 0; i < 3; i++)
						{
						  for (int j = 0; j <3; j++)
							  {
								  board [i][j] = ' ';
							  }
						}
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
			System.out.println(" | " + board[0][0] + "   |  " + board[0][1] + "  |  " + board[0][1] + "  |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" | " + board[1][0] + "   | " + board[1][1] + "   | " + board[1][2] + "   |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			System.out.println(" | " + board[2][0] + "   | " + board[2][1] + "   | " + board[2][2] + "   |" );
			System.out.println("_|_____|_____|_____|__");
			System.out.println(" |     |     |     |   ");
			
		}
		
	public static void startGame()
	{
		boolean stillPlaying = true;
		while (stillPlaying)
			{
				userInput = new Scanner(System.in);
				System.out.println("Insert the numbers where you want to place your mark");
				int mark = userInput.nextInt();
				
				if 
			}
		}	
	
	
	
	}
