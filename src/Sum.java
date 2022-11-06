public class Sum extends Menu {

    public double sumOperation(double value1){
        return sumOperationPrivate(value1);
    }
    private double sumOperationPrivate(double value1) {
        System.out.println("Введите следующее слагаемое");
        double value2 = scanner.nextDouble();
        return value1 + value2;
    }
}
