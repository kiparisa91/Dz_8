package com.company;

public class Main {

    public static int getYear(int year)  {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        return year;
    }

    public static void installApllication(int clientDeviceYear, int clientOs) {
        if (clientDeviceYear < 2022 && clientOs == 0) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (clientDeviceYear < 2022 && clientOs == 1) {
            System.out.println("Установите облегченную версию для Android");
        } else if (clientDeviceYear >=2022 && clientOs == 0){
            System.out.println("Приложение устанавливается для iOS");
        } else if (clientDeviceYear >=2022 && clientOs == 1) {
            System.out.println("Приложение устанавливается для Android");
        }
    }

    public static void calculateDistance(int delyveryDistance) {
        if (delyveryDistance < 20) {
            System.out.println("Потребуется один день");
        } else {
            System.out.println("Потребуется дней: " + ((delyveryDistance-21) / 40+2));
        }
    }

    public static void main(String[] args) {
	// write your code here
        //Задача1
        int year = 2021;
        getYear(year);


        //Задача2
        int clientDeviceYear = 2022;
        int clientOs = 0;
        installApllication(clientDeviceYear, clientOs);


        //Задача3
        int delyveryDistance = 95;
        calculateDistance(delyveryDistance);

    }
}
