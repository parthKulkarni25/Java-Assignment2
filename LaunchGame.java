import java.util.Scanner;

class Guesser{
	int guessNum;
	public int guessNumber(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Player{
	int pguessNum;
	public int guessNumber(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Player guess the number");
		pguessNum=scan.nextInt();
		return pguessNum;	
	}
}
class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();	
	}
	public void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players guess correct number");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player1 & Player2 guess correct Number");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 & Player3 guess correct Number");
			}
			else
			    System.out.println("Player 1 won the game");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 & Player 3 guess correct Number");
			}
			else
			    System.out.println("Player 2 won the game");
		}
		else if(numFromGuesser==numFromPlayer3) 
		{
			System.out.println("Player 3 won the game");
		}
		else
			System.out.println("Game lost Try again");
		
	}
}
public class LaunchGame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
