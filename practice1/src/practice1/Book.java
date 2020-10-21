package practice1;

public class Book {
	private String bookTitle;
	private String firstName;
	private String lastName;
	int publishedYear;

	public Book(String title, String fName, String lName, int year) {
		if(title == "") {
			bookTitle = "Unkown";
		} else {
			bookTitle = title;
		}
		if (fName == "") {
			firstName = "Unknown";
		} else {
			firstName = fName;
		}
		if (lName == "") {
			lastName = "Unknown";
		} else {
			lastName = lName;
		}
		if(year < 1900) {
			publishedYear = 1900;
		} else {
			publishedYear = year;
		}
	}
	
	/*
	 *  @return title
	 */
	public String getBookTitle() {
		return bookTitle;
	}
	/*
	 *  @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 *  @return last name
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 *  @return year
	 */
	public int getPublishedYear() {
		return publishedYear;
	}
	
	/*
	 *  Set the book title
	 */
	public void setBookTitle(String title) {
		if(title == "" || title == null) {
			bookTitle = "Unkown";
		} else {
			bookTitle = title;
		}
	}
	/*
	 *  Set the first name
	 */
	public void setFirstName(String fName) {
		if(fName == "" || fName == null) {
			firstName = "John";
		} else {
			firstName = fName;
		}
	}
	/*
	 *  Set the last name
	 */
	public void setLastName(String lName) {
		if(lName=="" || lName == null) {
			lastName = "Doe";
		} else {
			lastName = lName;
		}
	}
	/*
	 *  Set the year
	 */
	public void setPublishedYear(int year) {
		if(year < 1900) {
			publishedYear = 1900;
		} else {
			publishedYear = year;
		}
	}
}
