package chapterSeven;

import java.util.Scanner;

public class PerfectInteger {

	public static void main(String args[]) {
		/*
		 * we need to take all integers up to 100 factor each number add each factor to
		 * see if the sum is the same as the original number
		 */
		Scanner input = new Scanner(System.in);
		int sum = 0;

		for (int x = 1; x <= 100; x++) {

			for (int factor = 1; factor <= x; factor++) {

				if (x % factor == 0) {
					sum = sum + factor;
					//System.out.println("factor: " + factor);
				}//
			}
			
			
			
			if (x > 1) {
				sum = sum - x;
			}
			//System.out.println("sum " + sum);
			if (isPerfect(sum, x) == true) {
				System.out.println(x + " is perfect");
			
				
			}
			//System.out.print("\n");
			sum = 0;
		}

	}

	public static boolean isPerfect(int number, int sums) {
		if (number == sums) {
			return true;
		} else
			return false;
	}
}
