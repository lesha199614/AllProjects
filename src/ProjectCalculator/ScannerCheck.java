package ProjectCalculator;

import java.util.Objects;

public class ScannerCheck {
    protected java.util.Scanner scanner = new java.util.Scanner(System.in);

    protected int scannerInt() {
        return scannerIntPrivate();
    }
    private int scannerIntPrivate() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }
    protected double scannerDouble() {
        return scannerDoublePrivate();
    }
    private double scannerDoublePrivate() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Введи валидное число");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    private String scannerLinePrivate() {
        String value = "default";
        System.out.println("Введи тип операции:");
        System.out.println("'+' для сложения");
        System.out.println("'-' для вычитания");
        System.out.println("'*' для умножения");
        System.out.println("'/' для деления");
        System.out.println("'0' для возврата в главное меню");
        while (!Objects.equals(value, "+") && !Objects.equals(value, "-") && !Objects.equals(value, "*") && !Objects.equals(value, "/") && !Objects.equals(value, "0")) {
            value = scanner.next();
        }
        return value;
    }
    protected String scannerLine() {
        return scannerLinePrivate();
    }
}
