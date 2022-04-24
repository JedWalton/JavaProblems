class Vehicle {

    protected String licensePlate;

    @java.lang.Override
    public java.lang.String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate +
                '}';
    }

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}

class Car extends Vehicle {

    protected int numberOfSeats;

    public Car(String licensePlate, int numberOfSeats) {
        super(licensePlate);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate=" + licensePlate +
                ",numberOfSeats=" + numberOfSeats +
                '}';
    }
}