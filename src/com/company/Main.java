package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Hyundai hyundai = new Hyundai(Hyundai.makeCarsList(scanner));
        Hyundai.printAllCars(hyundai.getCarsList());
    }
}
