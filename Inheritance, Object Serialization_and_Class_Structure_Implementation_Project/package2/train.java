package package2;
import package1.wheeledTransportation; 
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * The train class extends the wheeledTransportation class in addition, 
 * it has the number of vehicles and the names of the starting and destination stations and has a serial number
 */

public class train extends wheeledTransportation{
	
	//Attributes
	private int numOfVehicles; 
	private String startingStation;
	private String destinationStation;
	static int serialNumCounter = 0;
	
	/**
	 * Default constructor
	 */
	public train() {
		numOfVehicles = 0;
		startingStation = "null";
		destinationStation = "null";
		getNextSerialNumber();
	}
	
	/**
	 * Parameterized Constructor
	 * @param numOfWheels
	 * @param maxSpeed
	 * @param numOfVehicles
	 * @param startingStation
	 * @param destinationStation
	 */
	public train(int numOfWheels, double maxSpeed,int numOfVehicles, String startingStation, String destinationStation) {
		super(numOfWheels, maxSpeed);
		this.numOfVehicles = numOfVehicles;
		this.startingStation = startingStation;
		this.destinationStation = destinationStation;
		getNextSerialNumber();
	}
	
	/**
	 * Copy Constructor
	 * @param trn
	 */
	public train (train trn) {
		setNumOfWheels(trn.getNumOfWheels());
		setMaxSpeed(trn.getMaxSpeed());
		numOfVehicles = trn.numOfVehicles;
		startingStation = trn.startingStation;
		destinationStation = trn.destinationStation;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator methods
	/**
	 * get number of vehicles
	 * @return numOfVehicles
	 */
	public int getNumOfVehicles() {
		return numOfVehicles;
	}
	
	/**
	 * set number of vehicles
	 * @param numOfVehicles
	 */
	public void setNumOfVehicles(int numOfVehicles) {
		this.numOfVehicles = numOfVehicles;
	}
	
	/**
	 * get starting station
	 * @return startingStation
	 */
	public String getStartingStation(){
		return startingStation;
	}
	
	/**
	 * set starting station
	 * @param startingStation
	 */
	public void setStartingStation(String startingStation) {
		this.startingStation = startingStation;
	}
	
	/**
	 * get destination station
	 * @return destinationStation
	 */
	public String getDestinationStation() {
		return destinationStation;
	}
	
	/**
	 * set destination station
	 * @param destinationStation
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = 10000;
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}
	
	/**
	 * toString method
	 * @return info about the train object
	 */
	public String toString() {
		return "This Train - serial #" + serialNum + " has " + getNumOfWheels() + " wheels, has a maximum speed of " 
				+ getMaxSpeed()+ " km/hr. It has " + numOfVehicles + " vehicles and its starting and destination stations are " 
				+ startingStation + " and " + destinationStation;
	}
	
	/**
	 * equals method
	 * @return true if equal and false if not equal
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			train trn = (train)otherObject;
			return (this.getNumOfWheels() == trn.getNumOfWheels() && this.getMaxSpeed() == trn.getMaxSpeed()) 
					&& this.numOfVehicles == trn.numOfVehicles && this.startingStation == trn.startingStation 
					&& this.destinationStation == trn.destinationStation;
		}
		
	}
	
}


