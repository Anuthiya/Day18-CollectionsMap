package trainingday18COLLECTIONSmap;

public class Mobile {
	private String brand;
	private int price;
	private boolean isAndroid;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid=isAndroid;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	public Mobile(String brand, int price, boolean isAndroid) {
		this.brand=brand;
		this.price=price;
		this.isAndroid=isAndroid;
	}
	public String toString() {
		return brand+" "+price+" "+isAndroid;
	}
	
	

}
