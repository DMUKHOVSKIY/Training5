public class Truck extends GroundTransport {
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(int numberWheels, int fuelConsumption, int liftingCapacity) {
        super(numberWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public Truck(int power, int maxSpeed, int weight, String brand, int numberWheels, int fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, brand, numberWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void maxWeight(int weight) {
        if (weight <= liftingCapacity)
            System.out.println("Грузовик загружен!");
        else
            System.out.println("Вам нужен грузовик больше!");
    }

    @Override
    public String toString() {
        return super.toString() +
                " [liftingCapacity=" + liftingCapacity +
                ", powerKw=" + super.powerKw() +
                ']';
    }
}
