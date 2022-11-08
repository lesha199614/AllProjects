package Transport;

public class GroundTransport extends Transport{
    private int wheelAmount;
    private int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int mass, String brand, int wheelAmount, int fuelConsumption) {
        super(power, maxSpeed, mass, brand);
        this.wheelAmount = wheelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество колес: " + getWheelAmount());
        System.out.println("Потребление топлива на 100 км: " + getFuelConsumption() + " л");
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


}
