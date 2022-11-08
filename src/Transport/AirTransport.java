package Transport;

public class AirTransport extends Transport {
    private int wingspan;
    private int runwayLength;

    public AirTransport(int power, int maxSpeed, int mass, String brand, int wingspan, int runwayLength) {
        super(power, maxSpeed, mass, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Размах крылье: " + wingspan + "м");
        System.out.println("Минимальная длина взлётно-посадочной полосы: " + runwayLength + " м");
    }
}
