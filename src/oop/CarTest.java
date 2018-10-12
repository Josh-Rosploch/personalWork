package oop;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		Car momsCar = new Car();
		Car dadsCar = new Car();
		Car kidCar = new Car();
		Scanner input = new Scanner(System.in);
		System.out.println("How far did dad drive his car?");
		dadsCar.driveCar(input.nextDouble());
		System.out.println("How far did mom drive to get to the gas station and how much gas did she add?");
		momsCar.driveCar(input.nextDouble());
		momsCar.fillGas(input.nextDouble());
		System.out.println("How far did kid drive his car?");
		kidCar.driveCar(input.nextDouble());
		System.out.println("How far did dad drive to get to the gas station and how much gas did he add?");
		dadsCar.driveCar(input.nextDouble());
		dadsCar.fillGas(input.nextDouble());
		System.out.println("----------\nStats of moms car:\nmpg = " + momsCar.mPG + "\nodometer = " + momsCar.odometer
				+ "\nMax gas = " + momsCar.maxGas + "\nTotal gas = " + momsCar.totalGas);
		System.out.println("----------\nStats of dads car:\nmpg = " + dadsCar.mPG + "\nodometer = " + dadsCar.odometer
				+ "\nMax gas = " + dadsCar.maxGas + "\nTotal gas = " + dadsCar.totalGas);
		System.out.println("----------\nStats of kid car:\nmpg = " + kidCar.mPG + "\nodometer = " + kidCar.odometer
				+ "\nMax gas = " + kidCar.maxGas + "\nTotal gas = " + kidCar.totalGas + "\n----------");
		input.close();
	}
}