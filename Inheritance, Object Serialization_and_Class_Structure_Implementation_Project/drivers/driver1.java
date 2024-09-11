package drivers;
import package1.wheeledTransportation;
import package2.train;
import package2.tram;
import package3.metro;
import package4.monowheel;
import package5.aircraft;
import package5.ww2Airplane;
import package6.ferry;
//--------------------------------------
// Assignment 1
// Part: 1 
// Written by Keyshawn James (40264200)
//--------------------------------------

public class driver1 {
	/**
	 * finds the least and most expensive aircraft object
	 * @param x
	 */
	public static void findLeastAndMostExpensiveAircraft(Object[] x) {
		double least = 999999999; // max number for double to see which number is smaller
		double most = 0;
		aircraft leastExpensive = null;
		aircraft mostExpensive = null;
		
		for (int i = 0; i< x.length ; i++) {
			if (x[i] == null) { // just in case there in one of the elements is null
				continue;
			}
			
			if (x[i] instanceof aircraft) {
				
				if (((aircraft)x[i]).getPrice() < least){
					least = ((aircraft)x[i]).getPrice();
					leastExpensive = (aircraft) x[i];
				}
				
				if (((aircraft)x[i]).getPrice() > most){
					most = ((aircraft)x[i]).getPrice();
					mostExpensive = (aircraft) x[i];
				} 
			}
		}
		
		if (least == 999999999 && most == 0) { // if the initial values for least and most have not changed then that means that there are no aircraft objects within the array
			System.out.println("There are no aircraft objects that exist in this array.");
		}
		else {
			System.out.println(leastExpensive.toString() + ". It is also the cheapest aircraft \n");
			System.out.println(mostExpensive.toString() + ". It is also the most expensive aircraft \n");
		}	
	}
		
	public static void main(String[] args) {
		
		/**
		 * Creating objects from the 8 different classes
		 */
		
		/**
		 * Creating 3 wheeledTransportation objects
		 */
		wheeledTransportation wT1 = new wheeledTransportation();
		wheeledTransportation wT2 = new wheeledTransportation(4, 250);
		wheeledTransportation wT3 = new wheeledTransportation(wT2);
		System.out.println("Here is the info for the first wheeledTransportation object:\n" + wT1 + "\n");
		System.out.println("Here is the info for the second wheeledTransportation object:\n" + wT2 + "\n");
		System.out.println("Here is the info for the third wheeledTransportation object:\n" + wT3 + "\n");
		
		/**
		 * Creating 3 train objects
		 */
		train train1 = new train(8, 120, 20, "Montreal", "Toronto");
		train train2 = new train(train1);
		train train3 = new train(8, 120, 20, "Toronto", "Vancouver");
		System.out.println("Here is the info for the first train object:\n" + train1 + "\n");
		System.out.println("Here is the info for the second train object:\n" + train2 + "\n");
		System.out.println("Here is the info for the third train object:\n" + train3 + "\n");

		
		/**
		 * Creating 2 metro objects
		 */
		metro met1 = new metro(10,70, 30, "Atwater", "Guy-Concordia", 1);
		metro met2 = new metro(met1);
		met2.setStartingStation("Lionel-Groulx");
		met2.setNumOfStops(2);
		System.out.println("Here is the info for the first metro object:\n" + met1 + "\n");
		System.out.println("Here is the info for the second metro object:\n" + met2 + "\n");

		/**
		 * Creating 2 tram objects
		 */
		tram trm1 = new tram(8, 60, 15, "San Francisco", "Los Angeles", 100, 2003);
		tram trm2 = new tram(trm1);
		trm2.setYoc(2010);
		System.out.println("Here is the info for the first tram object:\n" + trm1 + "\n");
		System.out.println("Here is the info for the second tram object:\n" + trm2 + "\n");
		
		/**
		 * Creating 3 monowheel objects 
		 */
		monowheel mw1 = new monowheel(1, 50, 300);
		monowheel mw2 = new monowheel(1, 70, 250);
		monowheel mw3 = new monowheel(1, 60, 240);
		System.out.println("Here is the info for the first monowheel object:\n" + mw1 + "\n");
		System.out.println("Here is the info for the second monowheel object:\n" + mw2 + "\n");
		System.out.println("Here is the info for the third monowheel object:\n" + mw3 + "\n");

		
		/**
		 * Creating 3 ferry object
		 */
		ferry fer1 = new ferry(60, 100000);
		ferry fer2 = new ferry(75,90000);
		ferry fer3 = new ferry(fer2);
		System.out.println("Here is the info for the first ferry object:\n" + fer1 + "\n");
		System.out.println("Here is the info for the second ferry object:\n" + fer2 + "\n");
		System.out.println("Here is the info for the third ferry object:\n" + fer3 + "\n");


		
		
		/**
		 * Creating 2 aircraft objects 
		 */
		aircraft ac1 = new aircraft(100000,30000);
		aircraft ac2 = new aircraft(50000,15000);
		System.out.println("Here is the info for the first aircraft object:\n" + ac1 + "\n");
		System.out.println("Here is the info for the second aircraft object:\n" + ac2 + "\n");
		
		/**
		 * Creating 2 ww2Airplanecobjects
		 */
		ww2Airplane ww2A1 = new ww2Airplane(100000, 30000, true);
		ww2Airplane ww2A2 = new ww2Airplane(125000, 27000, false);
		System.out.println("Here is the info for the first ww2Airplane object:\n" + ww2A1 + "\n");
		System.out.println("Here is the info for the second ww2Airplane object:\n" + ww2A2 + "\n");
		
		
		/**
		 * testing the equals() method
		 */
		System.out.println("\n-- Testing the equality of some of the created objetcs with the equals() method -- \n");
		
		/**
		 * Testing ac1 & ww2A1 (2 objects from different classes)
		 */
		if(ac1.equals(ww2A1)) {
			System.out.println("These two objects (ac1 & ww2A1) are equal \n");
		}
		else {
			System.out.println("These two objects (ac1 & ww2A1) are not equal \n");
		}
		
		/**
		 * Testing train1 & met1 (2 objects from different classes)
		 */
		if(train1.equals(met1)) {
			System.out.println("These two objects (train1 & met1) are equal \n");
		}
		else {
			System.out.println("These two objects (train1 & met1) are not equal \n");
		}
		
		/**
		 * Testing trm1 and trm2 (2 objects from the same class with different values)
		 */
		if(trm1.equals(trm2)) {
			System.out.println("These two objects (trm1 & trm2) are equal \n");
		}
		else {
			System.out.println("These two objects (trm1 & trm2) are not equal \n");
		}
		
		/**
		 * Testing fer1 and fer2 (2 objects from the same class with different values)
		 */
		if(fer1.equals(fer2)) {
			System.out.println("These two objects (fer1 & fer2) are equal \n");
		}
		else {
			System.out.println("These two objects (fer1 & fer2) are not equal \n");
		}
		
		/**
		 * Testing fer2 and fer3 (2 objects from the same class with similar values)
		 */
		if(fer2.equals(fer3)) {
			System.out.println("These two objects (fer2 & fer3) are equal \n");
		}
		else {
			System.out.println("These two objects (fer2 & fer3) are not equal \n");
		}
		
		/**
		 * Testing train1 and train2 (2 objects from the same class with similar values)
		 */
		if(train1.equals(train2)) {
			System.out.println("These two objects (train1 & train2) are equal \n");
		}
		else {
			System.out.println("These two objects (train1 & train2) are not equal \n");
		}
		
		
		/**
		 * Creating the first object array which includes at least one object from each class
		 */
		Object[] array1 = new Object[16];
		array1[0] = wT1;
		array1[1] = wT2;
		array1[2] = train1;
		array1[3] = train2;
		array1[4] = met1;
		array1[5] = met2;
		array1[6] = trm1;
		array1[7] = trm2;
		array1[8] = mw1;
		array1[9] = mw2;
		array1[10] = fer1;
		array1[11] = fer2;
		array1[12] = ac1;
		array1[13] = ac2;
		array1[14] = ww2A1;
		array1[15] = ww2A2;
		
		System.out.println("\n -- Testing the findLeastAndMostExpensiveAircraft() method on array1 which includes at least one object from each class -- \n" );
		findLeastAndMostExpensiveAircraft(array1);
		
		/**
		 * Creating the second object array which does not contain any aircraft objects
		 */
		Object[] array2 = new Object[15];
		array2[0] = wT1;
		array2[1] = wT2;
		array2[2] = train1;
		array2[3] = train2;
		array2[4] = met1;
		array2[5] = met2;
		array2[6] = trm1;
		array2[7] = trm2;
		array2[8] = mw1;
		array2[9] = mw2;
		array2[10] = fer1;
		array2[11] = fer2;
		array2[12] = wT3;
		array2[13] = mw3;
		array2[14] = train3;
		
		System.out.println("\n -- Testing the findLeastAndMostExpensiveAircraft() method on array2 which does not contain any aircraft objects -- \n" );
		findLeastAndMostExpensiveAircraft(array2);

	}

}
