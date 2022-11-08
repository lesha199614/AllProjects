package ProjectCalculator;

public class Difference extends Menu{

    protected double differenceOperation (double value1){
        return differenceOperationPrivate(value1);
    }
    private double differenceOperationPrivate (double value1){
        System.out.println("Введите вычитаемое");
        double value2 = scannerCheck.scannerDouble();
        return value1 - value2;
    }
}
