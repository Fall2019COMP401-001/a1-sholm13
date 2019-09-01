package a1;

import java.util.Scanner;

	
public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Your code follows here.
		
		int numCust = scan.nextInt();
		for (int i = 0; i < numCust; i++) {
			String f = scan.next();
			String last = scan.next();
			String itemName = "";
			int numItems = scan.nextInt();
			
			for (i=0; i < numItems; i++) {
				double price = 0.0;
				itemName = scan.next();
				double totalCost = 0.0;
				price = numItems * scan.nextDouble();
				totalCost += price;
			}
			scan.close();
			System.out.println( f.charAt(0) + last + String.format("%.2f, totalCost"));
				
					
		}	
		
	}
}
