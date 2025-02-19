import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Student {

    // pola:
    private String name;
    private int id;
    private double grade;
    private List<Student> studentsList = new ArrayList<>();


    //konstruktor
    public Student(String name, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.studentsList = studentsList;
    }

    public Student() {

    }

    // 3 - gettery i settery (+metody)
    public String getName() {
        return name;
    }
    public List<Student> getStudentsList(){
        return studentsList;
    }
    public void displayStudentInfo(Student student) {
        System.out.println("Imie studenta: " + name);
        System.out.println("Indeks studenta: " + id);
        System.out.println("Ocena koncowa studenta: " + grade);


    }

    public  void studentAddToList(Scanner scanner) {
        System.out.println("Podaj imie i nazwisko studenta:");
        String name = scanner.next();
        scanner.nextLine();
        System.out.println("Podaj ocene koncowa studenta: ");
        double grade = scanner.nextDouble();
        studentsList.add(new Student(name, grade));

    }

    public  void studentRemoveFromList(Scanner scanner) {

        System.out.print("Nazwa studenta: ");
        String name = scanner.next();
        studentsList.removeIf(student -> student.name.equals(name));

    }

    @Override
    public String toString() {

        return name + grade;
    }


}
