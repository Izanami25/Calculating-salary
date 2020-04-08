package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ваш оклад в KZ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double x = a*0.1;
        int max = 42500 *50;
        double y = (a-x-42500)*0.1;
        double salary = a - x - y;
        System.out.println("Ваш обязательный пенсионный взнос: " + (x));
        System.out.println("Максимальный обязательный пенсионный взнос: " + (max));
        System.out.println("Индивидуальный подоходный налог: " + y);
        System.out.println("Ваша зарплата на руки: " + salary);
    }
}
