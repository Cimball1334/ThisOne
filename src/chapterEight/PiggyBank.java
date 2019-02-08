package chapterEight;

public class PiggyBank {
private double total;
	
	public PiggyBank() {
		setTotal(0);
	}
	public PiggyBank(double money) {
		setTotal(money);
	}
	
	public void addCoins(double coins) {
		total = total + coins;
	}
	
	public void takeMoney() {
		setTotal(0);
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public String toString() {
		return null;
		
	}
	
}
