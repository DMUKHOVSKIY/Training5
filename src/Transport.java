public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport() {
    }

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }


    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public double powerKw() {
        return 0.78 * power;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " [power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand=" + brand +
                ']';
    }
}
