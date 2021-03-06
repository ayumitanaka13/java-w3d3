/*
 * basic requirements for the class
 * Instance Variables
 * Constructor
 * Getter Methods
 * Setter Methods
 */

package practice1;

public class Student {
	
	private String firstName;
	private String lastName;
	private double midTermScore; // 30%
	private double finalScore; // 70%

	public Student(String firstName, String lastName, double score) {
		if (firstName == "" || firstName == null) {
			this.firstName = "Unknown";
		} else {
			this.firstName = firstName;
		}
		if (lastName == "") {
			this.lastName = "Unknown";
		} else {
			this.lastName = lastName;
		}
		this.midTermScore = 0;
		this.finalScore = 0;
	}
	
	// Instance variable + this.
	
	
	// GETTER
	
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
	 * @ return mid score
	 */
	public double getMidTermScore() {
		return this.midTermScore;
	}
	
	/*
	 * @ return final score
	 */
	public double getfinalScore() {
		return this.finalScore;
	}
	
	// SETTER
	
	/*
	 *  Set the first name
	 *  @param firstName
	 */
	public void setFirstName(String firstName) {
		if(firstName == "" || firstName == null) {
			this.firstName = "Unkown";
		} else {
			this.firstName = firstName;
		}
	}
	/*
	 *  Set the last name
	 *  @param lastName
	 */
	public void setLastName(String lastName) {
		if(lastName=="" || lastName == null) {
			this.lastName = "Unkown";
		} else {
			this.lastName = lastName;
		}
	}
	
	/*
	 * Set the score
	 * @param midTermScore
	 */
	public void setMidTermScore(double midTermScore) {
		this.midTermScore = midTermScore;
	}
	/*
	 * Set the score
	 * @param finalScore
	 */
	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}
	/*
	 * calculate total score
	 * @return total score
	 */
	public double getTotalScore() {
		double total = 
				(this.midTermScore * 30) + (this.finalScore * 70) / 100;
		return total;
	}
}