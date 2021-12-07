package com.hw1part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String city = "Moscow";
        int population = 17000000;
        float unemployed = 7.7F;

        char section = 'F';
        short seat = 123;
        short cost = 3000;

        String name = "Andrey";
        byte age = 34;
        short height = 177;

        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'C';
        short number = 555;
        short weight = 1550;

        String company = "Apple";
        long income = 100500000000L;
        double market = 2.154;

        char rhesus = '+';
        byte group = 3;
        float bloodShare = 20.1F;

        String university = "MIT";
        int students = 30000;
        float expelledStudents = 10.15F;

        char filmRate = '7';
        int copies = 320000;
        float rate = 8.8F;

        String brand = "H&M";
        int production = 10000000;
        float sales = 20.25F;

        char category = 98;
        long code = 1234567890123L;
        float buyer30 = 40.12F;

        System.out.println("1: " + "city: " + city + ", population: " + population + ", unemployed: " + unemployed);
        System.out.println("2: " + "section: " + section + ", seat: " + seat + ", cost: " + cost);
        System.out.println("3: " + "name: " + name + ", age: " + age + ", height: " + height);
        System.out.println("4: " + "car number: " + char1 + number + char2 + char3 + ", weight: " + weight);
        System.out.println("5: " + "company: " + company + ", income: " + income + ", market: " + market);
        System.out.println("6: " + "rhesus: " + rhesus + ", group: " + group + ", blood share: " + bloodShare);
        System.out.println("7: " + "university: " + university + ", students: " + students + ", expelled students: " + expelledStudents);
        System.out.println("8: " + "film rate: " + filmRate + ", copies: " + copies + ", rate: " + rate);
        System.out.println("9: " + "brand: " + brand + ", production: " + production + ", sales: " + sales);
        System.out.println("10: " + "category: " + category + ", code: " + code + ", buyer30: " + buyer30);
        System.out.printf("Hello,%s!", "World");

        Scanner in = new Scanner(System.in);
        String num = in.next();
        System.out.println(num + "<<<");
    }
}
