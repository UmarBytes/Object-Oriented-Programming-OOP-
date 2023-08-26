import java.util.Scanner;
public class Pinultimate_word{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a sentance: ");
	String line = input.nextLine();
	String [] word = line.split("[ ]+");
                System.out.println("penultimate word/ second last word:    " + word[word.length - 2]);
	}//main
}//class