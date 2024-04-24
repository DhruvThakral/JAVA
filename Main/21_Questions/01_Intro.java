// //Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

// import java.util.Scanner;

// class Circle {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }

//     public double getRadius() {
//         return radius;
//     }

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double calculateArea() {
//         return Math.PI * radius * radius;
//     }

//     public double calculatePerimeter() {
//         return 2 * Math.PI * radius;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the radius: ");
//         double radius = scanner.nextDouble();
        
//         Circle circle = new Circle(radius);
        
//         System.out.println("Radius: " + circle.getRadius());
//         System.out.println("Area: " + circle.calculateArea());
//         System.out.println("Perimeter: " + circle.calculatePerimeter());
        
//         scanner.close();
//     }
// }

//JAVA program to print pattern

// *
// ***
// *****
// *******
// *********
// ***********
// *********
// *******
// *****
// ***
//  *


class LPU{
    public static void main(String[] args) {
        int n = 6;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
