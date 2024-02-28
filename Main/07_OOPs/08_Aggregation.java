
// class Address{
//     String City;
//     String State;

//     // A constructor
//     public Address(String City , String State){
//         this.City = City;
//         this.State = State;
//     }
// }

// class Student{
//     String name;
//     int id;
//     Address address;

//     // A constructor
//     public Student(String name , int id , Address address){
//         this.name = name;
//         this.id = id;
//         this.address = address;
//     }

//     void display(){
//         System.out.println("Name: "+name+" ; "+" Id : "+id+" ; "+"City: "+address.City+" ; "+"State: "+address.State);
//     }
// }


// class  LPU{
//     public static void main(String args[]){

//         Address a1 = new Address("Mohali","Punjab");
//         Student s1 = new Student("John",1,a1);

//         s1.display();

//     }
// }


// Create a program to manage different types of vehicles in a transportation system. Each vehicle has a unique identification number and a maximum speed. Vehicles can be of different types such as cars, trucks, and bicycles.

// Cars have an additional attribute: the number of passengers it can carry.
// Trucks have an additional attribute: the maximum weight they can carry.
// Bicycles do not have any additional attributes.
// Implement the following functionalities:

// Create a superclass named "Vehicle" with attributes:
// identificationNumber (String)
// maxSpeed (double)
// Create subclasses named "Car", "Truck", and "Bicycle" inheriting from the "Vehicle" superclass.
// For each subclass, implement a constructor that initializes the attributes along with appropriate getters and setters.
// Implement a method in each subclass to display the details of the vehicle.
// In the main class, create instances of each type of vehicle and demonstrate inheritance by calling methods from the superclass and subclasses.

class Vehicle {
    String identificationNumber;
    double maxSpeed;

    public Vehicle(String identificationNumber, double maxSpeed) {
        this.identificationNumber = identificationNumber;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Identification Number: " + identificationNumber);
        System.out.println("Max Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int passengers;

    public Car(String identificationNumber, double maxSpeed, int passengers) {
        super(identificationNumber, maxSpeed);
        this.passengers = passengers;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Passengers: " + passengers);
    }
}

class Truck extends Vehicle {
    double maxWeight;

    public Truck(String identificationNumber, double maxSpeed, double maxWeight) {
        super(identificationNumber, maxSpeed);
        this.maxWeight = maxWeight;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Max Weight: " + maxWeight);
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String identificationNumber, double maxSpeed) {
        super(identificationNumber, maxSpeed);
    }
}

class LPU {
    public static void main(String[] args) {
        Car car = new Car("1", 150.0, 4);
        Truck truck = new Truck("2", 100.0, 10.0);
        Bicycle bicycle = new Bicycle("3", 30.0);

        car.displayDetails();
        truck.displayDetails();
        bicycle.displayDetails();
    }
}
