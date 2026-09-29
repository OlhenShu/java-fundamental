package com.softserve.academy.module1;
import java.util.Scanner;
/**
 * The flower bed is circular. Write a program that reads the radius of the circle from the console, calculates the perimeter (circumference) and the area of the flower bed, and prints the results to the console.

Steps:

Create a class named FlowerBedCalculator.
In the main() method, declare a variable int radius and prompt the user to enter the radius of the flower bed from the console.
Calculate the perimeter using the formula perimeter = 2 * Math.PI * radius (store it in a double).
Calculate the area using the formula area = Math.PI * radius * radius (store it in a double).
Print the calculated perimeter and area to the console.
Example:

Enter the radius: 5
Perimeter: 31.41592653589793
Area: 78.53981633974483
 * ScannerExample
 */
public class ScannerExample {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the radius: ");
       int radius = scanner.nextInt();
       double perimeter = 2 * Math.PI * radius;
       double area = Math.PI * radius * radius;
       System.out.println("Perimeter: " + perimeter);
       System.out.println("Area: " + area);
       scanner.close();
    }
}
