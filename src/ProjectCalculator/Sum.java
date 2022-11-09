package ProjectCalculator;

public class Sum {

    private ScannerCheck scannerCheck = new ScannerCheck();
    protected double sumOperation(double value1){
        return sumOperationPrivate(value1);
    }
    private double sumOperationPrivate(double value1) {
        System.out.println("Введите следующее слагаемое");
        double value2 = scannerCheck.scannerDouble();
        return value1 + value2;
    }
}
