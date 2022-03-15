public class Passenger extends GroundTransport {
    private String bodyType;
    private int numberPassengers;

    public Passenger() {
    }

    public Passenger(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption, String bodyType, int numberPassengers) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public Passenger(int numberWheels, int fuelConsumption, String bodyType, int numberPassengers) {
        super(numberWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public String uuu() {
        return "ggg";
    }

    public void kmFuel(int time) {
        int distance = super.getMaxSpeed() * time;
        System.out.println("За время " + time + "ч, автомобиль" + super.getBrand() +
                "двигаясь с максимальной скоростью " + super.getMaxSpeed() + "км/ч проедет " +
                distance + "км, и израсходует " + fuel(distance) + " литров топлива.");
    }

    private double fuel(int distatnce) {
        return super.getFuelConsumption() * distatnce / 100.;
    }

    @Override
    public String toString() {
        return super.toString() + " [bodyType=" +
                bodyType + ", numberPassengers="
                + numberPassengers +
                ", powerKw=" + super.powerKw() +
                "]";
    }
}
