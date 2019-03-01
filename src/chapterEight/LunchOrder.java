package chapterEight;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class LunchOrder {
	
	static NumberFormat formatter = new DecimalFormat("#0.00");

	static Food Hamburger = new Food(185, 9, 33, 1, "hamburger");
	static Food  Salad = new Food(200, 1, 11, 5, "salad     ");
	static Food  Fires = new Food(130, 11, 36, 4, "French Fries");
	static Food  Soda = new Food(95, 0, 38, 0, "soda     ");
	
	static private double total = 0;
	
	//french fries $1.30 11 36 4
	//soda $0.95 0 38 0

	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iteam\t\tPrice\t\tFat(g)\t\tCarbohydrates(g)\tFiber(g)");
		
		System.out.println(Hamburger);
		System.out.println(Salad);
		System.out.println(Fires);
		System.out.println(Soda);
		
		System.out.println("Enter Number of hamburgers: ");
		total += (Hamburger.getPrice()) * (input.nextInt()); 
		System.out.println("Each Hamburger has " + Hamburger.getFat() + "g of fat " + Hamburger.getCarb() + "g of carbs, and "  + Hamburger.getFiber() + "g of fiber ");
		
		
		System.out.println("Enter Number of salads: ");
		total += (Salad.getPrice()) * (input.nextInt()); 
		System.out.println("Each salad has " + Salad.getFat() + "g of fat " + Salad.getCarb() + "g of carbs, and "  + Salad.getFiber() + "g of fiber ");
		
		
		System.out.println("Enter Number of fries: ");
		total += (Fires.getPrice()) * (input.nextInt()); 
		System.out.println("Each French Fries have " + Fires.getFat() + "g of fat " + Fires.getCarb() + "g of carbs, and "  + Fires.getFiber() + "g of fiber ");
		
		System.out.println("Enter Number of sodas: ");
		total += (Soda.getPrice()) * (input.nextInt()); 
		System.out.println("Each soda has " + Soda.getFat() + "g of fat " + Soda.getCarb() + "g of carbs, and "  + Soda.getFiber() + "g of fiber ");
		
		System.out.println("Your order comes to: $" + formatter.format(total/100));
		
	}
	
}