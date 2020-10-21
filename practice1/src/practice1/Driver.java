package practice1;

public class Driver {
	
	public static void printBook(Book[] bookArray) {
		for (int i=0; i<bookArray.length; i++) {
		System.out.println(
				bookArray[i].getBookTitle() + " " +
				bookArray[i].getFirstName() + " " +
				bookArray[i].getLastName() + " " +
				bookArray[i].getPublishedYear() + " "
				);
		}
	}
	
//	public static void printbooks(book[] studArray) {
//		for (int i=0; i<studArray.length; i++) {
//		System.out.println(studArray[i].getFirstName() + " " +
//				studArray[i].getLastName());
//		}
//	}

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book("ABC", null, "", 1889);
		bookArray[1] = new Book("Canadian History", "Jane", "Dew", 2020);
		bookArray[2] = new Book("English Grammar", "Albeta", "Dow", 1999);
		
		printBook(bookArray);
		
		bookArray[0] .setFirstName("Ayumi");
		bookArray[0] .setLastName("Tanaka");
		bookArray[1] .setBookTitle("Japanese History");
		bookArray[2] .setPublishedYear(1999);
		
		System.out.println("\nAfter the update");
		System.out.println("----------------");
		printBook(bookArray);
				
	}
}
