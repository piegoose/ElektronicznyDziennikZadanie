import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
// mamy 3 sekcje
// 1 - pola

// 2 - konsturktory
// 3 - gettery i settery (+metody)

    // dodaj Studenta
public static void studentAdd(Scanner scanner, List<String> studentList) {
    System.out.println("Podaj imie i nazwisko studenta: ");
    String studentPD = scanner.nextLine();
    studentList.add(studentPD);
    System.out.println("Dodano Studenta: " + studentPD);
}
// usun studenta

    public static void deletingStudent(Scanner scanner, List<String> studentList) {
        System.out.println("Podaj studenta ktory ma byc usuniety: ");
        String personThrow = scanner.nextLine();
        studentList.remove(personThrow);
        System.out.println(studentList);
    }

}
