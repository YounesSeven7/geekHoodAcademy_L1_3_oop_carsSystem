package com.company;

public class Car {
    public static int howManyCar;
    public static int _2017;
    public static int _2018;
    public static int _2019;
    public static int _2020;
    public static int _2021;
    public static int _2022;

    private String wheelsType, engineType, color, brakesType;
    private int makingPrice, salePrice, profit, maxSpeed, asphaltSpeed, offRoadSpeed, year;

    public Car(String wheelsType, String engineType, String color, String brakesType,
               int makingPrice, int salePrice, int maxSpeed, int year) {
        this.wheelsType = wheelsType;
        this.engineType = engineType;
        this.color = color;
        this.brakesType = brakesType;
        this.makingPrice = makingPrice;
        this.salePrice = salePrice;
        this.profit = salePrice - makingPrice;
        this.maxSpeed = maxSpeed;
        setYear(year);
        howManyCar++;
        setAsphaltSpeed(maxSpeed);
        setOffRoadSpeed(maxSpeed);
    }

    public String getWheelsType() {
        return wheelsType;
    }

    public void setWheelsType(String wheelsType) {
        this.wheelsType = wheelsType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrakesType() {
        return brakesType;
    }

    public void setBrakesType(String brakesType) {
        this.brakesType = brakesType;
    }

    public int getMakingPrice() {
        return makingPrice;
    }

    public void setMakingPrice(int makingPrice) {
        this.makingPrice = makingPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public int getAsphaltSpeed() {
        return asphaltSpeed;
    }

    public void setAsphaltSpeed(int maxSpeed) {
        this.asphaltSpeed = (maxSpeed*80)/100;
    }

    public int getOffRoadSpeed() {
        return offRoadSpeed;
    }

    public void setOffRoadSpeed(int maxSpeed) {
        this.offRoadSpeed = (maxSpeed*60)/100;
    }

    public void setYear(int year) {
        switch (year) {
            case 2017:
                _2017++;
                break;
            case 2018:
                _2018++;
                break;
            case 2019:
                _2019++;
                break;
            case 2020:
                _2020++;
                break;
            case 2021:
                _2021++;
                break;
            case 2022:
                _2022++;
                break;
        }
        this.year = year;
    }
}
