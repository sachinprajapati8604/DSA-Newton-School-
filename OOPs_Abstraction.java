package com.company;

public class OOPs_Abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle("blue", 5.6);
        Shape shape1 = new Rectangle("red", 5.9, 7.9);
        System.out.println("color is  : " + shape.getColor() + " , Area is : " + shape.area() + " , circumference is : " + shape.circumference());
        System.out.println("color is  : " + shape1.getColor() + " , Area is : " + shape1.area() + " , circumference is : " + shape1.circumference());


    }
}

abstract class Shape {
    String color;

    abstract double area();

    abstract double circumference();

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;

    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double circumference() {
        return 2 * (length * width);
    }
}
