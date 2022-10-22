package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hyundai {
    List<Car> carsList;

    public Hyundai(List<Car> carsList) {
        this.carsList = carsList;
    }

    //initialization = declaration + assignment;
    private static Car makeCar(Scanner scanner) {
        //declaration
        String wheelsType, engineType, color, brakesType;
        int makingPrice, salePrice, profit, maxSpeed, year;
        //assignment
        System.out.println("welcome in  company system");
        System.out.print("Enter wheels type: ");    wheelsType = scanner.nextLine();
        System.out.print("Enter engine type: ");    engineType = scanner.nextLine();
        System.out.print("Enter color: ");          color = scanner.nextLine();
        System.out.print("Enter brakes type: ");    brakesType = scanner.nextLine();
        System.out.print("Enter making price: ");   makingPrice = scanner.nextInt();
        System.out.print("Enter sale price: ");     salePrice = scanner.nextInt();
        System.out.print("Enter max speed: ");      maxSpeed = scanner.nextInt();
        System.out.print("Enter year form 2017 to 2022  enter hear: ");           year = scanner.nextInt();
        scanner.nextLine();
        return new Car(wheelsType,engineType,color, brakesType,
                makingPrice,salePrice, maxSpeed, year);
    }

    public static List<Car> makeCarsList(Scanner scanner) {
        List<Car> list = new ArrayList<>();
        while (true) {
            list.add(makeCar(scanner));
            System.out.print("Do you need more cars    yes    or   no(or any word) \n" +
                    "->");
            if (!scanner.nextLine().equals("yes")) break;
        }
        return list;
    }

    public static void printAllCars(List<Car> list) {
        System.out.println(mainColumn());
        for(Car car : list) {
            System.out.println("____________________________________________________________________________________________________________________________________________");
            System.out.println(carsFormat(car));
        }
        System.out.println("____________________________________________________________________________________________________________________________________________");
        System.out.print("all cars ->"+Car.howManyCar
                +"\n2017 ->" + Car._2017
                +"\n2018 ->" + Car._2018
                +"\n2019 ->" + Car._2019
                +"\n2020 ->" + Car._2020
                +"\n2021 ->" + Car._2021
                +"\n2022 ->" + Car._2022);
    }

    private static String mainColumn() {
        return "    wheels type    |    engine type    |    color    |    brakes    |    making price    |    " +
                "sale price    |    max speed    |    asphalt    |    off-road    |    model    |    profit";
    }

    private static String carsFormat(Car car) {
        return "    "+car.getWheelsType()+"    |    "+car.getEngineType()+"    |    "+car.getColor()+"    |    "+car.getBrakesType()+"    |    " +
                car.getMakingPrice()+"   |    "+car.getSalePrice()+"   |    "+car.getMaxSpeed()+"    |    "+car.getAsphaltSpeed()+"    |    " +
                car.getOffRoadSpeed()+"    |    "+car.getYear()+ "|    "+car.getProfit();
    }



    public List<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }
}
