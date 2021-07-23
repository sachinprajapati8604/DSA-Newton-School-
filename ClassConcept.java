package com.company;

class Student {
    int id;
    String name;
    double marks;

    //make a constructor class
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String toString() {
        return ("Student id : " + this.getId() +
                " | Name : " + this.getName() +
                " | Marks obtained : " + this.getMarks());
    }

}

public class ClassConcept {
    public static void main(String[] args) {
        int i = 0;
        Student st = new Student(++i, "Sachin Prajapati", 100);
        Student st1 = new Student(++i, "Test", 98);
        System.out.println(st.toString());
        System.out.println(st1.toString());
    }


}
