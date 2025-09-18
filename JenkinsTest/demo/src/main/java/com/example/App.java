package com.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class App {
    public static int degreeToYears(String degree) throws NullPointerException, Exception {
        Map<String, Integer> degreeMap = new HashMap<String, Integer>() {{
            put("bsc", 4);
            put("msc", 6);
            put("phd", 8);
        }};

        if (degree == null) {
            throw new NullPointerException("Invalid degree");
        }

        if (degree.length() != 3) {
            throw new IllegalArgumentException("Invalid degree: " + degree);
        }

        return degreeMap.get(degree.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input degree (BSc, MSc, PhD): ");
        String input = scanner.next();

        try {
            int years = degreeToYears(input);
            System.out.println(years);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}