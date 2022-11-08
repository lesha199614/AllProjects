package ProjectCalculator;

import java.util.Objects;
import java.util.Scanner;

public class ScannerCheck {
    protected java.util.Scanner scanner = new java.util.Scanner(System.in);


    protected int scannerInt(){
        return scannerIntPrivate();
    }
    private int scannerIntPrivate() {
        boolean isEnter = false;
        int value = 0;
        while (!isEnter) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                isEnter = true;
            } else {
                System.out.println("Введи валидное число");
                scanner.nextLine();
            }
        }
        return value;
    }
    protected double scannerDouble(){
        return scannerDoublePrivate();
    }
    private double scannerDoublePrivate() {
        boolean isEnter = false;
        double value = 0;
        while (!isEnter) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                isEnter = true;
            } else {
                System.out.println("Введи валидное число");
                scanner.nextLine();
            }
        }
        return value;
    }

    private String scannerLinePrivate(){
        String value = "default";
        System.out.println("Введи тип операции:");
        System.out.println("'+' для сложения");
        System.out.println("'-' для вычитания");
        System.out.println("'*' для умножения");
        System.out.println("'/' для деления");
        System.out.println("'0' для возврата в главное меню");
        while (!Objects.equals(value, "+") && !Objects.equals(value, "-") && !Objects.equals(value, "*") && !Objects.equals(value, "/") && !Objects.equals(value, "0")) {
            value = scanner.nextLine();
        }
        return value;
    }
    protected String scannerLine(){
        return scannerLinePrivate();
    }
}
