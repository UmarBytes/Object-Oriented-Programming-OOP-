import java.util.Scanner;

public class MyBookList {

	public static void menu() {
		System.out.println("\t press 0 to exit.");
		System.out.println("\t press 1 to Add a New Book.");
		System.out.println("\t press 2 to Search by Title.");
		System.out.println("\t press 3 to Search by Price.");
		System.out.println("\t press 4 to Sort by Title.");
		System.out.println("\t press 5 to Sort by Pages.");
		System.out.println("\t press 6 to Display the Most Expensive Book.");
		System.out.println("\t press 7 to Display All Books.");
		System.out.print("Enter your choice: ");
	}//showMenu

	public static boolean add(String[][] books, int currentSize) {
		if (currentSize < books.length){
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter book's title: ");
			books[currentSize][0] = input.nextLine();
			System.out.print("Please enter book's price: ");
			books[currentSize][1] = input.next();
			System.out.print("Please enter book's pages: ");
			books[currentSize][2] = input.next();
			return true;
		}
		else{
			return false;
		}//if
	}//add

	public static int searchByTitle(String[][] books, int currentSize, String key){
		int position = -1;
		for (int i = 0; position == -1 && i < currentSize; ++i) {
			if (books[i][0].equals(key)){
				position = i;
			}//if
		}//for
		return position;
	}//searchByTitle

	public static int searchByPrice(String[][] books, int currentSize, String key){
		int position = -1;
		for (int i = 0; position == -1 && i < currentSize; ++i) {
			if (books[i][1].equals(key)){
				position = i;
			}//if
		}//for
		return position;
	}//searchByPrice

	public static void sortByTitle(String[][] books, int currentSize){
		int startScan, index, minIndex;
		String minTitle;
		String minPrice;
		String minPages;
		for (startScan = 0; startScan < currentSize - 1; startScan++){
			minIndex = startScan;
			minTitle = books[startScan][0];
			minPrice = books[startScan][1];
			minPages = books[startScan][2];
			for(index = startScan + 1; index < currentSize; index++){
				if (books[index][0].compareTo(minTitle) < 0){
					minTitle = books[index][0];
					minPrice = books[index][1];
					minPages = books[index][2];
					minIndex = index;
				}//if
			}//for
			books[minIndex][0] = books[startScan][0];
			books[minIndex][1] = books[startScan][1];
			books[minIndex][2] = books[startScan][2];
			books[startScan][0] = minTitle;
			books[startScan][1] = minPrice;
			books[startScan][2] = minPages;
		}//for
	}//sortByTitle

	public static void sortByPages(String[][] books, int currentSize){
		int startScan, index, minIndex;
		String minTitle;
		String minPrice;
		String minPages;
		for (startScan = 0; startScan < currentSize - 1; startScan++){
			minIndex = startScan;
			minTitle = books[startScan][0];
			minPrice = books[startScan][1];
			minPages = books[startScan][2];
			for(index = startScan + 1; index < currentSize; index++){
				if (books[index][2].compareTo(minPages) < 0){
					minTitle = books[index][0];
					minPrice = books[index][1];
					minPages = books[index][2];
					minIndex = index;
				}//if
			}//for
			books[minIndex][0] = books[startScan][0];
			books[minIndex][1] = books[startScan][1];
			books[minIndex][2] = books[startScan][2];
			books[startScan][0] = minTitle;
			books[startScan][1] = minPrice;
			books[startScan][2] = minPages;
		}//for
	}//sortByTitle

	public static void showMostExpensive(String[][] books, int currentSize){

		int index = 0;
		for (int i = 0; i < currentSize; ++i){
			if (books[i][1].compareTo(books[index][1]) > 0){
				index = i;
			}//if
		}//for

		System.out.println("The details of the most expensive book: ");
		System.out.println("\tTitle\t\tPrice\t\tPages");
		System.out.println("\t" + books[index][0] + "\t\t" + books[index][1] + "\t\t" + books[index][2]);

	}//showMostExpensive

	public static void displayAllBooks(String[][] books, int currentSize){
		if(currentSize > 0){
			System.out.println("\tTitle\t\t\tPrice\t\tPages");
			for (int i = 0; i < currentSize; ++i) {
				System.out.println("\t" + books[i][0] + "\t\t\t" + books[i][1] + "\t\t" + books[i][2]);
			}//for
		}
		else{
			System.out.println("Currently there are no books added.");
		}
	}//displayAllBooks

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 0;
		final int MIN_RANGE = 5;
		while(size >= MIN_RANGE){
			System.out.print("Please enter the size of the array which should be equal or greater to " + MIN_RANGE + ": ");
			size = input.nextInt();
		}//while

		String[][] books = new String[size][3];

		int currentSize = 0;
		int choice = 1;
		while (choice != 0){
			menu();
			choice = input.nextInt();
			if(choice == 1){
				boolean isAdded = add(books, currentSize);
				if(isAdded){
					++currentSize;
				}
				else{
					System.out.println("The list is full. No more books can be added.");
				}//if
			}
			else if (choice == 2){
				System.out.println("Please enter book's title you want to search for:");
				final String TITLE_KEY = input.next();
				int index = searchByTitle(books, currentSize, TITLE_KEY);
				if (index >= 0){
					System.out.println("The book is found at position: " + index);
					System.out.println("Details of the book: ");
					System.out.println("\tTitle\t\t\tPrice\t\tPages");
					System.out.println("\t" + books[index][0] + "\t\t\t" + books[index][1] + "\t\t" + books[index][2]);
				}
				else{
					System.out.println("No book found with the title: " + TITLE_KEY);
				}//if
			}

			else if (choice == 3){
				System.out.println("Please enter book's price you want to search for:");
				final String PRICE_KEY = input.next();
				int index = searchByPrice(books, currentSize, PRICE_KEY);
				if (index >= 0){
					System.out.println("The book is found at position: " + index);
					System.out.println("Details of the book: ");
					System.out.println("\tTitle\t\t\tPrice\t\tPages");
					System.out.println("\t" + books[index][0] + "\t\t\t" + books[index][1] + "\t\t" + books[index][2]);
				}
				else{
					System.out.println("No book found with the price: " + PRICE_KEY);
				}//if
			}

			else if (choice == 4){
				sortByTitle(books, currentSize);
				System.out.println("The list has been sorted by title.");
			}

			else if (choice == 5){
				sortByPages(books, currentSize);
				System.out.println("The list has been sorted by pages.");
			}

			else if (choice == 6){
				showMostExpensive(books, currentSize);
			}

			else if (choice == 7){
				displayAllBooks(books, currentSize);
			}

			else if (choice < 0 || choice > 7){
				System.out.println("You have entered an invalid choice.");
			}//if

		}//while

	}//main
}//class