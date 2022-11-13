package ProjectCalculator;

public class MyExceptions extends Exception{
    public MyExceptions() {
    }

    public void nullString(){
        System.out.println("Строка пустая");
        System.exit(123);
    }

    public void divideZero(){
        System.out.println("Нельзя делить на ноль");
    }
    public void invalidScannerResult(){
        System.out.println("Введи валидное значение");
    }
}
