package package5;
import package1.wheeledTransportation;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * The aircraft class has a price attribute and maximum elevation attribute
 */
public class aircraft {
	//Attributes
	private double price;
	private double maxElv;
	protected long serialNum;
		
	/**
	 * Default Constructor
	 */
	public aircraft(){
		maxElv = 0;
		price = 0;
	}
		
	/**
	 * Parameterized Constructor
	 * @param price
	 * @param maxElv
	 */
	public aircraft(double price, double maxElv) {
		this.price = price;
		this.maxElv = maxElv;
	}
		
	/**
	 * Copy Constructor
	 * @param airC
	 */
	public aircraft(aircraft airC) {
		this.price = airC.price;
		this.maxElv = airC.maxElv;
	}
	
	//Accessor and Mutator mehtods
	
	/**
	 * get price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * set price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * get maximum elevation
	 * @return maxElv
	 */
	public double getMaxElv() {
		return maxElv;
	}
	
	/**
	 * set maximum elevation
	 * @param maxElv
	 */
	public void setMaxElv(double maxElv) {
		this.maxElv = maxElv;
	}
	
	/**
	 * toString method
	 * @return info about the aircraft object in the form of a string
	 */
	public String toString() {
		return "This Aircraft has a price of $" + price + " and has a maximum elevation of " + maxElv + " ft";
	}
	
	/**
	 * equals method
	 * @return returns true if both objects are equal and false if they are not equal 
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			aircraft ac = (aircraft)otherObject;
			return (this.price == ac.price && this.maxElv == ac.maxElv);
		}
		
	}

}
