package ProjectCalculator;

public class Divide extends Menu{

    protected double divideOperation (double value1){
        return divideOperationPrivate(value1);
    }
    private double divideOperationPrivate (double value1){
        System.out.println("Введите делитель");
        double value2 = scannerCheck.scannerDouble();
        while (value2 == 0){
            System.out.println("Нельзя делить на 0. Введи другое число");
            value2 = scannerCheck.scannerDouble();
        }
        return value1 / value2;
    }
}
