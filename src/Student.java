import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    // pola:


    public String name;
    public int id;
    public double grade;
    public static List<Student> studentsList = new ArrayList<>();

    //konstruktory:

    public Student(String name, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
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

    public static void studentAddToList(Scanner scanner) {
        System.out.println("Podaj imie i nazwisko studenta:");
        String name = scanner.next();
        scanner.nextLine();
        //System.out.println("Podaj numer indeksu ");
        System.out.println("Podaj ocene koncowa studenta: ");
        double grade = scanner.nextDouble();
        studentsList.add(new Student(name, grade));

    }

    public static void studentRemoveFromList(Scanner scanner) {

        System.out.print("Nazwa studenta: ");
        String name = scanner.next();
        studentsList.removeIf(student -> student.name.equals(name));

    }

    @Override
    public String toString() {
        return name + grade;
    }


}
