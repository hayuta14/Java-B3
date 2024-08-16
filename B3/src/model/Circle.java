package model;

public class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void printResult() {
        System.out.println("Area: "+ this.getArea());
        System.out.println("Perimeter: "+ this .getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return Math.PI*(2*this.radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
