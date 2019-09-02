package a1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
		
	}
	

	// Separate class to run
	public static void process(Scanner scan) {
		
		// Creating arrays and variables that will be used later
		
		int countOfItems = scan.nextInt();
		String[] itemName = new String[countOfItems];
		double[] itemPrice = new double[countOfItems];
		int biggestIndex = 0;
		int smallestIndex = 0;
		double total = 0.0;
		
		// Adding item names and prices to arrays
		for (int x = 0; x < countOfItems; x++) {

			itemName[x] = scan.next();
			itemPrice[x] = scan.nextDouble();
			
	
		
			
		}
		
		// Counting customers
		
		int countOfCustomers = scan.nextInt();
		double amount = 0.0;
		double average = 0.0;
	
		// Creating arrays to track customer names and amounts paid
		String[] customerFirstName = new String[countOfCustomers];
		String[] customerLastName = new String[countOfCustomers];
		double[] customerAmount = new double[countOfCustomers];
		
		
		// Adding customer names to arrays
		for (int i = 0; i < countOfCustomers; i++) {
			String firstName = scan.next();
			customerFirstName[i] = firstName;
			String lastName = scan.next();
			customerLastName[i] = lastName;
			int countOfTotalItems = scan.nextInt();
			
			// Counting items purchased per customer
			for (int j = 0; j < countOfTotalItems; j++) {
				int quantityOfItem;
				quantityOfItem = scan.nextInt();
				String nameOfItem;
				nameOfItem = scan.next();
				
				
				// Calculating amount paid per customer
				for (int k = 0; k < itemName.length; k++) {
					if(itemName[k].equals(nameOfItem)) {
						double cost = itemPrice[k];
						customerAmount[i] += (cost * quantityOfItem);
						total += (cost * quantityOfItem);
						
					}
					
					
				}
				
			}
				
			// Finding average paid	
			average = (total / countOfCustomers);
		}
		
		// Finding biggest and smallest spenders
		double biggestSoFar = 0.0;
		for (int l = 0; l < countOfCustomers; l++) {
			if (customerAmount[l] > biggestSoFar) {
				biggestSoFar = customerAmount[l];
				biggestIndex = l;
			}
		}
		double smallestSoFar = 198765.0;
		for (int m = 0; m < countOfCustomers; m++) {	
			if (customerAmount[m] < smallestSoFar) {
				smallestSoFar = customerAmount[m];
				smallestIndex = m ;
			}
		}
		
				
		
		System.out.println("Biggest: " + customerFirstName[biggestIndex] 
				+ " " + customerLastName[biggestIndex] + " (" 
				+ String.format("%.2f" , (customerAmount[biggestIndex])) + ")");
		System.out.println("Smallest: " + customerFirstName[smallestIndex] 
				+ " "+ customerLastName[smallestIndex] + " (" 
				+ String.format("%.2f" ,(customerAmount[smallestIndex])) + ")");
		System.out.println ("Average: " + String.format("%.2f", average));
}
	}
// Worked with Kelsey Snelgrove on this part to debug


