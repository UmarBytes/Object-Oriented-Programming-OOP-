import java.util.Scanner;
public class CharactersLab1{
       public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String word = " ";

		System.out.print("Enter the word :");
		word=in.nextLine();
		
		wordsInfo(word);
 

	}
	public static void wordsInfo(String word){

		int wordLength = word.length();
		System.out.println(wordLength + " Characters ");
		
		int vowelsCount = 0;
		for(int i=0 ; i < wordLength ; i++){
		
		 int character = word.toLowerCase().charAt(i);
		if ( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || 	character == 'y'){
				vowelsCount++;	
			
			}
		}

			System.out.println(vowelsCount + " Vowels "); 		

		}
	}
      
 