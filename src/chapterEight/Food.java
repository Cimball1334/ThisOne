package chapterEight;

 class Food {
private double price, fat, carb, fiber;
public String name = new String();


public Food(double price, double fat, double carb, double fiber, String nameist) {
	setPrice(price);
	setFat(fat);
	setCarb(carb);
	setFiber(fiber);
	name = nameist;
}

public double getCarb() {
	return carb;
}

public void setCarb(double carb) {
	this.carb = carb;
}

public double getFiber() {
	return fiber;
}

public void setFiber(double fiber) {
	this.fiber = fiber;
}

public double getFat() {
	return fat;
}

public void setFat(double fat) {
	this.fat = fat;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String toString() {

	return  name + "\t" + getPrice() + "\t\t" +  getFat() + "\t\t" + getCarb() + "\t\t\t" + getFiber() ;

}
}



