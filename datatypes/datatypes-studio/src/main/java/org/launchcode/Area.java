package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double area = calculateArea(radius);

        System.out.println("The area of the circle with a radius of " + radius + " is: " + area);
    }
    private static double calculateArea(double radius) {
        return Circle.getArea(radius);
    }
}
