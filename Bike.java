package trainingday18COLLECTIONSmap;

public class Bike {
	private String brand;
	private int price;
	private int enginecc;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc=enginecc;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public Bike(String brand,int price,int enginecc) {
		this.brand=brand;
		this.price=price;
		this.enginecc=enginecc;
	}
	public String toString() {
		return brand+" "+price+" "+enginecc;
	}
}
	
