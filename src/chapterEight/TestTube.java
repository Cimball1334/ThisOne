package chapterEight;

public class TestTube {
	
	private static  boolean Glass;
	
	public TestTube() {
		setGlass(true);
	}
	
	
	
	public void drop(){
		System.out.println("Mrs. Maupin, theres glass in my leg");
	}

	public static boolean isGlass() {
		return Glass;
	}

	public static void setGlass(boolean isGlass) {
		TestTube.Glass = isGlass;
	}

	

}
