package practice1;

public class Book {
	private String bookTitle;
	private String firstName;
	private String lastName;
	int publishedYear;
	double price;

	public Book(String bookTitle, String firstName, String lastName, int publishedYear, double price) {
		if(bookTitle == "" || bookTitle == null) {
			this.bookTitle = "Unkown";
		} else {
			this.bookTitle = bookTitle;
		}
		if (firstName == "" || firstName == null) {
			this.firstName = "John";
		} else {
			this.firstName = firstName;
		}
		if (lastName == "" || lastName == null) {
			this.lastName = "Doe";
		} else {
			this.lastName = lastName;
		}
		if(publishedYear < 1900) {
			this.publishedYear = 1900;
		} else {
			this.publishedYear = publishedYear;
		}if(price > 0) {
			this.price = price;
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
	 *  @return price
	 */
	public double getPrice() {
		return price;
	}
	
	
	
	/*
	 *  Set the book title
	 */
	public void setBookTitle(String bookTitle) {
		if(bookTitle == "" || bookTitle == null) {
			bookTitle = "Unkown";
		} else {
			this.bookTitle = bookTitle;
		}
	}
	/*
	 *  Set the first name
	 */
	public void setFirstName(String firstName) {
		if(firstName == "" || firstName == null) {
			firstName = "John";
		} else {
			this.firstName = firstName;
		}
	}
	/*
	 *  Set the last name
	 */
	public void setLastName(String lastName) {
		if(lastName=="" || lastName == null) {
			lastName = "Doe";
		} else {
			this.lastName = lastName;
		}
	}
	/*
	 *  Set the year
	 */
	public void setPublishedYear(int publishedYear) {
		if(publishedYear < 1900) {
			publishedYear = 1900;
		} else {
			this.publishedYear = publishedYear;
		}
	}
	/*
	 *  Set the price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/*
	 *  Set the total price
	 */
	public double getTotalPrice() {
		double total = 
				this.price * 1.12;
		return total;
	}
}
