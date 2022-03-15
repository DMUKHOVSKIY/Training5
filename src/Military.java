public class Military extends AirTransport {
    private boolean ejectionSystem;
    private int rockets;

    public Military(int wingspan, int minRunwayLen, boolean ejectionSystem, int rockets) {
        super(wingspan, minRunwayLen);
        this.ejectionSystem = ejectionSystem;
        this.rockets = rockets;
    }

    public Military(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLen, boolean ejectionSystem, int rockets) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLen);
        this.ejectionSystem = ejectionSystem;
        this.rockets = rockets;
    }

    public void shot() {
        if (rockets != 0) {
            System.out.println("Ракета пошла!!!");
            rockets--;
        } else
            System.out.println("Боеприпасы отсутствуют");
    }

    public void ejection() {
        if (ejectionSystem)
            System.out.println("Катапультирование прошло успешно");
        else
            System.out.println("У вас нет такой системы");
    }

    @Override

    public String toString() {
        return super.toString() +
                " [ejectionSystem=" + ejectionSystem +
                ", rockets=" + rockets +
                ", powerKw=" + super.powerKw() +
                ']';
    }
}
