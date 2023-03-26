import java.util.Scanner;
public class   StudentLab2{
	public static void main(String[] args){

	Scanner in = new Scanner(System.in);

	System.out.print("\nEnter size of the array: ");
	int size = in.nextInt();

	String[] nameArray = new String[size];
	int[] idArray = new int[size];

	System.out.print("\nEnter length of Id: ");
	int idLength = in.nextInt();

	while(idLength < 5 || idLength > 9){
	
		System.out.print("\nLength should be 5 to 9\nEnter length of Id: ");
		idLength = in.nextInt();
	}

	fillArrays(nameArray, idArray, idLength);
}

	public static void fillArrays(String[] nameArray, int[] idArray, int idLength){

		Scanner in = new Scanner(System.in);
		boolean flag = false;
	
		for(int i = 0 ; i < nameArray.length ; i++){
	
		System.out.print("\nEnter the id of the student at index [" + i + "]: ");
		idArray[i] = in.nextInt();

		flag = isIdValid(idArray[i], idLength);

		while(flag == false){
		
			System.out.println("	Invalid id length!");

			System.out.print("Enter the id of the student at index [" + i + "]: ");
			idArray[i] = in.nextInt();

			flag = isIdValid(idArray[i], idLength);
		}
		System.out.print("Enter the name of the student at index [" + i + "]: ");
		nameArray[i] = in.nextLine();
	}

	System.out.print("\n\nEnter the id of the student: ");
	int id = in.nextInt();

	String name = getNameOfStudent(nameArray, idArray, id);

	System.out.println("\nName: " + name);
	}	
	public static boolean isIdValid(int id, int idLength){
		int minRange = 1; 
		for (int i = 0; i < idLength - 1; i++){
	
			minRange *= 10;
		}
		int maxRange = (minRange * 10) - 1; 
	
		if(id >= minRange && id <= maxRange)
		return true; 
	else
		return false;
	}

	public static String getNameOfStudent(String[] nameArray, int[] idArray, int id){

	for(int i = 0; i<nameArray.length; i++){

		if(id == idArray[i])
			return nameArray[i];
	}
	
	return "Not Found";
	}
		}