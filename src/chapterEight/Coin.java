package chapterEight;

public class Coin {

	private int faceUp;
	
	public double flipCoin() {
		faceUp = (int)(Math.random() * 2);
		return showFace();
	}
	
	public double showFace() {

		if(faceUp == 0)
		{
			return 0;
		}else {
			return 1;
		}
	}
}
