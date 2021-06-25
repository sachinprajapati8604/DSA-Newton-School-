package com.company;

import java.util.Scanner;

//base class
class Animal{
    public static void print(){
        System.out.println("I am from animal");
    }
    public  static void Data(){
        System.out.println("I have four legs");
    }

}
class Cat extends Animal{
    public  static  void print(){
        System.out.println("I am cat class extended feature of Animal ");
    }
    public  static void voice(){
        System.out.println("My voice is 'meauw meauw '");
    }
}
//inherted class
public class OverRiding_demo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.print();
        Cat animal1= new Cat();
        animal1.print();
        animal.Data();
        animal1.voice();
        Animal animal3=new Cat();
        animal3.Data();
    }
}
