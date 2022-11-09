package Transport;

public class Truck extends GroundTransport {
    private int loadCapacity;

    public Truck(int power, int maxSpeed, int mass, String brand, int wheelAmount, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, mass, brand, wheelAmount, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность: " + loadCapacity + "т");
    }

    private void testCapacityPrivate() {
        System.out.println("Введите массу груза, которую хотите перевезти");
        double weight = scanner.nextDouble();
        if (weight <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
    public void testCapacity(){
        testCapacityPrivate();
    }
}
