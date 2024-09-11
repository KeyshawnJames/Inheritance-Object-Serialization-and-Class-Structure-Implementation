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
//Assignment 1
//Part: 2
//Written by Keyshawn James (40264200)
//--------------------------------------

public class driver2 {
	
	public static Object[] copyTheObjects(Object[] copyThis) {
		/**
		 * Creating object array with the same length as the array you want to be copied
		 */
		Object[] copyTheArray = new Object[copyThis.length];
		for (int i = 0; i < copyThis.length; i++) {
			if (copyThis[i] == null) {
				continue;
			}
			copyTheArray[i] = copyThis[i];
		}
		return copyTheArray;
	}

	
	public static void main(String[] args) {

		/**
		 * Creating objects for the first array
		 */
		wheeledTransportation wT1 = new wheeledTransportation();
		wheeledTransportation wT2 = new wheeledTransportation(4, 250);
		
		train train1 = new train(8, 120, 20, "Montreal", "Toronto");
		train train2 = new train(train1);
		
		metro met1 = new metro(10,70, 30, "Atwater", "Guy-Concordia", 1);
		metro met2 = new metro(met1);
		met2.setStartingStation("Lionel-Groulx");
		met2.setNumOfStops(2);
		
		tram trm1 = new tram(8, 60, 15, "San Francisco", "Los Angeles", 100, 2003);
		tram trm2 = new tram(trm1);
		trm2.setYoc(2010);
		
		monowheel mw1 = new monowheel(1, 50, 300);
		monowheel mw2 = new monowheel(1, 70, 250);
		
		ferry fer1 = new ferry(60, 100000);
		ferry fer2 = new ferry(75,90000);
		
		aircraft ac1 = new aircraft(100000,30000);
		aircraft ac2 = new aircraft(50000,15000);
		
		ww2Airplane ww2A1 = new ww2Airplane(100000, 30000, true);
		ww2Airplane ww2A2 = new ww2Airplane(125000, 27000, false);
		
		Object [] array1 = {wT1, wT2, train1, train2, met1, met2, trm1, trm2, mw1, mw2, fer1, fer2, ac1, ac2, ww2A1, ww2A2};
		Object[] array2 = copyTheObjects(array1); // Calling the copyTheObjects method
		
		/**
		 * Displaying the content from array1
		 */
		System.out.println("-- Displaying the content from the array1 -- \n");
		for(int i = 0; i < array1.length; i++) {
			System.out.println("Element " + i + " from array1: " + array1[i] + "\n");
		}
		
		/**
		 * Displaying the content from array2 (the copied array)
		 */
		System.out.println("\n\n-- Displaying the content from the array2 (the copied array) -- \n");
		for(int i = 0; i < array1.length; i++) {
			System.out.println("Element " + i + " from array2: " + array2[i] + "\n");
		}

	}

}
