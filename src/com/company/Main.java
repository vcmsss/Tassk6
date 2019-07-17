package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");

        double x = in.nextInt();



        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number 2:");

        double y = sc.nextInt();


        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number 3:");

        double z = scan.nextInt();

double S = (x+y+z)/3.0;
System.out.println("Среднее арифметическое: " + S);

        int value = (int) S;
        int A = value/2;
System.out.println("Среднее арифметическое, деленное на 2 без остатка: " + A);

if (A>3)
    System.out.println("Программа выполнена корректно");


    }

}