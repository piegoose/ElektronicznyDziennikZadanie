import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Student {

    // pola:
    private String name;
    private int id;
    private double grade;


    //konstruktor
    public Student(String name, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;

    }

    public Student() {

    }

    // 3 - gettery i settery (+metody)
    public String getName() {
        return name;
    }

    public void displayStudentInfo(Student student) {
        System.out.println("Imie studenta: " + name);
        System.out.println("Indeks studenta: " + id);
        System.out.println("Ocena koncowa studenta: " + grade);


    }

    @Override
    public String toString() {

        return name + grade;
    }


}
