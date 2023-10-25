package customer;

/*
 * Student Name: Aira De Castro
 */

import java.util.Scanner; // imports Scanner

/*
 * Class reports program
 */
public class Program {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		Customer customer = new Customer();
		int age;
		double price;
		
		System.out.println("Enter your age: ");
		age = keyboard.nextInt();
		
		customer.setAge(age);
		price = customer.calculateTicketPrice(); // calculates ticket price from customer class 
		
		if (price != -1.0) {
		System.out.printf("Ticket price: $%.2f\n", price); // shows ticket price unless it is invalid
		}
		System.out.println("Program by Aira De Castro"); // shows who programmed and modified the code
		
		keyboard.close(); // closes scanner
	}
}