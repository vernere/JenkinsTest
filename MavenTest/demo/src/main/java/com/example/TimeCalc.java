package com.example;

import java.util.Scanner;

public class TimeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance ");
        double distance = sc.nextDouble();
        System.out.println("Enter the speed ");
        double speed =sc.nextDouble();
        System.out.println("Time to reach the destination " + calculateTime(distance, speed));
        sc.close();
    }

    public static double calculateTime(double x, double y) {
        return x / y;
    }
}
