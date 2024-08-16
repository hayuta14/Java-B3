package model;

public class Rectangle extends Shape {

    int width;
    int length;

    public Rectangle(int width, int length, String color) {
        super(color); //call constructor of Parent / super class

        this.width = width;
        this.length = length;
        //this.color = color;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {

    }

    @Override
    public void printResult() {
        System.out.println("Area: "+ this.getArea());
        System.out.println("Perimeter: "+ this .getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return (this.width+this.length)*2;
    }

    @Override
    public double getArea() {
        return (this.width*this.length);
    }
}
