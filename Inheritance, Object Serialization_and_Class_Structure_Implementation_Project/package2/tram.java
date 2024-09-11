package package2;
import package3.metro;
//--------------------------------------
//Assignment 1
//Part: 1 
//Written by Keyshawn James (40264200)
//--------------------------------------

/**
 * The tram class extends the metro class in addition it has the year of creation 
 * and a unique serial number
 */
public class tram extends metro {
	//Attributes
	private int yoc; // stands for year of creation
	static int serialNumCounter = 0;

	/**
	 * Default Constructor
	 */
	public tram() {
		yoc = 0;
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
	 * @param yoc
	 */
	public tram(int numOfWheels, double maxSpeed,int numOfVehicles, 
				String startingStation, String destinationStation, int numOfStops, int yoc) {
		super(numOfWheels, maxSpeed, numOfVehicles, startingStation, destinationStation, numOfStops);
		this.yoc = yoc;
		getNextSerialNumber();
	}
	
	/**
	 * Copy Constructor
	 * @param trm
	 */
	public tram(tram trm) {
		setNumOfWheels(trm.getNumOfWheels());
		setMaxSpeed(trm.getMaxSpeed());
		setNumOfVehicles(trm.getNumOfVehicles());
		setStartingStation(trm.getStartingStation());
		setDestinationStation(trm.getDestinationStation());
		setNumOfStops(trm.getNumOfStops());
		this.yoc = trm.yoc;
		getNextSerialNumber();
	}
	
	//Accessor and Mutator Methods
	
	/**
	 * get year of creation
	 * @return yoc
	 */
	public int getYoc() {
		return yoc;
	}
	/**
	 * set year of creation
	 * @param yoc
	 */
	public void setYoc(int yoc) {
		this.yoc = yoc;
	}
	
	/**
	 * Get the next serial number for the object method
	 */
	private void getNextSerialNumber() {
		serialNum = 30000;
		serialNum = serialNum + serialNumCounter;
		serialNumCounter++;
	}
	
	/**
	 * toString method
	 * @return  info about the tram object
	 */
	public String toString() {
		return "This Tram - serial #" + serialNum + " has " + getNumOfWheels() + " wheels, has a maximum speed of " 
				+ getMaxSpeed()+ " km/hr. It has " + getNumOfVehicles() + " vehicles and its starting and destination stations are " 
				+ getStartingStation() + " and " + getDestinationStation() + " with " + getNumOfStops() + 
				" stops between the two stations. This Tram was created in the year " + yoc;
	}
	
	/**
	 * equals method
	 * @return returns true if both objects are equal and returns false if both objects are not equal
	 */
	public boolean equals(Object otherObject) {
		if (otherObject == null || otherObject.getClass() != this.getClass()) {
			return false;
		}
		else{
			tram trm = (tram)otherObject;
			return (this.getNumOfWheels() == trm.getNumOfWheels() && this.getMaxSpeed() == trm.getMaxSpeed()) 
					&& this.getNumOfVehicles() == trm.getNumOfVehicles() && this.getStartingStation() == trm.getStartingStation() 
					&& this.getDestinationStation() == trm.getDestinationStation() && this.getNumOfStops() == trm.getNumOfStops()
					&& this.yoc == trm.yoc;
		}
		
	}

}
