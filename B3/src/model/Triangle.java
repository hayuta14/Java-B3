package model;

public class Triangle extends Shape{
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printResult() {
        System.out.println("Area: "+ this.getArea());
        System.out.println("Perimeter: "+ this .getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (this.sideA+this.sideB+this.sideC);
    }

    @Override
    public double getArea() {
        double halfPerimeter = this.getPerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
    }
}
