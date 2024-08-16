package model;

//Parent class
public abstract class Shape {
    protected String color; //private OR public

    public Shape() {
    }

    public abstract void printResult();
    public abstract double getPerimeter();
    public abstract double getArea();

    public Shape(String color) {
        this.color = color;
    }
}
