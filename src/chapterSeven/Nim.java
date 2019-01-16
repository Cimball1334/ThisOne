package chapterSeven;

import java.util.Scanner;

public class Nim {
	static Scanner input = new Scanner(System.in);

	public static void main(String args[]) {
		int totalStones = (int) (Math.random() * 15) + 15;

		while (totalStones > 0) {

			// boolean turn = false;// false = players turn, true = cpu turn
			System.out.println("There are " + totalStones + "stones left. How many would you like?");
			totalStones = totalStones - player(totalStones);

			if (totalStones <= 0) {
				System.out.println("THE CPU WINS!!!!!!");
				break;
			}

			System.out.println("There are " + totalStones + "stones left. How many would you like?");
			totalStones = totalStones - cpu(totalStones);

			if (totalStones <= 0) {
				System.out.println("THE PLAYER WINS!!!!!!");
				break;
			}

		}
	}

	public static int player(int totalStones) {
		// handles players turn
		int takenStones = input.nextInt();
		if (isValidEntry(takenStones, totalStones) == true) {
			return takenStones;
		} else {
			System.out.println("Invalid Entry, try again");
			player(totalStones);
			return 0;
		}

	}

	public static int cpu(int totalStones) {
		// handles computers turn
		int cpuTakenStones = drawStones(totalStones);
		System.out.println("The CPU takes " + cpuTakenStones);
		return cpuTakenStones;

	}

	public static int drawStones(int totalStones) {
		int x = (int) (Math.random() * 3) + 1;
		// handles computer randoms
		if (isValidEntry(x, totalStones) == true) {
			return x;
		} else {
			cpu(totalStones);
			return 0;

		}

	}

	public static boolean isValidEntry(int entry, int totalStones) {
		// checks to make sure between 1-3 stones
//		if (totalStones == 3) {
//			if (entry > 0 && entry < 4) {
//				return true;
//			}else {
//				return false;
//			}
//		} 
//		else if (totalStones == 2) {
//			if (entry > 0 && entry < 3) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		else if (totalStones == 1) {
//			if (entry > 0 && entry < 2) {
//				return true;
//			}else {
//				return false;
//			}
//		}
//		else if (totalStones > 3) { 
//			if (entry > 0 && entry < 4) {
//			return true;
//			}else {
//			return false;
//
//			}
//		}
//		return false;
		
		if (entry > 0 && entry < 4 && entry <= totalStones) {
			return true;
			}else {
			return false;

			}

	}
	
}