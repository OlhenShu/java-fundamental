package com.softserve.academy.module1;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("What is your name? ");
       String name = scanner.nextLine();
       System.out.println("Hello, " + name);
       scanner.close();
    }
}
