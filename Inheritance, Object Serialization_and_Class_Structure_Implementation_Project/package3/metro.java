package package3;
import package2.train;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * The metro class extends the train class in addition it has the total number of stops 
 * and also each train object has a unique serial number
 */
public class metro extends train{
	
	//Attributes
	private int numOfStops;
	static int serialNumCounter =0;
	
	/**
	 * Default constructor
	 */
	public metro() {
		numOfStops = 0;
		getNextSerialNumber();
	}
	
	/**
	 * Parameterized Constructor
	 * @param numOfWheels
	 * @param maxSpeed
	 * @param numOfVehicles
	 * @param startingStation
	 * @param destinationStation
	 * @param numOfStops
	 */
	public metro(int numOfWheels, double maxSpeed,int numOfVehicles, 
				String startingStation, String destinationStation, int numOfStops) {
		super(numOfWheels, maxSpeed, numOfVehicles, startingStation, destinationStation);
		this.numOfStops = numOfStops;
		getNextSerialNumber();
	}
	
	/**
	 * Copy constructor
	 * @param met
	 */
	public metro(metro met) {
		setNumOfWheels(met.getNumOfWheels());
		setMaxSpeed(met.getMaxSpeed());
		setNumOfVehicles(met.getNumOfVehicles());
		setStartingStation(met.getStartingStation());
		setDestinationStation(met.getDestinationStation());
		this.numOfStops = met.numOfStops;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator Methods
	
	/**
	 * get number of stops
	 * @return numOfStops
	 */
	public int getNumOfStops() {
		return numOfStops;
	}
	
	/**
	 * set number of stops
	 * @param numOfStops
	 */
	public void setNumOfStops(int numOfStops) {
		this.numOfStops = numOfStops;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = 25000;
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}
	
	/**
	 * toString method
	 * @return info about the metro object in the form of a string
	 */
	public String toString() {
		return "This Metro - serial #" + serialNum + " has " + getNumOfWheels() + " wheels, has a maximum speed of " 
				+ getMaxSpeed()+ " km/hr. It has " + getNumOfVehicles() + " vehicles and its starting and destination stations are " 
				+ getStartingStation() + " and " + getDestinationStation() + " with " + numOfStops + " stops between the two stations";
	}
	
	/**
	 * equals method
	 * @return returns true if both objects are equal and return false if both objects are not equal
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			metro met = (metro)otherObject;
			return (this.getNumOfWheels() == met.getNumOfWheels() && this.getMaxSpeed() == met.getMaxSpeed()) 
					&& this.getNumOfVehicles() == met.getNumOfVehicles() && this.getStartingStation() == met.getStartingStation() 
					&& this.getDestinationStation() == met.getDestinationStation() && this.numOfStops == met.numOfStops;
		}
		
	}
		
}

