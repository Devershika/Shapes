//DEVERSHIKA MOHANE
//23070126032
//AIML A2

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect Shape:");
            System.out.println("1. Rectangle\n2. Square\n3. Circle\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            
            switch (choice) {
                case 1:
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    Shape rectangle = new Rectangle(length, width);
                    displayShapeDetails(rectangle);
                    break;

                case 2:
                    System.out.print("Enter side of Square: ");
                    double side = scan.nextDouble();
                    Shape square = new Square(side);
                    displayShapeDetails(square);
                    break;

                case 3:
                    System.out.print("Enter radius of Circle: ");
                    double radius = scan.nextDouble();
                    Shape circle = new Circle(radius);
                    displayShapeDetails(circle);
                    break;
