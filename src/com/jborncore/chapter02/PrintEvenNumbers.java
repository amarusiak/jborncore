package com.jborncore.chapter02;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int boundaryNumber = requestNumber();
        printEvenNumbers(boundaryNumber);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        return scanner.nextInt();
    }

    static void printEvenNumbers(int boundaryNumber) {
        for (int tmp = 0; tmp <= boundaryNumber; tmp++) {
            if (tmp % 2 == 0) {
                System.out.print(tmp + " ");
            }
        }
    }
}
