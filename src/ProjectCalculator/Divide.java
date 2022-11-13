package ProjectCalculator;

public class Divide {

    private ScannerCheck scannerCheck = new ScannerCheck();
    protected double divideOperation (double value1){
        return divideOperationPrivate(value1);
    }
    private double divideOperationPrivate (double value1){
        System.out.println("Введите делитель");
        double value2 = scannerCheck.scannerDouble();
        while (value2 == 0){
            try {
                throw new MyExceptions();
            } catch (MyExceptions e){
            e.divideZero();
        }
            value2 = scannerCheck.scannerDouble();
        }
        return value1 / value2;
    }
}
