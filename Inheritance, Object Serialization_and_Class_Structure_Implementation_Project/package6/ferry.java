package package6;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * A ferry class has a maximum speed attribute and maximum load attribute, 
 * each ferry object also has a unique serial number
 */
public class ferry {
	//Attributes
	private double maxSpeed;
	private double maxLoad;
	private long serialNum = 70000;
	static int serialNumCounter = 0;
	
	/**
	 * Default Constructor
	 */
	public ferry(){
		maxSpeed = 0;
		maxLoad = 0;
		getNextSerialNumber();
	}
	
	/**
	 * Parameterized Constructor
	 * @param maxSpeed
	 * @param maxLoad
	 */
	public ferry(double maxSpeed, double maxLoad) {
		this.maxSpeed = maxSpeed;
		this.maxLoad = maxLoad;
		getNextSerialNumber();
	}
	
	/**
	 * Copy Constructor
	 * @param fer
	 */
	public ferry(ferry fer) {
		this.maxSpeed = fer.maxSpeed;
		this.maxLoad = fer.maxLoad;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator mehtods
	
	/**
	 * get max speed
	 * @return maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	/**
	 * set max speed	
	 * @param maxSpeed
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	/**
	 * get max load
	 * @return maxLoad
	 */
	public double getMaxLoad() {
		return maxLoad;
	}
	
	/**
	 * set max load
	 * @param maxLoad
	 */
	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}
	
	/**
	 * toString method
	 * @return info about the ferry object in the form of a string
	 */
	public String toString() {
		return "This Ferry - serial #" + serialNum + " has a max speed of " + maxSpeed + " km/hr with a maximum load capacity of " + maxLoad + "lbs.";
	}
	
	/**
	 * equals method
	 * @return returns true if both objects are equal and false when they are not equal
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			ferry fer = (ferry)otherObject;
			return (this.maxSpeed == fer.maxSpeed && this.maxLoad == fer.maxLoad);
		}
			
	}
	
}
