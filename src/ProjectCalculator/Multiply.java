package ProjectCalculator;

public class Multiply {
    private ScannerCheck scannerCheck = new ScannerCheck();
    protected double multiplyOperation (double value1){
        return multiplyOperationPrivate(value1);
    }
    private double multiplyOperationPrivate (double value1){
        System.out.println("Введите множитель");
        double value2 = scannerCheck.scannerDouble();
        return value1 * value2;
    }
}
