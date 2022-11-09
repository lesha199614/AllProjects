package Transport;

public class MilitaryPlane extends AirTransport {
    private boolean ejection;
    private int rocketAmount;

    public MilitaryPlane(int power, int maxSpeed, int mass, String brand, int wingspan, int runwayLength, boolean ejection, int rocketAmount) {
        super(power, maxSpeed, mass, brand, wingspan, runwayLength);
        this.ejection = ejection;
        this.rocketAmount = rocketAmount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (ejection) {
            System.out.println("Есть система катапультирования");
        } else {
            System.out.println("Система катапультирование отсутствует");
        }
        System.out.println("Количество ракет: " + rocketAmount);
    }

    private void shootPrivate() {
        if (rocketAmount > 0) {
            rocketAmount--;
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void shoot() {
        shootPrivate();
    }
    private void ejectionPrivate(){
        if (ejection){
            System.out.println("Катапульта прошла успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
    public void ejection(){
        ejectionPrivate();
    }
}
