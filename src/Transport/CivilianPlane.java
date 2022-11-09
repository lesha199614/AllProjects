package Transport;

public class CivilianPlane extends AirTransport {
    private int passengerAmount;
    private boolean businessClass;

    public CivilianPlane(int power, int maxSpeed, int mass, String brand, int wingspan, int runwayLength, int passengerAmount, boolean businessClass) {
        super(power, maxSpeed, mass, brand, wingspan, runwayLength);
        this.passengerAmount = passengerAmount;
        this.businessClass = businessClass;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Вместимость: " + passengerAmount + " пассажиров");
        if (businessClass) {
            System.out.println("Бизнесс класс присутствует");
        } else {
            System.out.println("Бизнесс класс отсутствует");
        }
    }

    private void testCapacityPrivate() {
        System.out.println("Введите количество пассажиров, которых хотите перевезти");
        int passangersValue = scanner.nextInt();
        if (passangersValue <= passengerAmount) {
            System.out.println("Все пассажиры влезут");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }

    public void testCapacity(){
        testCapacityPrivate();
    }
}
