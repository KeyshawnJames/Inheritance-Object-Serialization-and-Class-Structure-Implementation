package package1;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * WheeledTransportation class has number of wheels, maximum speed and a serial number
 */
public class wheeledTransportation {
	//Attributes
	private int numOfWheels;
	private double maxSpeed;
	protected long serialNum;	
	
	/**
	 * Default Constructor
	 */
	public wheeledTransportation() {
		numOfWheels = 0;
		maxSpeed = 0;
	}
		
	/**
	 * Parameterized Constructor
	 * @param numOfWheels number of wheels for wheeledTransportation
	 * @param maxSpeed the max speed for the wheeledTransportation object
	 */
	public wheeledTransportation(int numOfWheels, double maxSpeed) {
		this.numOfWheels = numOfWheels;
		this.maxSpeed = maxSpeed;
	}
		
	/**
	 * Copy Constructor
	 * @param wT where wT is what is being copied
	 */
	public wheeledTransportation(wheeledTransportation wT) {
		numOfWheels = wT.numOfWheels;
		maxSpeed = wT.maxSpeed;
	}
	
	//Accessor and Mutator mehtods
	
	/** 
	 * get number of wheels
	 * 
	 * @return number of wheels
	 */
	public int getNumOfWheels() {
		return numOfWheels;
	}
	
	/** 
	 * set number of wheels
	 * 
	 * @param numOfWheels 
	 */
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	/** 
	 * get max speed
	 * 
	 * @return max speed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * set max speed
	 * 
	 * @param maxSpeed
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	/** 
	 * get serial number
	 * 
	 * @return serial number
	 */
	public long getSerialNum() {
		return serialNum;
	}
	
	/** 
	 * 
	 * to string method
	 * 
	 * @return string with info of the wheeledTransportation object
	 */
	public String toString() {
		return "This Wheeled Transportation has " + numOfWheels + " wheels, has a maximum speed of " + maxSpeed + " km/hr.";
	}
	
	/**
	 * equals method
	 * 
	 * @param otherObject
	 * 
	 * @return  return true if equal and false if not equal
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			wheeledTransportation wT = (wheeledTransportation)otherObject;
			return (this.numOfWheels == wT.numOfWheels && this.maxSpeed == wT.maxSpeed);
		}
		
	}
				
}


