package Transport;

import java.util.Scanner;

public class Transport {
    private int Power;
    private int maxSpeed;
    private int mass;
    private String brand;
    Scanner scanner = new Scanner(System.in);

    public Transport(int power, int maxSpeed, int mass, String brand) {
        Power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        this.brand = brand;
    }

    private double convertToKw(int power) {
        double kwPower = getPower() * 0.74d;
        return kwPower;
    }

    private void printInfoPrivate() {
        System.out.println(getBrand());
        System.out.println("Мощность: " + getPower() + "л.с. (" + convertToKw(getPower())+" кВ)");
        System.out.println("Масса: " + getMass() + " кг");
        System.out.println("Максимальная скорость: " + getMaxSpeed() + " км/ч");

    }

    public void printInfo() {
        printInfoPrivate();
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int power) {
        Power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
