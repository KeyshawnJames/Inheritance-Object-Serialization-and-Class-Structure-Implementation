package package5;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * A World War II airplane extends the aircraft class in addition it has a twin engine attribute
 * each World War II airplane has a unique serial number
 */
public class ww2Airplane extends aircraft {
	//Attributes
	private boolean twinEng;
	static int serialNumCounter = 0;
	
	/**
	 * Default Constructor
	 */
	public ww2Airplane() {
		twinEng = false;
		getNextSerialNumber();
	}

	/**
	 * Parameterized Constructor
	 * @param price
	 * @param maxElv
	 * @param twinEng
	 */
	public ww2Airplane(double price, double maxElv, boolean twinEng){
		super(price,maxElv);
		this.twinEng = twinEng;
		getNextSerialNumber();
	}
	
	/**
	 * Copy Constructor
	 * @param ww2Ap
	 */
	public ww2Airplane(ww2Airplane ww2Ap) {
		setPrice(ww2Ap.getPrice());
		setMaxElv(ww2Ap.getMaxElv());
		this.twinEng = ww2Ap.twinEng;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator Methods
	
	/**
	 * get twin engine
	 * @return twinEng
	 */
	public boolean getTwinEng() {
		return twinEng;
	}
	
	/**
	 * set twin engine
	 * @param twinEng
	 */
	public void setTwinEng(boolean twinEng) {
		this.twinEng = twinEng;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = 80000;
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}
	
	/**
	 * toString method
	 * @return info about the ww2Airplane object in the form of a string
	 */
	public String toString() {
		if (getTwinEng() == true) {
			return "This World War II Aiplane - serial #" + serialNum + " has a price of $" + getPrice() + " and has a maximum elevation of " + getMaxElv() + " ft. This World War II Airplane has a twin engine";
		}
		else {
			return "This World War II Aiplane - serial #" + serialNum + " has a price of $" + getPrice() + " and has a maximum elevation of " + getMaxElv() + " ft. This World War II Airplane does not have a twin engine";
		}
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
			ww2Airplane ww2Ap = (ww2Airplane)otherObject;
			return (this.getPrice() == ww2Ap.getPrice() && this.getMaxElv() == ww2Ap.getMaxElv() && this.twinEng == ww2Ap.twinEng);
		}
		
	}

}
