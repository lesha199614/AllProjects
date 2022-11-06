import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private double value1;
    private double result;
    protected Scanner scanner = new Scanner(System.in);

    public void openMenu(){
        openMenuPrivate();
    }
    private void openMenuPrivate() {
        int userValue = 0;
        System.out.println("Меню:");
        System.out.println("1: Подсчет математической операции");
        System.out.println("2: Выход");
        while (userValue <= 0 || userValue >= 3) {
            userValue = scanner.nextInt();
        }
        if (userValue == 2) {
            System.out.println("До свидания");
        } else {

            startCalculation();
        }
    }

    private void startCalculation(){
        System.out.println("Введи первое число");
        value1 = scanner.nextDouble();
        startOperation();
    }
    private void startOperation() {
        String userOperation = "default";
        System.out.println("Введи тип операции:");
        System.out.println("'+' для сложения");
        System.out.println("'-' для вычитания");
        System.out.println("'*' для умножения");
        System.out.println("'/' для деления");
        System.out.println("'0' для возврата в главное меню");
        while (!Objects.equals(userOperation, "+") && !Objects.equals(userOperation, "-") && !Objects.equals(userOperation, "*") && !Objects.equals(userOperation, "/") && !Objects.equals(userOperation, "0")) {
            userOperation = scanner.nextLine();
        }
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
    private void nextOperation (){
        System.out.println("Продолжить?");
        System.out.println("1 - продолжаем работать с числом, 2 - сбросить результат, 3 - вернуться в меню");
        int userChoice = scanner.nextInt();
        if(userChoice == 1){
            value1 = result;
            startOperation();
        } else if (userChoice == 2) {
            startCalculation();
        } else if (userChoice == 3) {
            openMenu();
        }
    }
}