import java.util.Objects;

public class Menu {
    private double value1;
    private double result;
    protected ScannerCheck scannerCheck = new ScannerCheck();


    protected void openMenu() {
        openMenuPrivate();
    }

    private void openMenuPrivate() {
        System.out.println("Меню:");
        System.out.println("1: Подсчет математической операции");
        System.out.println("2: Выход");
        int userValue = scannerCheck.scannerInt();
        while (userValue < 1 || userValue > 2) {
            System.out.println("Данный пункт меню еще не доступен");
            userValue = scannerCheck.scannerInt();
        }
        if (userValue == 2) {
            System.out.println("До свидания");
        } else {
            startCalculation();
        }
    }

    private void startCalculation() {
        System.out.println("Введи первое число");
        value1 = scannerCheck.scannerDouble();
        startOperation();
    }

    private void startOperation() {
        String userOperation = scannerCheck.scannerLine();
        switch (userOperation) {
            case "0":
                openMenu();
                break;
            case "+":
                Sum sum = new Sum();
                result = sum.sumOperation(value1);
                System.out.println("Результат " + result);
                nextOperation();
                break;
            case "-":
                Difference difference = new Difference();
                result = difference.differenceOperation(value1);
                System.out.println("Результат " + result);
                nextOperation();
                break;
            case "*":
                Multiply multiply = new Multiply();
                result = multiply.multiplyOperation(value1);
                System.out.println("Результат " + result);
                nextOperation();
                break;
            case "/":
                Divide divide = new Divide();
                result = divide.divideOperation(value1);
                System.out.println("Результат " + result);
                nextOperation();
                break;
        }
    }

    private void nextOperation() {
        System.out.println("Продолжить?");
        System.out.println("1 - продолжаем работать с числом, 2 - сбросить результат, 3 - вернуться в меню");
        int userChoice = scannerCheck.scannerInt();
        if (userChoice == 1) {
            value1 = result;
            startOperation();
        } else if (userChoice == 2) {
            startCalculation();
        } else if (userChoice == 3) {
            openMenu();
        }
    }


}