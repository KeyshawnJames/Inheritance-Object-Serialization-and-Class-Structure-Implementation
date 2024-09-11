# Inheritance-Object-Serialization-and-Class-Structure-Implementation
The objective of this assignment is to design a class hierarchy representing various forms of transportation using inheritance and to implement them in Java. The project also emphasizes object serialization, managing unique serial numbers for each type of vehicle, and testing object equality, all while adhering to proper access control and constructor principles.

There are 7 packages in this project, each representing different types of vehicles.

**Driver Package:** There are two driver classes. The first driver tests the core functionality of the classes, including object creation, equality testing, and identifying the least and most expensive Aircraft objects. The second driver focuses on expanding the implementation by adding a method to copy objects, testing deep object duplication without using explicit type checks or cloning, as required for Part II.

**Package 1 (WheeledTransportation Package):** Contains the base class for all wheeled vehicles, such as Monowheels, defining shared attributes like serial numbers and maximum weight.

**Package 2 (Train and Tram Package):** Houses the Train and Tram classes, which extend WheeledTransportation, adding attributes like speed, number of vehicles, and station information.

**Package 3 (Metro Package):** Contains the Metro class, representing urban mass transit systems with unique attributes specific to metro trains.

**Package 4 (Monowheel Package):** Dedicated to Monowheel objects, focusing on their distinct serial number system and weight capacity.

**Package 5 (Aircraft and World War II Airplane Package):** Contains classes related to flying vehicles, such as Aircraft and its subclass, World War II Airplane, adding attributes like price, maximum elevation, and whether the airplane has twin engines.

**Package 6 (Ferry Package):** Contains the Ferry class, designed for water-based transportation, with attributes like maximum load and speed.

