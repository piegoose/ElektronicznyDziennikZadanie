import java.util.*;

public class Class {
    // 1 pola
   public static HashMap<String, List<String>> studentClasses = new LinkedHashMap<>();


    // 2 konstruktory


    // 3 Metody
    public static void sigingIN(int studentCount, Scanner scanner, List<String> studentList) {
        String studentPD;
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Podaj imie i nazwisko studenta: ");
            studentPD = scanner.nextLine();
            studentList.add(studentPD);                             // zapisywanie danych studenta do listy
        }
    }
    public static void selectClassA(Scanner scanner, Map<String, List<String>> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy A: ");
        String whichA = scanner.nextLine();
        studentClasses.get("Klasa A").add(whichA);
    }
    public static void selectClassB(Scanner scanner, Map<String, List<String>> studentClasses) {
        System.out.println("Podaj imie i nazwisko studenta ktory ma byc dodany do klasy B: ");
        String whichB = scanner.nextLine();
        studentClasses.get("Klasa B").add(whichB);
    }
}