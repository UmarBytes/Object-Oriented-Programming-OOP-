public class Identifier_character{
	public static void main(String[] args){
                String test =  "uoY evoL I, 21237006, CGA: 3.51, Next Insha Allah: 3.7>>> ";
	count(test);
     }//mian
	public static void count(String x){
	  char[] ch = x.toCharArray();
	int letters = 0;
	int Spaces = 0;
	int Numbers = 0;
	int SpacialCharacter = 0;
	       for(int i = 0; i < x.length(); i++)
	{
	       if(Character.isLetter(ch[i])){
	letters++;	
	}
	        else if(Character.isSpaceChar(ch[i])){
	Spaces++;
	}
	      else if(Character.isDigit(ch[i])){
	Numbers++;
	}
	else{
	SpacialCharacter++;
	}
	}//for
	System.out.println("Letters are: " + letters);
	System.out.println("Spaces are:  " + Spaces);
	System.out.println("Numbers are: " + Numbers);
	System.out.println("Spacial Characters are: " + SpacialCharacter);
	System.out.println("\n");
         }//method
}//class