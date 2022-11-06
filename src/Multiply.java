public class Multiply extends Menu{

    public double multiplyOperation (double value1){
        return multiplyOperationPrivate(value1);
    }
    private double multiplyOperationPrivate (double value1){
        System.out.println("Введите множитель");
        double value2 = scanner.nextDouble();
        return value1 * value2;
    }
}
