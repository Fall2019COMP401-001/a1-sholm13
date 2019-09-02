package a1;

import java.util.Scanner;

	
public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Your code follows here.
		
		// Find number of customers
		int numCust = scan.nextInt();
		
		// Loop to add customer's first and last names to arrays
		for (int i = 0; i < numCust; i++) {
			String first = scan.next();
			String last = scan.next();
			int numItems = scan.nextInt();
			double totalCost = 0.0;
			
			// For loop to count items per customer and find their total cost
			for (int j=0; j < numItems; j++) {
				int itemCount = scan.nextInt();
				String itemName = scan.next();
				double price = itemCount * scan.nextDouble();
				totalCost += price;
				
			}
			
			System.out.println( first.charAt(0) + ". "+ last + ": "+ String.format("%.2f", totalCost));
			
			
					
		}	
		scan.close();
	}
	
}
