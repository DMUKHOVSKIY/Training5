public class AirTransport extends Transport {
    private int wingspan;
    private int minRunwayLen;

    public AirTransport() {
    }

    public AirTransport(int wingspan, int minRunwayLen) {
        this.wingspan = wingspan;
        this.minRunwayLen = minRunwayLen;
    }

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLen) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLen = minRunwayLen;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getMinRunwayLen() {
        return minRunwayLen;
    }

    @Override
    public String toString() {
        return super.toString() +
                " [wingspan =" + wingspan +
                ", minRunwayLen=" + minRunwayLen +
                "]";
    }
}
