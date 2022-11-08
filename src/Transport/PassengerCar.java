package Transport;

public class PassengerCar extends GroundTransport {
    private String bodyType;
    private int seatsNumber;

    public PassengerCar(int power, int maxSpeed, int mass, String brand, int wheelAmount, int fuelConsumption, String bodyType, int seatsNumber) {
        super(power, maxSpeed, mass, brand, wheelAmount, fuelConsumption);
        this.bodyType = bodyType;
        this.seatsNumber = seatsNumber;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип кузова: " + bodyType);
        System.out.println("Количество мест: " + seatsNumber);
    }

    private void resultPrivate() {
        System.out.println("Введите количество часов, которое хотите двигаться с максимальной скоростью");
        double time = scanner.nextDouble();
        double distance = time * getMaxSpeed();
        double consumption = time * getFuelConsumption();
        System.out.println("За " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скорость " + getMaxSpeed() + " км/ч проедет " + distance + " км и израсходдует " + consumption + " литров топлива");
    }

    public void result(){
        resultPrivate();
    }
}
