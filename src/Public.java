public class Public extends AirTransport {
    private int numberPassengers;
    private boolean businessClass;

    public Public() {
    }

    public Public(int numberPassengers, boolean businessClass) {
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public Public(int wingspan, int minRunwayLen, int numberPassengers, boolean businessClass) {
        super(wingspan, minRunwayLen);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public Public(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLen, int numberPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLen);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void maxPassengers(int passengers) {
        if (passengers <= numberPassengers)
            System.out.println("Самолёт загружен!");
        else
            System.out.println("Вам нужен самолёт больше!");
    }

    @Override
    public String toString() {
        return super.toString() +
                " [numberPassengers=" + numberPassengers +
                ", businessClass=" + businessClass +
                ", powerKw=" + super.powerKw() +
                ']';
    }
}
