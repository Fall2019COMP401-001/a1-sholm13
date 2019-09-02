package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Creating arrays to keep count of items, amounts, and customers
		int countOfItems = scan.nextInt();
		String[] itemName = new String[countOfItems];
		double[] itemPrice = new double[countOfItems];
		int[] itemOccurances = new int[countOfItems];
		String[] customerItems = new String [countOfItems];
		int [] customerItemOccurances = new int [countOfItems];
		
		
		
		// Running though items to add to arrays of item names and prices
		
		for (int x = 0; x < countOfItems; x++) {
			itemName[x] = scan.next();
			itemPrice[x] = scan.nextDouble();
			
		}
		// finding total number of customers
		int countOfCustomers = scan.nextInt();
	
		// Arrays of customer names and the items each purchased
		for (int i = 0; i < countOfCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int countOfTotalItems = scan.nextInt();
			
			// For loop through each item purchased by a customer
			for (int j = 0; j < countOfTotalItems; j++) {
				int quantityOfItem = scan.nextInt();
				String nameOfItem = scan.next();
				customerItems[j] = nameOfItem;
				
				// For loop to count occurances of item per customer
				for (int k = 0; k < itemName.length; k++) {
					if(itemName[k].equals(nameOfItem)) {
						itemOccurances[k] += quantityOfItem;
						customerItemOccurances[k] += 1;
					}
					
						
					}
					
				}
		
	
			
			// For loop to have print statement for each item
			for (int m = 0; m < countOfTotalItems; m++) {
				if (customerItemOccurances[m] == 0) { 
					System.out.println("No customers bought " + itemName[m]);
				} else {
					System.out.println(customerItemOccurances[m] + " customers bought " 
							+ itemOccurances + " " + itemName[m]);
				}
				System.out.println(customerItemOccurances );
			}
		}
		
					
	}
}


