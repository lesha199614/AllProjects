package Transport;

public class Main {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar(200, 220, 2400, "AUDI", 4, 11, "Sedan", 5);
//        audi.printInfo();
//        audi.result();
        Truck volvo = new Truck(340, 130, 5300, "Volvo", 8, 23, 20);
//        volvo.printInfo();
//        volvo.testCapacity();
        CivilianPlane boeing = new CivilianPlane(5422,1000,20000,"Boeing",43,450,260,true);
//        boeing.printInfo();
//        boeing.testCapacity();
        MilitaryPlane raptor = new MilitaryPlane(2000,1100,5000,"Raptor",15,230,true,10);
        raptor.printInfo();
        raptor.shoot();
        raptor.ejection();
    }
}
