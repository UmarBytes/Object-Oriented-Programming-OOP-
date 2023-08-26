import java.util.Scanner;
import java.util.Random;
class Game{
	int number;
	int noOfGuesses;
	int InputNubmer;
	Game()
		{
		Random rand = new Random();
		this.number = rand.nextInt(100);
		}
	void takeUserInput()
	{	
		System.out.print("Guesses the Number : ");
		Scanner input = new Scanner(System.in);
		InputNubmer =  input.nextInt();
	}
	boolean isCorrectNumber()
	{
	        noOfGuesses++;
	if(InputNubmer == number)
	{
	System.out.format("You Guess the Right Number, it was %d\n you Guesses in %d attempts," ,number, noOfGuesses);
	return true;
	}
	 else if(InputNubmer < number){
		System.out.println("Too Low.......");
	}
	else if(InputNubmer > number){
		System.out.println("Too High........");
	}
	return false;
	
	}
}
public class GussNumberGame{
	public static void main(String[] args){
		Game obj = new Game();
		boolean b = false;
		while(!b)
		{
			obj.takeUserInput();
			b = obj.isCorrectNumber();
		}
	}
}