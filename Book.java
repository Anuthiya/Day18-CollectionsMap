package trainingday18COLLECTIONSmap;

public class Book {
	private String name;
	private int price;
	private boolean isFiction;
	private int noOfPages;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setIsFiction(boolean isFiction) {
		this.isFiction=isFiction;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages=noOfPages;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public boolean getIsFiction() {
		return isFiction;
	}
	public int noOfPages() {
		return noOfPages;
	}
	public Book(String name, int price,boolean isFiction,int noOfPages) {
		this.name=name;
		this.price=price;
		this.isFiction=isFiction;
		this.noOfPages=noOfPages;
	}
	public String toString() {
		return name+" "+price+" "+isFiction+" "+noOfPages;
	}
}
	
