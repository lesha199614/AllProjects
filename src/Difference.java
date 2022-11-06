public class Difference extends Menu{

    public double differenceOperation (double value1){
        return differenceOperationPrivate(value1);
    }
    private double differenceOperationPrivate (double value1){
        System.out.println("Введите вычитаемое");
        double value2 = scanner.nextDouble();
        return value1 - value2;
    }
}
