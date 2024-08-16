package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=====Caculator Shape Programmer=====");
        System.out.println("Please input side width of Rectangle:");
        int width = scan.nextInt();
        System.out.println("Please input length of Rectangle:");
        int length = scan.nextInt();
        System.out.println("Please input radius of Circle:");
        int radius = scan.nextInt();
        System.out.println("Please input side A of Triangle:");
        int sideA = scan.nextInt();
        System.out.println("Please input side B of Triangle:");
        int sideB = scan.nextInt();
        System.out.println("Please input side C of Triangle:");
        int sideC = scan.nextInt();

        System.out.println("------Rectangle------");
        System.out.println("Width: "+width);
        System.out.println("Length: "+length);
        Rectangle rectangle = new Rectangle(width,length);
        rectangle.printResult();

        System.out.println("------Circle------");
        System.out.println("Radius: "+width);
        Shape circle = new Circle(radius);
        circle.printResult();

        System.out.println("------Triangle------");
        System.out.println("SideA: "+sideA);
        System.out.println("SideB: "+sideB);
        System.out.println("SideC: "+sideC);
        Shape triangle = new Triangle(sideA,sideB,sideC);
        triangle.printResult();
    }
}