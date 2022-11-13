package ProjectCalculator;

import java.util.ArrayList;

public class Menu extends ScannerCheck{
//    private OpertionsHistory history = new OpertionsHistory();
    private HistoryArrayList historyArrayList = new HistoryArrayList();
    private ScannerCheck scannerCheck = new ScannerCheck();

    protected void openMenu() {
        openMenuPrivate();
    }

    private void openMenuPrivate() {
        System.out.println("Меню:");
        System.out.println("1: Подсчет математической операции");
        System.out.println("2: История результатов");
        System.out.println("3: Выход");
        int userValue = scannerCheck.scannerInt();
        while (userValue < 1 || userValue > 3) {
            System.out.println("Данный пункт меню еще не доступен");
            userValue = scannerCheck.scannerInt();
        }
        if (userValue == 1) {
            startCalculation();
        } else if (userValue == 2){
            historyArrayList.showHistory();
            //history.showHistory();
            openMenuPrivate();
        } else {
            System.out.println("До свидания");
        }
    }

    private void startCalculation() {
        System.out.println("Введи первое число");
         double value1 = scannerCheck.scannerDouble();
        startOperation(value1);
    }

    private void startOperation(double value1) {
        double result = 0d;
        String userOperation = scannerCheck.scannerLine();
        switch (userOperation) {
            case "0":
                openMenu();
                break;
            case "+":
                Sum sum = new Sum();
                result = sum.sumOperation(value1);
                break;
            case "-":
                Difference difference = new Difference();
                result = difference.differenceOperation(value1);
                break;
            case "*":
                Multiply multiply = new Multiply();
                result = multiply.multiplyOperation(value1);
                break;
            case "/":
                Divide divide = new Divide();
                result = divide.divideOperation(value1);
                break;
        }
        System.out.println("Результат " + result);
        historyArrayList.addValue(result);
//        history.addValue(result);
        nextOperation(result);
    }

    private void nextOperation(double result) {
        System.out.println("Продолжить?");
        System.out.println("1 - продолжаем работать с числом, 2 - сбросить результат, 3 - вернуться в меню");
        int userChoice = scannerCheck.scannerInt();
        if (userChoice == 1) {
            startOperation(result);
        } else if (userChoice == 2) {
            startCalculation();
        } else if (userChoice == 3) {
            openMenu();
        }
    }
}