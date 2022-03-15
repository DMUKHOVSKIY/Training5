public class GroundTransport extends Transport {
    private int numberWheels;
    private int fuelConsumption;

    public GroundTransport() {
    }

    public GroundTransport(int numberWheels, int fuelConsumption) {
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberWheels = numberWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +
                " [numberWheels=" + numberWheels +
                ", fuelConsumption=" + fuelConsumption +
                ']';
    }
}
