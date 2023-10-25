package customer;

/*
 * Student Name: Aira De Castro
 */

/**
 * Class reports customer's age with their according ticket prices
 */
public class Customer {
	private int age;
	/*
	 * no-argument constructor, sets age to zero.
	 */
	public Customer() {
		this(0);
	}
	/*
	 * Parameterized constructor, accepts a value for age
	 */
	public Customer(int age) {
		this.age = age;
	}
	/*
	 * accessor for age
	 */
	public int getAge() {
		return age;
	}
	/*
	 * mutator for age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * method worker to calculate ticket price of a customer
	 */
	public double calculateTicketPrice() {
		double price = -1.0; // set to -1 in case the age is invalid.
		if (age < 0 || age >= 110) { 
			System.out.println("Invalid Age Entered"); // prints invalid age entered
		}
		else if (age >= 0 && age < 3) { // Newborns/infants/toddlers will have free admission 
				price = 0;
			}
		else if (age >= 3 && age <= 13) { // children/youth will will pay $7.99
				price = 7.99;
			}
		else if (age >= 14 && age < 65) { // adults will pay $10.99
				price = 10.99;
			}
		else if (age >= 65 && age < 110) { // senior citizens will pay $8.50
				price = 8.50;
			}
		return price; 
	}
}

