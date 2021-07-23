import java.lang.*;
import java.util.*;


public class compartor {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student("abc", 10 - i));
        }
        Collections.sort(students,
                (student1, student2) -> Integer.compare(student1.getMarks(), student2.getMarks()));

        for (int i = 0; i < 10; i++) {
            System.out.println(students.get(i).getMarks());
        }
    }
}

//POJO plain old java object

class StudentCmp implements Comparator<Student> {
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getMarks(), student1.getMarks());
    }
}

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return this.marks;
    }
}