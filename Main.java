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

                case 4:
                    System.out.print("Enter radius of Sphere: ");
                    double sphereRadius = scan.nextDouble();
                    Shape sphere = new Sphere(sphereRadius);
                    displayShapeDetails(sphere);
                    break;

                case 5:
                    System.out.print("Enter radius of Cylinder: ");
                    double cylinderRadius = scan.nextDouble();
                    System.out.print("Enter height of Cylinder: ");
                    double cylinderHeight = scan.nextDouble();
                    Shape cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    displayShapeDetails(cylinder);
                    break;

                case 6:
                    System.out.print("Enter side of Equilateral Pyramid: ");
                    double pyramidSide = scan.nextDouble();
                    System.out.print("Enter height of Equilateral Pyramid: ");
                    double pyramidHeight = scan.nextDouble();
                    Shape pyramid = new EquilateralPyramid(pyramidSide, pyramidHeight);
                    displayShapeDetails(pyramid);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scan.close();
    }

    private static void displayShapeDetails(Shape shape) {
        System.out.println("Area of " + shape.getClass().getSimpleName() + " is: " + shape.calculateArea());
        System.out.println("Perimeter of " + shape.getClass().getSimpleName() + " is: " + shape.calculatePerimeter());
        System.out.println("Volume of " + shape.getClass().getSimpleName() + " is: " + shape.calculateVolume());
    }
}
