/*
QUESTION:  Write a Java method to count all vowels in a string.
Input the string: w3resource
Expected Output:
Number of  Vowels in the string: 4
*/
import java.util.Scanner;
class Methods_Vowels{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter the String :  ");
        String sar = input.nextLine();

        System.out.println("The Number of Vowels in the String : " + Count_Vowels(sar));
    }

    public static int Count_Vowels(String star) {
        int count = 0;
        for (int i = 0; i < star.length(); i++) {
            if (star.charAt(i) == 'a' || star.charAt(i) == 'e' || star.charAt(i) == 'i' || star.charAt(i) == 'o' || star.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}

