package practice1;

public class Driver {
	
//	public static void printStudents(Student[] studArray) {
//		for (int i=0; i<studArray.length; i++) {
//		System.out.println(
//				studArray[i].getFirstName() + " " +
//				studArray[i].getLastName() + " " +
//				"Score: " + studArray[i].getTotalScore());
//		}
//	}
//	
//	public static void main(String[] args) {
//		
//		Student[] studentArray = new Student[3];
//		
//		studentArray[0] = new Student("John", null, 18.3);
//		studentArray[1] = new Student("Jane", "Dew", 20.5);
//		studentArray[2] = new Student("Albeta", "Dow", 19.3);
//		
//		printStudents(studentArray);
//		
//		studentArray[0] .setFirstName("Ayumi");
//		studentArray[0] .setLastName("Tanaka");
//		
//		// updating the midTermScore
//		studentArray[0] .setMidTermScore(20.5);
//		studentArray[1] .setMidTermScore(19.7);
//		studentArray[2] .setMidTermScore(18.2);
//		
//		// updating the finalScore
//		studentArray[0] .setFinalScore(19.5);
//		studentArray[1] .setFinalScore(18.7);
//		studentArray[2] .setFinalScore(20.2);
//		
//		System.out.println("\nAfter the update");
//		System.out.println("----------------");
//		printStudents(studentArray);
//				
//	}
	
	public static void printBook(Book[] bookArray) {
		for (int i=0; i<bookArray.length; i++) {
		System.out.println(
				bookArray[i].getBookTitle() + " " +
				bookArray[i].getFirstName() + " " +
				bookArray[i].getLastName() + " " +
				bookArray[i].getPublishedYear() + " " +
				bookArray[i].getTotalPrice()
				);
		}
	}

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[3];
		
		bookArray[0] = new Book("ABC", null, "", 1889, 10.0);
		bookArray[1] = new Book("Canadian History", "Jane", "Dew", 2020, 25.5);
		bookArray[2] = new Book("English Grammar", "Albeta", "Dow", 1999, 30.3);
		
		printBook(bookArray);
		
		// updating the info
		bookArray[0] .setFirstName("Ayumi");
		bookArray[0] .setLastName("Tanaka");
		bookArray[1] .setBookTitle("Japanese History");
		bookArray[2] .setPublishedYear(1999);

		// updating the setPrice
		bookArray[0] .setPrice(20.5);
		bookArray[1] .setPrice(19.7);
		bookArray[2] .setPrice(18.2);
		
		System.out.println("\nAfter the update");
		System.out.println("----------------");
		
		printBook(bookArray);
				
	}
}
