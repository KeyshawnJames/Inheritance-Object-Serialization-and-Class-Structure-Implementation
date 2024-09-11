package package4;
import package1.wheeledTransportation;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * The monowheel class extends the wheeledTransportation class in addition it has maximum weight
 * each monpwheel object also has a unique serial number
 */
public class monowheel extends wheeledTransportation {
	//Attributes
	private double maxWeight;
	static int serialNumCounter =0;
	
	/**
	 * Default Constructor
	 */
	public monowheel() {
		maxWeight = 0;
		getNextSerialNumber();
	}
	
	/**
	 * Parameterized Constructor
	 * @param numOfWheels
	 * @param maxSpeed
	 * @param maxWeight
	 */
	public monowheel(int numOfWheels, double maxSpeed, double maxWeight) {
		super(numOfWheels, maxSpeed);
		this.maxWeight = maxWeight;
		getNextSerialNumber();
	}
	
	/**
	 * Copy Constructor
	 * @param mw
	 */
	public monowheel(monowheel mw) {
		setNumOfWheels(mw.getNumOfWheels());
		setMaxSpeed(mw.getMaxSpeed());
		this.maxWeight = mw.maxWeight;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator Methods
	
	/**
	 * get the max weight for the monowheel object
	 * @return maxWeight
	 */
	public double getMaxWeight() {
		return maxWeight;
	}
	
	/**
	 * set max weight for the monowheel object
	 * @param maxWeight
	 */
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = 55000;
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}

	/**
	 * toString method
	 * @return info about the monowheel object in the form of a strin
	 */
	public String toString() {
		return "This Monowheel - serial #" + serialNum + " has " + getNumOfWheels() + " wheels, has a maximum speed of " + getMaxSpeed() + " km/hr and has a maximum weight of " + maxWeight + " lbs";
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
			monowheel mw = (monowheel)otherObject;
			return (this.getNumOfWheels() == mw.getNumOfWheels() && this.getMaxSpeed() == mw.getMaxSpeed() && this.maxWeight == mw.maxWeight);
		}
		
	}
	
}
